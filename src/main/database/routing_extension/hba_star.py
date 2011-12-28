#!usr/bin/python
# Filename: hba_star.py

version = '0.1'

#In fact we don't need this
#But in case you try to execute this module outside postgres, you will know why you can't do it
import plpy
import operator
import heapq

heuristic_plan = -1
adj_plan = -1

#The heuristic used by A* is the euclidean length
def hba_heuristic(source, target, tablename='vertex', col_geom='geom', col_id='id'):
  if heuristic_plan == -1:
    global heuristic_plan
    heuristic_plan = plpy.prepare('select st_distance(a.' + col_geom + ', b.' + col_geom + ') as cost from ' + tablename + ' as a, ' + tablename + ' as b where a.' + col_id + ' = $2 and b.' + col_id + ' = $3', ['text', 'integer', 'integer', 'text', 'text'])
  return plpy.execute(heuristic_plan, [col_geom, source, target, tablename, col_id], 1)[0]['cost']

#Final procedure
#Once we have the two partial paths, we build the definitive path
def hba_buildPath(ps, pt, m, source, target):
  #Return variable
  res = []

  current = m

  while current != source:
   res.append([int(ps[current][1]['id']), ps[current][1]['geom'], ps[current][1]['name'], ps[current][1]['cost']])
   current = int(ps[current][0])

  res.reverse()

  current=m

  while current != target:
   res.append([int(pt[current][1]['id']), pt[current][1]['geom'], pt[current][1]['name'], pt[current][1]['cost']])
   current = int(pt[current][0])

  return res

#The step cost is the cost of the edge
def hba_stepcost(row):
  if row is None:
    return float('inf')  
  return row['cost']

#Candidates to be the next node
#The function returns edges
def hba_adj(source, p, tablename='routing', col_geom='geom', col_edge='id', col_cost='cost', col_source='source', col_target='target', col_revc='reverse_cost', col_cat='category', col_name='name', col_rule='rule'):
  #TODO falta meter los rules
  if adj_plan == -1:
    global adj_plan
#    adj_plan = plpy.prepare('(select distinct reverse(' + col_geom + ') as geom, ' + col_edge + ' as id, ' + col_revc + ' as cost, ' + col_source + ' as target, ' + col_cat + ' as category, ' + col_name + ' as name from ' + tablename + ' where ' + col_target + '  = $1 and ' + col_revc + ' <> \'Infinity\' and not ' + col_edge + ' in (select ' + col_rule + '::numeric from ' + tablename + ' r where r.' + col_edge + ' = $2 and ' + col_rule + ' <> \'\')) union all (select distinct ' + col_geom + ' as geom, ' + col_edge + ' as id, ' + col_cost + ' as cost, ' + col_target + ' as target, ' + col_cat + ' as category, ' + col_name + ' as name from ' + tablename + ' where ' + col_source + ' = $1 and ' + col_cost + ' <> \'Infinity\' and ' + col_edge + ' not in (select ' + col_rule + '::numeric from ' + tablename + ' r where r.' + col_edge + ' = $2 and ' + col_rule + ' <> \'\'))', ['integer', 'Numeric'])
#  try:
#    id = p[source][1]['id']
#    plpy.info(id)
#  except:
#    id = None 

#  return plpy.execute(adj_plan, [source, id])

    adj_plan = plpy.prepare('(select distinct reverse(' + col_geom + ') as geom, ' + col_edge + ' as id, ' + col_revc + ' as cost, ' + col_source + ' as target, ' + col_cat + ' as category, ' + col_name + ' as name from ' + tablename + ' where ' + col_target + '  = $1 and ' + col_revc + ' <> \'Infinity\') union all (select distinct ' + col_geom + ' as geom, ' + col_edge + ' as id, ' + col_cost + ' as cost, ' + col_target + ' as target, ' + col_cat + ' as category, ' + col_name + ' as name from ' + tablename + ' where ' + col_source + ' = $1 and ' + col_cost + ' <> \'Infinity\')', ['integer'])
  return plpy.execute(adj_plan, [source])


def hba_bestNext(ol):
  cost_tmp = float('inf')
  #x <- node with smallest f-value
  for k,v in ol.items():
    if cost_tmp > v:
      x = k
  return x

def hba_process_y(adj, p, cat, d, ol, cl, x, target, vertex_tablename, col_vertex_geom, col_edge, already_processed=[]):
  for y in adj:
    y_id = y['target']
    #Maybe we have reached this vertex before, on a better way
    if not y['id'] in already_processed and hba_stepcost(y) != float('inf') and y['category'] <= cat:
      already_processed.append(y['id'])
      #Link is of current category or better
      cost = d[x] + hba_stepcost(y)
      if (not(y_id in ol) and not(y_id in cl)) or cost < d[y_id]:
        cat = hba_update_y(x, y, y_id, d, p, cat, cl, ol, cost, target, vertex_tablename, col_vertex_geom, col_edge)
 #  if len(already_processed) == 0 and cat <= 8:
 #   hba_process_y(adj, p, cat + 1, d, ol, cl, x, target, vertex_tablename, col_vertex_geom, col_edge, already_processed)

def hba_update_y(x, y, y_id, d, p, cat, cl, ol, cost, target, vertex_tablename, col_vertex_geom, col_edge):
  #Update y
  d[y_id] = cost
  p[y_id] = [x, y]
  if (y_id in cl):
    cl.remove(y_id)
  ol[y_id] = cost + hba_heuristic(y_id, target, vertex_tablename, col_vertex_geom, col_edge)
  return min(cat, y['category'])

#A* function, but just one step
def hba_astar(source, target, ol, cl, cl2, cat, d, p, tablename='routing', col_geom='geom', col_edge='id', col_cost='cost', col_revc='reverse_cost', col_source='source', col_target='target', vertex_tablename='vertex', col_cat='category', col_vertex_geom='geom', col_name='name', col_rule='rule'):
 
  #If we don't have open candidates...
  if len(ol) == 0:
    return 0
 
  if len(ol) > 0:
    #x <- node with smallest f-value
    x = hba_bestNext(ol)

    #We move through the next best option:
    cl.append(x)
    del ol[x]

    #Have we just found the middle point?
    if (x == target or x in cl2):
      return x

    #Next candidates
    adj = hba_adj(x, p,tablename, col_geom, col_edge, col_cost, col_source, col_target, col_revc, col_cat, col_name, col_rule)

    #Forever alone
    if adj is None:
      plpy.error("This vertex is alone")

    #For each candidate
    hba_process_y(adj, p, cat, d, ol, cl, x, target, vertex_tablename, col_vertex_geom, col_edge)
  
  #Return false, we still have to loop more
  return 0

#Public function
#Implements HBA* algorithm
def hba_star(source, target, tablename='routing', col_edge='id', col_cost='cost', col_revc='reverse_cost', col_rule='rule', col_source='source', col_target='target', col_geom='the_geom', col_name='name', col_cat='category', vertex_tablename='vertex', col_vertex_geom='geom'):
  
  #Closed Lists (backward and forward)
  clf = []
  clb = []

  #Open Lists (backward and forward)
  #Candidate nodes from which we want to continue calculating
  #Every node (key) contains (value) its estimated (heuristic) cost till the target
  olf = {}
  olb = {}
  
  #Total cost (backward and forward)
  #For every node, globally, its lowest cost from source/target
  d = {}
  d[target] = 0
  d[source] = 0

  #Predecessor array (backward and forward)
  #For every node, which is its previous node (related to d[])
  ps = {}
  pt = {}

  #Current category of nodes (source and target)
  cats = float('inf')
  catt = float('inf')

  #Current category of search (backward and forward)
  catf = float('inf')
  catb = float('inf')

  #Initial values
  olf[source] = d[source] + hba_heuristic(source, target, vertex_tablename, col_vertex_geom, col_edge)
  olb[target] = d[target] + hba_heuristic(target, source, vertex_tablename, col_vertex_geom, col_edge)

  #Star two-sided A* search
  frontsearch = 1
  backsearch = 1

  m = -1
  m1 = -1
  m2 = -1

  #We try A* step by step until the two paths collided
  while (frontsearch and backsearch):
    if (catf >= catb and frontsearch):
      m1 = hba_astar(source, target, olf, clf, clb, catf, d, ps, tablename, col_geom, col_edge, col_cost, col_revc, col_source, col_target, vertex_tablename, col_cat, col_vertex_geom, col_name, col_rule)
      frontsearch = not m1 and len(olf) > 0
    if (catb >= catf and backsearch):
      m2 = hba_astar(target, source, olb, clb, clf, catb, d, pt, tablename, col_geom, col_edge, col_revc, col_cost, col_source, col_target, vertex_tablename, col_cat, col_vertex_geom, col_name, col_rule)
      backsearch = not m2 and len(olb) > 0

  m = m1
  if m <= 0 :
    m = m2

  if m == 0:
    plpy.error("No path found")

  #Now, get the result
  return hba_buildPath(ps, pt, m, source, target)


# End of hba_star.py

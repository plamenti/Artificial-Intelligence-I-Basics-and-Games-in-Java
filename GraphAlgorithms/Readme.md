# Graph Algorithms

## Breadth First Search

### Usage:
* In artificial intelligence / machine learning it can prove to be very important: robots can discover the surrounding more easily with BFS than DFS
* It is also very important in maximum flow: Edmonds-Karp algorithm uses BFS for finding augmenting paths
* In garbage collecting
* Serialization - deserialization of a tree like structures

## Depth First Search
### Usage:
* Topological ordering
* Detecting cycles
* Generating mazes or finding way out of a maze

## Iterative deepening Depth First Search
### Usage:
* Very important in AI and robotics
* It visits the nodes in the search tree in the same order as DFS, but the cumulative order in which the nodes are first visited is effectively BFS
* Keep going deeper and deeper in the given tree with DFS on each iteration
* The time complexity of IDDFS in well-balanced trees works out to be the same as DFS
* **Disadvantage** - we keep recomputing the same problem over and over again. But this is not so dramatic - the complexity is O(C*N) if C is a constant!

## A* search algorithm 
### Usage:
* Very important in artificial intelligence
* Widely used in path finding and graph traversal where there are obstacles
* Can solve path finding problems in games (it is used in Warcraft)
* However, in practical travel-routing systems, it is generally outperformed by algorithms which can pre-process the graph to attain better performance ( Dijkstra or BFS )

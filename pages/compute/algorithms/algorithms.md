# Trueno's Compute Server
The TruenoDB distributed computation server.

> **Trueno Compute Server** relies on Spark Job Server, and GraphX.

## Web Console - Compute
###Compute Menu
1. Compute Tab.
2. Algorithms type.
3. Algorithm name.
4. Algorithm's properties (e.g. R=Remote [Computed on Spark-GraphX], D=Directed, UD=Undirected, UW=Unweighted, W=Weighted)
5. Algorithm's description.

![](/assets/images/compute/compute-menu-itemized.png)


## Algorithms set
###PageRank
PageRank is a way to measure the "authority" of vertices in a graph [2]. A simplistic alternative to PageRank is to measure the in-degrees at each vertex.
The algorithm is describe as follows:
1. Initialize the vertices with a starting PageRank of 1/N, where N is the number of vertices in the graph.
2. Loop:
   * For each vertex, transmit a PageRank of **1/M** along each outbound edge, where **M** is the outdegree of the vertex.
   * At each vertex receiving incoming PageRanks from adjacent vertices, sum these up and make that the new PageRank for the vertex.
   * If PageRanks haven't significantly changed across the graph since the previous iteration, then exit.

  ![](/assets/images/compute/PageRank-iteration.png)
**Note:** example taken from [2]

####Invoking PageRank in GraphX
Object-Oriented and Object-Based are the two ways to invoke PageRank on GraphX [2].

  ![](/assets/images/compute/PageRank-object-graph.png)

###Connected Components
The connected components of an undirected graph are the equivalence classes of vertices under the "is reachable from" relation [3].

![](/assets/images/compute/ConnectedComponents-example.png)

The graph has three components [3]. Connected Components are identified by the lowest vertex ID in the component.

| Component ID   | Components Members |
| -------------- | ------------------ |
| 1 | 1,2,5 |
| 4 | 4 |
| 3  | 3,6 |

###Triangle Counting
Counting triangles can measure the connectedness of a graph or subgraph. Graphs are treated as undirected in **GraphX**. **GraphX** collapse duplicate edges into one [1,2]. The more connected a graph is, the more triangles it has. 

###Shortest Paths
In **GraphX** the Shortest Paths algorithm counts the number of hops [2]. The return value for the algorithm is the number of hops.

###Clustering Algorithms

####Average Clustering
This algorithm computes the average clustering coefficient of a graph G.
The clustering coefficient (Watts-Strogatz), when applied to a single node, is a measure of how complete the neighborhood of a node is. When applied to an entire network, it is the average clustering coefficient over all of the nodes in the network.

####Clustering
The clustering coefficient (Watts-Strogatz), when applied to a single node, is a measure of how complete the neighborhood of a node is. When applied to an entire network, it is the average clustering coefficient over all of the nodes in the network.

####Transitivity
Computes graph transitivity, the fraction of all possible triangles present in G.

###References
[1] Gonzalez, J. E., Xin, R. S., Dave, A., Crankshaw, D., Franklin, M. J., Gonzalez, J. E., … Stoica, I. (2014). GraphX : Graph Processing in a Distributed Dataflow Framework. 11th USENIX Symposium on Operating Systems Design and Implementation, 599–613. Retrieved from https://www.usenix.org/conference/osdi14/technical-sessions/presentation/gonzalez

[2] Malak, M., & East, R. (2016). Spark GraphX in Action. Manning.

[3] Cormen, T., Leiserson, C., Rivest, R., & Stein, C. (2009). Introduction to Algorithms. The MIT Press.
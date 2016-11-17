#PageRank
---
**PageRank** is a way to measure the **"authority"** of vertices in a graph [1]. A simplistic alternative to PageRank is to measure the in-degrees at each vertex.
The algorithm is describe as follows:
1. Initialize the vertices with a starting PageRank of 1/N, where N is the number of vertices in the graph.
2. Loop:
   * For each vertex, transmit a PageRank of **1/M** along each outbound edge, where **M** is the outdegree of the vertex.
   * At each vertex receiving incoming PageRanks from adjacent vertices, sum these up and make that the new PageRank for the vertex.
   * If PageRanks haven't significantly changed across the graph since the previous iteration, then exit.

  ![](/assets/images/compute/PageRank-iteration.png)
**Note:** example taken from [2]

####Invoking PageRank in GraphX
Object-Oriented and Object-Based are the two ways to invoke PageRank on GraphX [1].

  ![](/assets/images/compute/PageRank-object-graph.png)

###References
  1. Malak, M., & East, R. (2016). Spark GraphX in Action. Manning.
  
  2. Cormen, T., Leiserson, C., Rivest, R., & Stein, C. (2009). Introduction to Algorithms. The MIT Press.

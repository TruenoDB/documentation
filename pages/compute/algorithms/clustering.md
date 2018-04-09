# Clustering Algorithms

---

## Average Clustering
This algorithm computes the average clustering coefficient of a graph **G**.
The clustering coefficient (Watts-Strogatz), when applied to a single node, is a measure of how complete the neighborhood of a node is. When applied to an entire network, it is the average clustering coefficient over all of the nodes in the network.

## Clustering
The clustering coefficient (**Watts-Strogatz**), when applied to a single node, is a measure of how complete the neighborhood of a node is. When applied to an entire network, it is the average clustering coefficient over all of the nodes in the network.

The global clustering coefficient is based on triplets of nodes [1,2]. A triplet consists of three connected nodes. A triangle therefore includes three closed triplets, one centered on each of the nodes (n.b. this means the three triplets in a triangle come from overlapping selections of nodes). The global clustering coefficient is the number of closed triplets (or 3 x triangles) over the total number of triplets (both open and closed).

## Square Clustering
Compute the squares clustering coefficient for nodes.

## Transitivity
Compute graph transitivity, the fraction of all possible triangles present in G.

### References
1. D. J. Watts and Steven Strogatz (June 1998). "Collective dynamics of 'small-world' networks"
2. [Clustering Coefficient](https://en.wikipedia.org/wiki/Clustering_coefficient)

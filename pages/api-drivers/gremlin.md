#Gremlin Queries
---
**Trueno** offers an Apache TinkerPop 3.2.3 compatible API with OLTP support. Basically, meanning that gremlin traversal language can be used to query data from a Trueno database. The gremlin traversal language can be used either from **Trueno Web Console**, or using the **Java API**.

## Trueno Web Console
The default traversal language for Trueno Web Console is gremlin. Trueno relies on Gremlin Server to accept gremlin query request. Once the query is resolved, the results are shown in the Web Console. 

## Java Programming interface

###Maven
```xml
    <dependency>
        <groupId>org.trueno</groupId>
        <artifactId>trueno-gremlin</artifactId>
        <version>{version}</version>
    </dependency>
```

###Features
* [Apache TinkerPop](http://tinkerpop.apache.org/) 3.x OLTP support.
* Implementation on top of Trueno Java driver.

###Connecting to the database
* Create an instance of `TruenoGraph`.

```java
    Configuration config = new BaseConfiguration();
    config.setProperty(TruenoGraph.CONFIG_SERVER, "http://localhost");
    config.setProperty(TruenoGraph.CONFIG_PORT, 8000);
    config.setProperty(TruenoGraph.CONFIG_DATABASE, "database")
    TruenoGraph graph = new TruenoGraph.open(config, true);
```

* Open a Trueno database. If the database does not exists in the backend, it will be created.

```java
    graph.open()
        // get an instance of the graph database
        .then(conn -> {
            ...
            })
        // fail to open the database instance
        .fail(ex -> {
            ...
            })
```

###Working with graph elements
* Create a [Vertex](http://tinkerpop.apache.org/javadocs/current/core/org/apache/tinkerpop/gremlin/structure/Vertex.html) in the current graph, using [Graph.addVertex()](http://tinkerpop.apache.org/javadocs/current/core/org/apache/tinkerpop/gremlin/structure/Graph.html#addVertex-java.lang.Object...-) method.

```java
    // create a vertex with identifier 1
    Vertex v1 = graph.addVertex(T.id, 1, "name", "Alice");

    // create a vertex using a label
    Vertex v2 = graph.addVertex(T.id, 2, T.label, "person", "name", "Bob");
```

* Create a [Edge](http://tinkerpop.apache.org/javadocs/current/core/org/apache/tinkerpop/gremlin/structure/Edge.html) to a vertex, using [Vertex.addEdge()](http://tinkerpop.apache.org/javadocs/current/core/org/apache/tinkerpop/gremlin/structure/Vertex.html#addEdge-java.lang.String-org.apache.tinkerpop.gremlin.structure.Vertex-java.lang.Object...-) method.

```java
    // create an edge from v1 to v2, with label "knows" and property "since"
    Edge g = v1.addVertex("knows", v2, "since", 10);
```

###Traversal
* Look up for a vertex.

```java
    GraphTraversalSource g = graph.traversal();
    Vertex bob = g.V().has("name", "Bob");
```

* Look up for the neighbors of a vertex.

```java
    g.V(bob).outV().valueMap().forEachRemaining(value -> {
        ...
        });
```

More examples can be found in the [github repository](https://github.com/TruenoDB/trueno-gremlin/tree/dev/src/main/java/org/trueno/gremlin/examples). A complete reference of the gremlin traversal language can be found in the [Apache TinkerPop Documentation](http://tinkerpop.apache.org/docs/current/reference/#traversal).

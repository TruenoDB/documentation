# ![](../../assets/icons/download.png)Install

---

It is fast and easy to get started with Trueno. Here's what you'll need:

## Dependencies

* **Java 8** or later
* **Node.js 6** with **npm** or later (we recommend to use [nvm](https://github.com/creationix/nvm#install-script))
* **tar** and **unzip**

#### After all dependencies are installed, you can get Trueno from [**NPM**](https://www.npmjs.com/).

  ```bash
  > npm install -g trueno
  ```
This will intall Trueno globally in your system. Verify by executing the help command:

  ```bash
  > trueno --hep
  ```

#### Download and install internal components:

  ```bash
  > trueno setup
  ```

  This command will take a while to complete depending on your internet connection speed and procesing power. The following components will be installed:

  - [Gremlin Server](https://tinkerpop.apache.org/): For the Gremlin Graph Traversal languaje.
  - [Elastic Search](https://www.elastic.co/): For persistent, distributed backend storagem and indexing the graph data.
  - [Apache Spark](http://spark.apache.org/): For graph algorithm computation using GraphX.
  - [Trueno Compute Server](https://github.com/TruenoDB/trueno-compute-server): For graph analytics over Apache Spark and Graphx.

    Trueno will also download and install several Elastic Search plugins to facilitate the graph, vertices, and edges retrieval in a eficient way.


After the setup is complete, you can start using Trueno.

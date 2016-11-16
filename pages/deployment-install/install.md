# Install

---

You can get started with Trueno pretty easy and fast. You just need a few dependencies:

## Dependencies

* **Java 8** or later
* **Node.js 6** with **npm** or later (we recommend to use [nvm](https://github.com/creationix/nvm#install-script))
* **tar** and **unzip**

After all dependencies are installed, you can get Trueno from [**NPM**](https://www.npmjs.com/).

1. Install **Trueno** globally from npm:

  ```bash
  > npm install -g trueno
  ```
This will intall trueno globally in your system. Verify by executing the help command:

  ```bash
  > trueno --hep
  ```

2. Download and install internal components:

  ```bash
  > trueno setup
  ```

  This command will take a while to complete depending on your internet connection speed and procesing power. The following components will be installed.

### Internal Components

  - [Gremlin Server](https://tinkerpop.apache.org/): For the Gremlin Graph Traversal languaje.
  - [Elastic Search](https://www.elastic.co/): For indexing the graph data.
  - [Apache Cassandra](http://cassandra.apache.org/): For persistent and distributed backend storage.
  - [Apache Spark](http://spark.apache.org/): For graph algorithm computation using GraphX.
  - [Trueno Compute Server](https://github.com/TruenoDB/trueno-compute-server): A wrapper over [Spark-JobServer](https://github.com/spark-jobserver/spark-jobserver) for deploying jobs.

    Trueno will also download and install several Elastic Search plugins to facilitate the graph, vertices, and edges retrieval in a eficient way.


After the setup is complete, you can start using Trueno.


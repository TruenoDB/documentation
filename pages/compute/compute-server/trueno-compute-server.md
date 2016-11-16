# Trueno's Compute Server
The TruenoDB distributed computation server.

> **Trueno Compute Server** relies on Spark Job Server, and GraphX.

###Spark Job Server
The **spark-jobserver** provides a **RESTful** interface for submitting and managing Apache Spark jobs, jars, and job contexts [1].
####Features
* "Spark as a Service": Simple REST interface (including HTTPS) for all aspects of job, context management
* Supports sub-second low-latency jobs via long-running job contexts
* Kill running jobs via stop context and delete job
* Asynchronous and synchronous job API. Synchronous API is great for low latency jobs.
* Works with Standalone Spark as well as Mesos and yarn-client
####Spark Job Server Usage
![](/assets/images/compute/spark-job-server-architecture.png)

###GraphX
GraphX is Apache **Spark**'s API for graphs and graph-parallel computation.
####Features
* Flexibility: works with graphs and collections.
* Speed: comparable performance to the fastest specialized graph processing systems.
* A few built-in algorithms.

###How GraphX works [2]

####Property Graph
We can encode a property graph into **VertexRDD** and **EdgeRDD**.

![](/assets/images/compute/property-graph.png)

####Vextex Table (RDD), Edge Table (RDD), Routing Table
![](/assets/images/compute/encoding-graph.png)


###References
[1] https://github.com/spark-jobserver/spark-jobserver
[2] https://spark.apache.org/graphx/
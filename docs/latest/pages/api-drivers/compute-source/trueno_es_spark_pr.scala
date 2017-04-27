
/**      
  * Source: PageRank.scala
  * Author: 
  * Description: Spark Job Connector using Transport API
  */
import org.trueno.elasticsearch.spark.connector._
import org.apache.spark.SparkContext    
import org.apache.spark.SparkContext._

/* GraphX references */
import org.apache.spark.graphx._
import org.apache.spark.graphx.lib._
import org.apache.spark.graphx.VertexRDD
import org.apache.spark.graphx.EdgeRDD
import org.apache.spark.rdd.RDD

import org.apache.spark.SparkConf

import java.util.{Map => JMap}

import scala.collection.JavaConverters.mapAsScalaMapConverter
import scala.collection.JavaConverters._
import scala.collection.JavaConversions._
import scala.collection.immutable.HashMap

import org.apache.spark.api.java.JavaPairRDD
import org.apache.spark.api.java.JavaPairRDD.fromRDD
import org.apache.spark.api.java.JavaRDD
import org.apache.spark.api.java.JavaSparkContext


case class TruenoVertex(id: Long, label: Long)

/* Instantiate transport Client from ES */
val tc = new ESTransportClient("biogrid", sc)

/* Read vertices from ES */
val verticesESJavaRDD = tc.getVertexRDD()

/* Converting JavaRDD to RDD */
val verticesESRDD = verticesESJavaRDD.rdd

/* Generating GraphX VertexRDD */
val vertexRDD: RDD[(VertexId,Long)] = verticesESRDD.map ( x => (x,x) )

/* Read edges from ES and converting to RDD */
val scalaESSRDD = tc.getEdgeRDD().rdd

/* Generating GraphX EdgeRDD */
val edgesRDD: RDD[Edge[Long]] = scalaESSRDD.flatMap( x=> ( x.map (y => ( Edge(y._1, y._2, 1.toLong) ) ) ) )

/* Creating Graph */
val graph = Graph(vertexRDD, edgesRDD)

/* Running PageRank on the graph */
val g2 = PageRank.runUntilConvergence(graph,0.001)




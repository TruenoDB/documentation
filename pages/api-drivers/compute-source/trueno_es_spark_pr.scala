
/*
 ________                                                 _______   _______
/        |                                               /       \ /       \
$$$$$$$$/______   __    __   ______   _______    ______  $$$$$$$  |$$$$$$$  |
   $$ | /      \ / /|  / /| /      \ /       \  /      \ $$ |  $$ |$$ |__$$ |
   $$ |/$$$$$$  |$$ |  $$ |/$$$$$$  |$$$$$$$  |/$$$$$$  |$$ |  $$ |$$    $$<
   $$ |$$ |  $$/ $$ |  $$ |$$    $$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |$$$$$$$  |
   $$ |$$ |      $$ \__$$ |$$$$$$$$/ $$ |  $$ |$$ \__$$ |$$ |__$$ |$$ |__$$ |
   $$ |$$ |      $$    $$/ $$       |$$ |  $$ |$$    $$/ $$    $$/ $$    $$/
   $$/ $$/        $$$$$$/   $$$$$$$/ $$/   $$/  $$$$$$/  $$$$$$$/  $$$$$$$/
 */

/**      In God we trust
  * Created by: Servio Palacios on 2017.03.19.
  * Source: PageRanksBenchmark.scala
  * Author: Servio Palacios
  * Description: Spark Job Connector using REST API
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

val tc = new ESTransportClient("biogrid", sc)

/* Read vertices from ES Benchmark */

val verticesESRDD = verticesESJavaRDD.rdd
val vertexRDD: RDD[(VertexId,Long)] = verticesESRDD.map ( x => (x,x) )

val scalaESSRDD = tc.getEdgeRDD().rdd

val edgesESRDD: RDD[Edge[Long]] = scalaESSRDD.flatMap( x=> ( x.map (y => ( Edge(y._1, y._2, 1.toLong) ) ) ) )

val graph = Graph(vertexRDD, edgesESRDD)

val g2 = PageRank.runUntilConvergence(graph,0.001)




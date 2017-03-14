package org.apache.spark.examples

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by ProEditor on 2017/3/10.
  */
object Application {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("Word Count").setMaster("local[3]")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile("I:\\OGE\\文档\\Angular2规范.txt")
    textFile.cache()
    val maps = textFile.flatMap(line => {
      line.toCharArray
    }).map((f) => (f, 1)).reduceByKey((a, b) => {
      a + b
    })
    val count = maps.collect()
    count.foreach(a => {
      println(a)
    })
    sc.stop();

  }
}

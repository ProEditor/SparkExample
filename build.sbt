name := "SparkExample"

version := "1.0"

//Spark最新版只支持Scala的2.11.X版本
scalaVersion := "2.11.8"
// https://mvnrepository.com/artifact/org.apache.spark/spark-core_2.10
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.1.0"

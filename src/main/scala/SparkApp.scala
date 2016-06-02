package com.databricks.example

import org.apache.spark._
import org.apache.spark.sql.SQLContext

object SparkApp {
  def main(args: Array[String]) {
    // Cluster configurations should be added at cluster creation time in the job scheduler
    val sc = SparkContext.getOrCreate()
    val sqlCtx = SQLContext.getOrCreate(sc)

    val df = sqlCtx.table("companies")
    println("MIKLOS WAS HERE!")
    println(df.count())
  }
}

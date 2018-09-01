package com.databricks.example

import org.apache.spark._
import org.apache.spark.sql.SQLContext

object SparkApp {
	def shipmode_fob(col1: String): String = {
		var ret = col1
		if (col1 == "FOB") { 
			ret = "BOAT"
		}
		return ret
	}

  def main(args: Array[String]) {
    // Cluster configurations should be added at cluster creation time in the job scheduler
    val sc = SparkContext.getOrCreate()
    val sqlCtx = SQLContext.getOrCreate(sc)

		sqlCtx.udf.register("shipmode_fob", shipmode_fob _)

    val df = sqlCtx.table("orders")
    println("Miklos Test Application")
    println(df.count())
  }
}



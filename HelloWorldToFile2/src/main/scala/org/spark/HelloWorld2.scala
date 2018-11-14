package org.spark

import org.apache.spark
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.log4j
import java.io._


object HelloWorld2 {
  def main(args:Array[String]){
    
    //Logger.getLogger("org").setLevel(Level.ERROR)
    
    val conf = new SparkConf().setAppName("Test3SparkApp").setMaster("local[*]")
    val sc = new SparkContext(conf)
     
    val pw = new PrintWriter(new File("C:/SparkScala/Tasks/hello.txt" ))
    pw.write("hello World")
    pw.close
    
    sc.stop()    
  }   
  
}
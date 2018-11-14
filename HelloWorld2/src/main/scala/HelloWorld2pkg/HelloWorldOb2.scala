package HelloWorld2pkg

import org.apache.spark
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.log4j

object HelloWorldOb2 {
  def main(args:Array[String]){
    

    val conf = new SparkConf().setAppName("Test4SparkApp").setMaster("local[*]")
    val sc = new SparkContext(conf)
    
    println("Hello World")
    
    sc.stop()    
  }   
    
}
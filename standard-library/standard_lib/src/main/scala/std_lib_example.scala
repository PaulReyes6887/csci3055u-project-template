//Map() is a part of the scala.collection library. By default, Map() is set as immutable.
//In order to create a mutable map, you must import scala.collection.mutable.Map
//Code below follows the example given in https://www.tutorialspoint.com/scala/scala_maps.htm
object std_lib_example {
  def main(args: Array[String]) {
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

    val nums: Map[Int, Int] = Map()

    println( "Keys in colors : " + colors.keys )
    println( "Values in colors : " + colors.values )
    println( "Check if colors is empty : " + colors.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )
  }
}
//Uses the standard library Scala.math -> math.sqrt() is found within scala.math
object Calculator extends App{
  def add(x: Float, y: Float): Unit ={
    x + y
  }
  def sub(x: Float, y: Float): Unit ={
    x - y
  }
  def times(x: Float, y: Float): Unit ={
    x * y
  }
  def div(x: Float, y: Float): Unit ={
    x / y
  }
  def square(x: Float): Unit ={
    x*x
  }
  def root (x: Float): Unit ={
    math.sqrt(x)
  }
}

//Uses the standard library Scala.math -> math.sqrt() is found within scala.math
//This is an example of how real programs and applications are made in scala
//In this example, a calculator object is used and a testing environment, found in the test folder, is used to check the correctness of the program

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

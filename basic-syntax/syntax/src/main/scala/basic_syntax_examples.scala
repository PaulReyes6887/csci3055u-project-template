object basic_syntax_examples {
  //--bindings of scala--
  //Immutable binding
   //Declares x as type = float
   //casts expression result as float
  val x: Float = (Float)(1.3 * 2.4)

  //mutable binding
  var y = 13

  //--Functional programming in scala--
  //without identifier
  (z: Long) => z * 21
    //or
  //with identifier
  def compose[A, B, C](f: B => C, g: A => B): A => C = a => f(g(a))

  //--Iterations (looping)--
  //while loop
  var index = 0
  while( index < 10){
    print(index)
    index+= 1
  }
  //for loop
    //using immutable Map Data structure
  val cart = Map("Umbrella" -> 14, "Bag" -> 10, "Lunch" -> 21)
  for((item, cost) <- cart){
    println(item + " costs " + cost)
  }

  //--Classes--
  //color is set as immutable
  class shape(val color: String, area: Double, perimeter: Double){
    val shapeColor = color
    var shapeArea = area
    var shapePerimeter = perimeter
    def printLook(): Unit ={
      println("This shape is " + shapeColor + " with an area of " +
        shapeArea + " and a perimeter of " = shapePerimeter)
    }
  }
  //extends shape class
  class square(color: String, sides: Double )
    extends shape(color, sides*sides, 4 * sides){
    def printSquare(): Unit ={
      println("This is a " + color + " square with " + sides + " long sides")
    }
  }

}

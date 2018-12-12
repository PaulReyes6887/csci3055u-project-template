# _Your project title_

- _Paul Reyes_
- _paul.reyes@uoit.net_

## About the language

> Describe the language

 Scala is a language that combines object-oriented and functional programming into a concise, high level language.
 It uses a strong statically typed system and is based on Java. However, it has a multitude of functions that are not
 available within java - most notably the functional programming support scala provides.
 
> - History

Development of the language started in 2001 in École Polytechnique Fédérale de Lausanne by Martin Odersky. Inspired by 
previous languages such as Funnel, a language that combined functional programming and mathematical modeling of distributed systems,
Scala was created with an extensive support for functional programming and an aim to address the criticism that java faced. 

> - Some interesting features

Since its roots are based on both java and functional programming, Scala is a n object-oriented language which supports functional
programming concepts such as Lambda calculus, immutable data and "lazy" programming.

## About the syntax

> _give some code snippet of the language_

*Let form in clojure*

```clojure
(let [x 10
      y 20]
  (+ x y))
```
*"Let form" in scala*

```scala
    def foo :Int {
    var x = 10
    var y = 20
    x + y
    }
```
*Bindings and basic expressions*
```scala
    var x = 12
    val y: Int = (Int)(14 * 21.3)
    //Expression block (Uses Lexical scoping
      //The value of 'x' within block is 19 / y 
      //The 'y' used in the block refers to 'val y' outside of block
    var z = {val x = 19 / y; x * x}
```
*Looping*
>While
```scala
    var i = 10
    while( i >= 0){
      println(i)
      i -= 1
    }
```
>For
```scala
    for(index <- 0 to 100){
    println("Value of index = " index)
    }
```

*Data Structures*
>Class
```scala
    class shape(val color: String, area: Double, perimeter: Double){
        val shapeColor = color
        var shapeArea = area
        var shapePerimeter = perimeter
        def printLook(): Unit ={
          println("This shape is " + shapeColor + " with an area of " +
            shapeArea + " and a perimeter of " = shapePerimeter)
        }
      }
      //square class extends shape class
      class square(color: String, sides: Double )
        extends shape(color, sides*sides, 4 * sides){
        def printSquare(): Unit ={
          println("This is a " + color + " square with " + sides + " long sides")
        }
      }
```
>Maps
```scala
    //immutable map (default)
    val immutableMap = Map("apple" -> 10,
                           "orange" -> 12,
                           "banana" -> 9
                            )
    val costOfApple = immutableMap("apple")
    
    //mutable map (must use scala.collection.mutable.Map
    val mutableMap = scala.collection.mutable.Map("apple" -> 10,
                                                  "orange" -> 12,
                                                  "banana" -> 9)
    println(mutableMap("orange"))
    mutableMap += ("orange" -> 6)
    println(mutableMap("orange"))
```
>Traits
```scala
    //Code is from https://www.tutorialspoint.com/scala/scala_traits.htm
    //Uses obj.isInstanceOf[T] and obj.asInstanceOf[T] methods to compare 2
      //values x and y 
    trait Equal {
       def isEqual(x: Any): Boolean
       def isNotEqual(x: Any): Boolean = !isEqual(x)
    }
    
    class Point(xc: Int, yc: Int) extends Equal {
       var x: Int = xc
       var y: Int = yc
       
       def isEqual(obj: Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == y
    }
```

## About the tools

> _Describe the compiler or interpreter needed_.

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.



# _Analysis of Scala_

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

#### Let form in clojure 

```clojure
(let [x 10
      y 20]
  (+ x y))
```
#### "Let form" in scala

```scala
    def foo :Int {
    var x = 10
    var y = 20
    x + y
    }
```
#### Bindings and basic expressions
```scala
    var x = 12
    val y: Int = (Int)(14 * 21.3)
    //Expression block (Uses Lexical scoping
      //The value of 'x' within block is 19 / y 
      //The 'y' used in the block refers to 'val y' outside of block
    var z = {val x = 19 / y; x * x}
```
#### Looping
##### While
```scala
    var i = 10
    while( i >= 0){
      println(i)
      i -= 1
    }
```
##### For
```scala
    for(index <- 0 to 100){
    println("Value of index = " index)
    }
```

#### Data Structures
##### Class
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
##### Maps
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
##### Traits
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
   
   #### Development environment
   
   As previously mentioned, scala is a language that is based on Java. It runs on JVM and thus, Java 8 JDK or higher is required.
   It can be ran in most operating systems such as Linux, Mac OS, and windows. Downloading instructions can be found in their official
   website https://www.scala-lang.org/download/
   
   #### Compilation
   
   To compile scala files using command line arguments, use the scalac argument:
   >$ scalac (File name).scala
   
   To run scala files using command line arguments, use:
   >$ scala (File name)
   
   #### Project structure
   
   Scala project directory structures must abide by the following format:
   
   ```
      - project (plugins and additional settings for sbt)
      
       - src (source files)
           - main (application code)
               - java (Java source files)
               - scala (Scala source files) <-- This is all we need for now
               - scala-2.12 (Scala 2.12 specific files)
           - test (unit tests)
           
       - target (generated files)
       - build.sbt (build definition file for sbt)
   ```

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

Scala supports a multitude of packages and libraries that allows you to create high-performance systems.

A full list of the current scala standard library suit can be found here https://www.scala-lang.org/api/current/

Some notable packages that is supported in scala are:

    - The scala.collection package and its subsequent sub-packages      (Contains scala's collection framework)
    - The scala.io package                                              (Input and output options)
    - The scala.math package                                            (Fundamental Math operations like Math.sqrt and Math.abs)
    - The scala.util.matching package                                   (RegEx)

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

#### ScalaFX
ScalaFX is an open source repository that provides a User Interface (UI) 
Domain specific language (DSL) that is rooted in the JavaFX 2 and JavaFX 8 libraries.

More information and documentation can be found in ScalaFX's official website http://www.scalafx.org/


# Analysis of the language

> _Organize your report according to the project description
document_.

#### Functional or Procedural?
Scala is a programming language that is neither purely functional or procedural. It is a programming language that supports
both types of programming styles. With an emphasis in object-oriented design mixed with functional programming support, scala
can handle both types of programming paradigms in one concise, high-level language.

#### Support of metaprogramming?
As of Scala ver. 2.10.0, an official experimental support of metaprogramming, more specifically macros creation, has been published.
 
_Prototypical macro definition listed in an article posted here https://docs.scala-lang.org/overviews/macros/overview.html_

```scala
def m(x: T): R = macro implRef
```
Details on the future of Scala's support on metaprogramming can be found here:


#### Support for closure and symbol resolution?
As you can see in this example
```scala
    println(foo)
    
    def foo: Unit = {
      println("This is still unknown at this point: " + x)
    }
    
    var x = "I am used even before i was created"
    
```
```aidl
    scala => This is still unknown at this point: I am used even before i was created
```
scala supports symbol resolution, in which unknown references are resolved at runtime.

In this case, println(foo) uses foo as a parameter but foo has not been created as of the calling of the function println(foo) - this is resolved at runtime.

#### Support of lexical and dynamic scoping
As previously described in the bindings and basic expressions example...
```scala
    var x = 12
    val y: Int = (Int)(14 * 21.3)
    //Expression block (Uses Lexical scoping
      //The value of 'x' within block is 19 / y 
      //The 'y' used in the block refers to 'val y' outside of block
    var z = {val x = 19 / y; x * x}
```
scala does support the use of lexical scoping. Variables within a block can reference values outside of the scope if it is not found within the block.
In this case, the value of y within the block uses the value 298 (from the declaration outside the block).

Scala does have dynamic scoping support, however programmers are not advised to use dynamic scoping rules as it makes it extremely hard to keep track
on how their code will run during runtime.



//Uses FunSuit class within Scalatest -> test function is found within FunSuit
import org.scalatest.FunSuite
class CalculatorTest extends FunSuite {
  test ("Calculator.add"){
    assert(Calculator.add( 3, 4) == 7)
  }
  test ("Calculator.sub"){
    assert(Calculator.sub( 3, 4) == -1)
  }
  test ("Calculator.times"){
    assert(Calculator.times( 3, 4) == 12)
  }
  test ("Calculator.div"){
    assert(Calculator.div( 3, 4) == 3/4)
  }
}

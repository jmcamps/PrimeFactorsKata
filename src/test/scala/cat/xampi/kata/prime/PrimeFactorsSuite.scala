package cat.xampi.kata.prime

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PrimeFactorsSuite extends FunSuite{

  test("Prime factor for 1 should be empty list") {
    assert(PrimeFactors.generate(1) === List.empty)
  }
  
  test("Prime factor for 2 should be List(2)") {
    assert(PrimeFactors.generate(2) === List(2)) 
  }   
}
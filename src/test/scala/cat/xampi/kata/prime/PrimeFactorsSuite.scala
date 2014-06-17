package cat.xampi.kata.prime

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PrimeFactorsSuite extends FunSuite{
  test("Prime factor for a map of random entries") {
    var tests = Map(
		1  -> Nil,
		2  -> List(2),
		3  -> List(3),
		4  -> List(2,2),
		5  -> List(5),
		6  -> List(2,3),
		7  -> List(7),
		8  -> List(2,2,2),
		9  -> List(3,3),
		10 -> List(2,5),
		147 -> List(3,7,7),
	    1820 -> List(2,2,5,7,13) 
	)
	
	tests.foreach{ case (n, factors) =>
		assert(PrimeFactors.generate(n) === factors)
	}
  } 
}
package cat.xampi.kata.prime

object PrimeFactors {
  def generate(number: Int): List[Int] = {
    var result = List[Int]()
    var actual = number
    if (number > 1) {
      for (denominator <- 2 to number) {
        while (actual % denominator == 0 && actual / denominator > 1) {
          actual = actual / denominator
          result =  result ::: List(denominator)
        }

      } 
      result =  result ::: List(actual)
    }
    result
  } 
}
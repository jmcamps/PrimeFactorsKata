package cat.xampi.kata.prime

object PrimeFactors {
  def generate(number: Int): List[Int] = {
    var result = List[Int]()
    var actual = number
    var denominator = 2
    while (actual > 1) {
      while (actual % denominator == 0) {
        actual /= denominator
        result = result ::: List(denominator)
      }
      denominator = denominator + 1

    }
    if(actual > 1) result = result ::: List(actual)

    result
  }
}
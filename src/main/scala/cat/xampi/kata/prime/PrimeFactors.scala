package cat.xampi.kata.prime

object PrimeFactors {
  def generate(number: Int): List[Int] = {
    number match {
      case 1 => List.empty
      case 2 => List(2)
    }
  }

}
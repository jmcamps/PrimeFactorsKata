package cat.xampi.kata.prime

object PrimeFactors {
  def generate(number: Int): List[Int] = {
    def generateFactorsRecursive(number: Int, divider: Int): List[Int] = {
      number match {
        case 1 => List.empty
        case x if number % divider == 0 => divider :: generateFactorsRecursive(number / divider, 2)
        case _ => generateFactorsRecursive(number, divider + 1)
      }
    }

    generateFactorsRecursive(number, 2)
  }
}
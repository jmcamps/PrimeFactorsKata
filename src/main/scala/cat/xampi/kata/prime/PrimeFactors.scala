package cat.xampi.kata.prime

import scala.annotation.tailrec

object PrimeFactors {
  def generate(number: Int): List[Int] = {
    @tailrec
    def generateFactorsRecursive(number: Int, divider: Int, acc: List[Int]): List[Int] = {
      number match {
        case 1 => List.empty
        case x if number % divider == 0 => generateFactorsRecursive(number / divider, 2, divider :: acc)
        case _ => generateFactorsRecursive(number, divider + 1, acc)
      }
    }

    generateFactorsRecursive(number, 2, List.empty)
  }
}
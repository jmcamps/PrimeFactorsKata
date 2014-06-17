package cat.xampi.kata.prime

import scala.annotation.tailrec

object PrimeFactors {
  implicit class ExtendedInt(val value: Int) extends AnyVal {
	  def isDivisibleBy(other:Int) = value % other == 0
	  def primeFactors: List[Int] = PrimeFactors.generate(value)
  }
  
  def generate(number: Int): List[Int] = {
    val MINIMAL_DIVIDER = 2
    @tailrec
    def generateFactorsRecursive(number: Int, divider: Int, acc: List[Int]): List[Int] = {
      number match {
        case 1 => acc.reverse
        case x if number isDivisibleBy divider => generateFactorsRecursive(number / divider, MINIMAL_DIVIDER, divider :: acc)
        case _ => generateFactorsRecursive(number, divider + 1, acc)
      }
    }        
    generateFactorsRecursive(number, MINIMAL_DIVIDER, List.empty)
  }
}
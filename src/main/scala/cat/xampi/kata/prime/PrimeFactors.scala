package cat.xampi.kata.prime

import scala.annotation.tailrec

object PrimeFactors {
  implicit class ExtendedInt(val value: Int) extends AnyVal {
	  def isDivisibleBy(other:Int) = value % other == 0
  }
  
  def generate(number: Int): List[Int] = {
    @tailrec
    def generateFactorsRecursive(number: Int, divider: Int, acc: List[Int]): List[Int] = {
      number match {
        case 1 => acc.reverse
        case x if number isDivisibleBy divider => generateFactorsRecursive(number / divider, 2, divider :: acc)
        case _ => generateFactorsRecursive(number, divider + 1, acc)
      }
    }    
        
    generateFactorsRecursive(number, 2, List.empty)
  }
}
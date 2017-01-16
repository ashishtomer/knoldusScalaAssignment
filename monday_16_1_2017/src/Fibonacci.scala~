/**
  * This is 2nd question
  *
  * Created by ashish on 16/1/17.
  *
  *Index of fibonacci series starts from 1 onwards
  *
  */
class Fibonacci(limit:Int) {

  private val fibonacciLimit: Int = limit
  private var counter: Int = limit-2

  var list: List[Int] = List()

  def getSeries(): List[Int] = {

    require(fibonacciLimit > 0)

    fibonacciLimit match {
      case 1 => {
        list = 0 :: list
      }
      case _ => {
        list = 0 :: list
        list = 1 :: list
        generateSeries()
      }
    }
    return list.reverse
  }

  def generateSeries():Unit={
    counter match {
      case 0 =>
        return
      case _ =>
        list = list(0) + list(1) :: list
        counter -= 1
        generateSeries()
    }
  }
}



object Fibonacci{

  def main(args: Array[String]) {
    var fibonacci = new Fibonacci(1)
    println(fibonacci.getSeries())
  }
}
/**
  * Created by ashish and anuj on 16/1/17.
  * Question 4th
  */

class DoubleListElts {

  val list = List(1,2,3,4)

  def doubleElts():List[Int] = {
    list map(_*2)//doubling and returning list
  }

}

object DoubleListElts{//comapnion object

  def main(args: Array[String]) {

    val doubleListElts=new DoubleListElts()
    println(doubleListElts.doubleElts())

  }

}
/**
  *
  * This is question number 3
  *
  * Created by anuj and ashish on 16/1/17.
  */
class CalculateArea {


  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String={
   shape match {
     case "rhombus" => s"Area of $shape is ${f(first, second)}"
     case "parallelogram" => s"Area of $shape is ${f(first, second)}"
     case "rectangle" => s"Area of $shape is ${f(first, second)}"
     case _ => s"Not defined for $shape yet"
     }
   }

}

object CalculateArea {

  def main(args: Array[String]) {

    val parallaogram = "parallelogram"
    val rectangle  = "rectangle"
    val rhombus = "rhombus"
    val square = "square"

    val calculateArea = new CalculateArea()

    println(calculateArea.area(parallaogram, 20, 30, (_*_ / 2)))
    println(calculateArea.area(rectangle, 10, 35, _*_))
    println(calculateArea.area(rhombus, 90, 30, _*_))
    println(calculateArea.area(square, 90, 30, _*_))

  }

}
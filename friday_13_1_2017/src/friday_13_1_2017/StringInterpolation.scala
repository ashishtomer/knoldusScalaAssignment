package friday_13_1_2017

/*
 *
 * Details : This is 1st question
 * Authors : Anuj and Ashish
 * 
 */

class StringInterpolation {
  
  val numbers = List(10,20,30,40);
  
  private def printList(): Unit = {
    
    var counter:Int = 0
    
    for (number <- numbers) {
      
      println(s"$counter = $number");//Here we've used String Interpolation
      
      counter = counter +1
    }
  }
  
}

object StringInterpolation {
  
  def main(args: Array[String])  {
    var printResult = new StringInterpolation()
    
    printResult.printList();
    
  }
  
}
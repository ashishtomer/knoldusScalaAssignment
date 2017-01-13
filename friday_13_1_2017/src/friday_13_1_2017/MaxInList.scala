package friday_13_1_2017
/*
 *
 * Details : This is 2nd question
 * Authors : Anuj and Ashish
 * 
 */
class MaxInList {
  val list = List(23,54,21,48,93,4,65);
  
//  Method to find max element from above list
  private def getMax(): Int = {
    var max = list(0)
    
    list.foreach(number => {if(max < number) max = number}) 
      
    return max
    }
  
}


object MaxInList {
  def main(args: Array[String]) = {
    val maxInList = new MaxInList()
    
    println(s"The maximum element is: ${maxInList.getMax()}")
  }
}
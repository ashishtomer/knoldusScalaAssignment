package friday_13_1_2017
/*
 *
 * Details : This is 4th question
 * Authors : Anuj and Ashish
 * 
 */
class SumOfFactDigits() {
  
  
//  method to get the factorial value of given number
  private def getFact(num: Int):Int = {
    
    var ctr:Int = num
    var fact:Int = 1
    
    while(ctr>0){
      
      fact = fact * ctr
      ctr = ctr - 1
    }
    
    return fact
  }
  
//  method to get sum of the digits of a number
  private def getSum(num:Int):Int = {
    
    var temp :Int = getFact(num)
    var sum :Int = 0
    while(temp>0){
      sum = sum + temp % 10
      temp=temp/10
    }
    return sum
  }
}

object SumOfFactDigits{
  
  def main(args : Array[String]) = {
  
    val sumOfFactDigits = new SumOfFactDigits()
    
    println(s"Sum of digits of factorial of the number : ${sumOfFactDigits.getSum(5)}")
  
  }
}

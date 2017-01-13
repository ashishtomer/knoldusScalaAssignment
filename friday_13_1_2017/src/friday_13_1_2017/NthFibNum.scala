package friday_13_1_2017
/*
 *
 * Details : This is 3rd question
 * Authors : Anuj and Ashish
 * 
 */
class NthFibNum(num :Int) {
  private val number=num
  
//  Method to get nth fibonacci number
  private def getNthFibNum():Int={
    
    var ctr:Int = 1
    var temp1:Int = 0
    var temp2:Int = 1
    var sum:Int =temp1
    
    if(number == 0)
      return 0
    else if(number == 1)
      return 1
    
    while(ctr< number){
      sum=temp1+temp2
      temp1=temp2
      temp2=sum
      ctr=ctr+1
    }
    return sum
   
  }
}

object NthFibNum {
  
   def main(args : Array[String]) = {

     val nthFibNum = new NthFibNum(8)
     println(nthFibNum.getNthFibNum());
   
   }
}
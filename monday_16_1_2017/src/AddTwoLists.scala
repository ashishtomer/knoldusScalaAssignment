/**
  * Created by ashish and anuj on 16/1/17.
  * question 1st
  */

class AddTwoLists {
  var list:List[Int] = List()


  def addLists(list1:List[Int],list2: List[Int]):List[Int]={

    for(num1<-list1){

      list = num1+ list2(list1 indexOf num1) :: list  //adding elements of lists then prepending new list
    }

    list.reverse// reversing list

  }
}

object AddTwoLists{//companion object

  def main(args: Array[String]) {
    val list1 = List(10,20,30,40)
    val list2 = List(1,2,3,4)

    val addTwoLists = new AddTwoLists()

    println(addTwoLists.addLists(list1,list2))//calling method and printing the outcome

  }
}
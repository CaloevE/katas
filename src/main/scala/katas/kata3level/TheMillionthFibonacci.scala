package katas.kata3level

/**
    Created by Evghenii.
    27-January-2022 
*/
    object TheMillionthFibonacci extends App {

//  def fib(n: Int): Int = {
//    // your code here
//    val phi = new Nothing((1 + Math.sqrt(5)) / 2).pow(n)
//    val phi_ = new Nothing((1 - Math.sqrt(5)) / 2).pow(n)
//    val divider: Nothing = new Nothing(Math.sqrt(5))
//    val result: BigInt = phi.subtract(phi_).divide(divider)
//    result
//    }

//    def count(n: Int, last:Int, privies: Int): BigInt =
//      if(n <= 0) privies
//      else count(n - 1, last = last - n, privies = last)
//
//    count(n, 1, 0)
//
//  println(fib(5))
//  println(fib(8))
//  println(fib(13))


case class CapLetter(string: String) {
  def capital = string.head.toUpper + string.tail
}
 implicit val str = "random string"

  implicit def upperCaseStr(s: String): CapLetter = CapLetter(s)
  val str2 = "random string"

  def insertionSort1(list: List[Int]): List[Int] = {

    def insertSorted(element: Int, sortedList: List[Int]): List[Int] =
    if (sortedList.isEmpty || element <= sortedList.head) element :: sortedList
    else sortedList.head :: insertSorted(element, sortedList.tail)

    if (list.isEmpty || list.tail.isEmpty) list
    else insertSorted(list.head, insertionSort1(list.tail))
  }

  def insertionSort2(list: List[Int]): List[Int] = {

    def insertSorted(element: Int, sortedList: List[Int], accumulator: List[Int]): List[Int] =
    if (sortedList.isEmpty || element <= sortedList.head) accumulator.reverse ++ (element :: sortedList)
    else insertSorted(element, sortedList.tail, sortedList.head :: accumulator)

    def sort(list: List[Int], accumulator: List[Int]): List[Int] =
    if (list.isEmpty) accumulator
    else sort(list.tail, insertSorted(list.head, accumulator, Nil))

    sort(list, Nil)
  }
  println(str2.head.toUpper + str2.tail)
  println(str.capital)
}

package katas.kata7level

/**
    Created by Evghenii.
    20-January-2022 
*/
    object CakeSlice extends App {

  def cakeSlice(n: Int): Int = {
    // Implement me! :)
    var count = 1
    var number = 1
    while(n >= number) {
      count = count + number
      number = number + 1
    }
    number
  }

  println(cakeSlice(0))
  println(cakeSlice(1))
  println(cakeSlice(2))
  println(cakeSlice(3))
  println(cakeSlice(10))
}

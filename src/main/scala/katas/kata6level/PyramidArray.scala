package katas.kata6level

import scala.collection.View.Empty

/**
 * @author Caloev Evghenii
 */
object PyramidArray extends App {

  def pyramid(n: Int): List[List[Int]] = {
    // Implement me! :)
    (1 to n).map(List.fill(_)(1)).toList

  }

  println(pyramid(0)) // == List[List[Int]]())
  println(pyramid(1)) // == List[List[Int]](List(1)))
  println(pyramid(2)) // == List[List[Int]](List(1), List(1, 1)))
  println(pyramid(3)) // =
}

/*
def pyramid(n: Int): List[List[Int]] =
    List.tabulate(n)(i => List.fill(i+1)(1))

     def pyramid(n: Int): List[List[Int]] = {
    n match {
      case 0 => List()
      case _ => pyramid(n - 1) ::: List(List.fill(n)(1))
    }
  }
 */

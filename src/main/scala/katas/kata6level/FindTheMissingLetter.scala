package katas.kata6level

import scala.language.postfixOps

/**
 * @author Caloev Evghenii
 */object FindTheMissingLetter extends App {

  def findInt(number: Array[Int]): Int = {
    number.head to number.last diff number head
  }

  def findMissingLetter(chars: Array[Char]): Char = {

    chars.head to chars.last diff chars head

  }

  println(findMissingLetter(Array('a', 'b', 'c', 'd', 'f')))
  println(findInt(Array(100, 200, 400, 500, 600)))
}

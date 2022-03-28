package katas.kata6level

/**
 * @author Caloev Evghenii
 */
object DeadFishextends extends App {
  def parse(data: String): List[Int] = {
  // Implement me! :)
  var list: List[Int] = List()
  var number = 0
  for (str <- data){
  str match {
  case 'i' =>  number += 1
  case 'd' =>  number -= 1
  case 's' =>  number *= number
  case 'o' => list = list.appended(number)
}
}
  list
}

  /**
   * 1.
   * def parse(data: String): List[Int] =
    data.foldLeft(0, List[Int]()) {
      case ((v, out), 'i') => (v+1, out)
      case ((v, out), 'd') => (v-1, out)
      case ((v, out), 's') => (v*v, out)
      case ((v, out), 'o') => (v,   out :+ v)
    }._2
   * 2.
   * val parse = (_ : String).scanLeft((0, Option.empty[Int])) {
    case ((n, _), 'i') => (n + 1, None)
    case ((n, _), 'd') => (n - 1, None)
    case ((n, _), 's') => (n * n, None)
    case ((n, _), 'o') => (n, Some(n))
    case ((n, _), _)   => (n, None)
  }.flatMap(_._2).toList
   3.
    def parse(data: String): List[Int] = {
    def accu(data: List[Char], value: Int, result: List[Int]): List[Int] = data match {
    case Nil => result.reverse
    case head::tail => head match {
      case 'i' => accu(tail, value+1, result)
      case 'd' => accu(tail, value-1, result)
      case 's' => accu(tail, value*value, result)
      case 'o' => accu(tail, value, value::result)
    }
  }
  accu(data.toCharArray.toList,0,Nil)
  }
   */

  println(parse("iiisdoso"))
}

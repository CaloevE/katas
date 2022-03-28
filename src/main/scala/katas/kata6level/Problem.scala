package katas.kata6level

/**
 * @author Caloev Evghenii
 */object Problem extends App {

  def invertedRanges(ranges: List[(Int, Int)]): List[(Int, Int)] = {

  var list = List[(Int, Int)]()
  var number = 0
  for (a <- ranges) {
  if (number < a._1) {
  list = list.appended(number, a._1 - 1)
  number = a._2 + 1
}
}
  if (number < 100) list = list.appended(number, 100)

  list
}

  /**
   * 1.
  def makeRanges(ranges: List[(Int, Int)]): List[(Int, Int)] = {
    val pairs = ranges.sliding(2).map{case List((a,b),(c,d)) => (b+1,c-1)}
    pairs.toList

  }

  def invertedRanges(ranges: List[(Int, Int)]): List[(Int, Int)] = ranges match{
    case Nil => List((0,100))
    case List((x, 100)) => if(x == 0) Nil else List((0, x-1))
    case List((0, x)) => if (x == 100) Nil else List((x + 1 , 100))
    case List((x,y)) => List((0, x-1),(y+1,100))
    case (x, _) :: xs =>
    val first = (0,x-1)
    val last = (xs.last._2 + 1,100)
    (first :: makeRanges(ranges) ++ List(last)).filter{case (x,y) => x <= y }
  }
   2.
   def split(list: List[Int]) : List[List[Int]] = list match {
    case Nil => Nil
    case h::t =>
      val segment = list.zipWithIndex.takeWhile { case (v, i) => v == h+i }.map(_._1)
      List(h, segment.last).distinct :: split(list drop segment.length)
  }
  def invertedRanges(ranges: List[(Int, Int)]) = split((0 to 100).toList.filterNot(ranges.flatMap(x=>(x._1 to x._2).toList).contains)).map(x=>if(x.length>1)(x.head, x.tail.head)else (x.head, x.head))

   3.
   ef checkRange(range: List[Int]): List[Int] = {
    if (range(1) - range(0) < 2) List()
    else List(range(0)+1, range(1)-1)
  }

  def invertedRanges(ranges: List[(Int, Int)]): List[(Int, Int)] = {
    val list = List(-1) ++ ranges.flatMap(x => List(x._1, x._2)) :+ 101
    list.sliding(2, 2).flatMap(x => checkRange(x)).sliding(2, 2).toList.map(x => (x(0), x(1)))
  }
   */

  println(invertedRanges(List((40, 46), (48, 52), (62, 63))) )
  println(invertedRanges(List((0, 50), (51, 100))))
  println(invertedRanges(List()))
}

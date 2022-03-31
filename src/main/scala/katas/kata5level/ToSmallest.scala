package katas.kata5level

/**
 * @author Caloev Evghenii
 */
object ToSmallest extends App {

  def smallest(n: Long): Array[Long] = {
    // your code
        (for {
          i <- 0 until s"$n".size
          j <- 0 until s"$n".size
          if i != j
        } yield Array(s"$n".patch(j, Nil, 1).patch(i, Seq(s"$n"(j)), 0).toLong, j, i))
          .minBy { case Array(s, i, j) => (s, i) }
  }



  println(smallest(261235).mkString("Array(", ", ", ")")) //, Array(126235, 2, 0))
  println(smallest(256687587015L).mkString("Array(", ", ", ")")) //, Array(25668758715L, 9, 0))
  println(smallest(935855753L).mkString("Array(", ", ", ")")) //, Array(358557539, 0, 8))
  println(smallest(285365).mkString("Array(", ", ", ")")) //,  Array(238565, 3, 1))
}

/**
 * 1.  val num = n.toString
    val l   = num.length
    (0 until l)
      .flatMap(i =>
        (0 until l).map { j =>
          val d      = num(i)
          val first  = num.take(i) + num.drop(i + 1)
          val second = first.take(j) + d + first.drop(j)
          Array(second.toLong, i, j)
        }
      )
      .toArray

 2. ef getNSwitchByIJ(strN: String, i: Int, j: Int): Array[Long] = {
    val dgtRm = strN.substring(0, i) + strN.substring(i + 1)
    val minN = (dgtRm.substring(0, j) + strN.substring(i, i + 1) +
      dgtRm.substring(j)).toLong
    Array(minN, i, j)
  }

  def smallest(n: Long): Array[Long] = {
    val strN = n.toString
    (for (i <- 0 until strN.length;
          j <- 0 until strN.length)
      yield (i, j)) map tupled { (i, j) => getNSwitchByIJ(strN, i, j) } minBy (arr => arr(0))
  }
 */
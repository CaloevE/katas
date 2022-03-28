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
  println(smallest(285365)) //,  Array(238565, 3, 1))
}

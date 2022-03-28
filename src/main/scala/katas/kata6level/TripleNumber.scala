package katas.kata6level

/**
 * @author Caloev Evghenii
 */
object TripleNumber extends App {

  def tripleDouble(num1: Long, num2: Long): Int = {
    val n1 = num1.toString
    val n2 = num2.toString
    var firstN = 1
    var secondN = 1
    var numberF = 0
    var numberS = 0

    for (i <- 2 until n1.length) {
      if (n1.charAt(i) == n1.charAt(i - 1) && n1.charAt(i) == n1.charAt(i - 2) ) {
        firstN += 1
        if (firstN >=2) numberF = n1.charAt(i)}
      else firstN += 0

    }
    for (i <- 1 until n2.length) {
      if (n2.charAt(i) == n2.charAt(i - 1)) {
        secondN += 1
        if (secondN >= 2 && numberF == n2.charAt(i) && numberF == n2.charAt(i - 1))  numberS = n2.charAt(i)
      }
      else secondN += 0
    }

    if (firstN >= 2 && secondN >= 2 && numberF == numberS) 1
    else 0
//    for (i <- 2 until n1.length) {
//      if (
//        n2.lastIndexOf(n1.charAt(i)) > 0 &&
//        (n1.charAt(i) == n1.charAt(i - 1) && n1.charAt(i) == n1.charAt(i - 2)) &&
//        n2.charAt(n2.lastIndexOf(n1.charAt(i))) == n2.charAt(n2.lastIndexOf(n1.charAt(i)) - 1)
//        )
//       return 1
//         }
//    0
  }


  println(tripleDouble(451999277L, 41177722899L)) // , 1),
  println(tripleDouble(1222345L, 12345L)) // , 0),
  println(tripleDouble(12345L, 12345L)) // , 0),
  println(tripleDouble(666789L, 12345667L)) // , 1),
  println(tripleDouble(10560002L, 100L)) // , 1),
  println(tripleDouble(1112L, 122L)) // , 0)
  println(tripleDouble(1236683121662683L, 2163666346623446L)) //should return 0
  println(tripleDouble(2828111121128286L, 3112363826683164L))// should return 1
  println(tripleDouble(3631118836226681L, 6181182841841433L))// should return 1
  println(tripleDouble(3833662331681222L, 2166422281621138L))// should return 1
  println(tripleDouble(2323833233361216L, 3328344642183626L))// should return 1
  println(tripleDouble(6311121223862282L, 6664388311284321L))// should return 1
  println(tripleDouble(2286662882316216L, 1668636842623161L))// should return 1
  println(tripleDouble(3866636126821312L, 6214416622468226L))// should return 1
  println(tripleDouble(2666118183388883L, 8662288662268448L))// should return 1
}
/**
 * 1. def tripleDouble(num1: Long, num2: Long): Int =
    if ("0123456789".split("").exists(d => s"$num1".contains(d*3) && s"$num2".contains(d*2))) 1 else 0

 * 2. def tripleDouble(num1: Long, num2: Long): Int = {
    var num1s = num1.toString
    var num2s = num2.toString

    var num2l = num2s.zipWithIndex
      .filter{ case (c, i) => i < num2s.size-1 && num2s(i+1)==c }
      .map(_._1)
      .distinct

    if (num1s.zipWithIndex
      .filter{ case (c, i) => i < num1s.size-2 && num1s(i+1)==c && num1s(i+2)==c && num2l.exists(_==c)}.size > 0)
      1
    else
      0
  }

 * 3.  def tripleDouble(num1: Long, num2: Long): Int = {
    val n1 = num1.toString.sliding(3).map(_.toList.distinct).filter(_.size == 1).toList
    val n2 = num2.toString.sliding(2).map(_.toList.distinct).filter(_.size == 1).toList

    if (n1.nonEmpty && n2.nonEmpty && n1.exists(n2.contains(_))) 1
    else 0
    }

 * 4. def tripleDouble(num1: Long, num2: Long): Int =  {

  def repetations(num: Long, times: Int) = {
      val asString = num.toString
      asString.toSeq.distinct.filter(c => asString.contains(c.toString * times))
    }

    val rep3 = repetations(num1, 3)
    val rep2 = repetations(num2, 2)

    if(rep3.exists(rep => rep2.contains(rep))) 1 else 0
    }
 */
package katas.kata6level

/**
 * @author Caloev Evghenii
 */
object RevRot extends App {

  def revRot(strng: String, sz: Int): String = {
    // your code
    //    val l = strng.length

    if (sz < 1 || strng.isEmpty || sz > strng.length) ""
    else
      strng
        .grouped(sz)
        .filter(_.length == sz)
        .map(s =>
          if (s.map(str => math.pow(str.toInt, 3)).sum % 2 == 0) s.reverse
          else s.tail + s.head
        )
        .mkString

  }

  println(revRot("123456987654", 6)) // --> "234561876549"
  println(revRot("123456987653", 6)) // --> "234561356789"
  println(revRot("66443875", 4)) // --> "44668753"
  println(revRot("66443875", 8)) // --> "64438756"
  println(revRot("664438769", 8)) // --> "67834466"
  println(revRot("123456779", 8)) // --> "23456771"
  println(revRot("", 8)) // -->""
  println(revRot("123456779", 0)) // --> ""
  println(revRot("563000655734469485", 4)) // --> "0365065073456944"
}

/**
 * 1.object RevRot {

  def revRot(strng: String, sz: Int): String = {
    if (sz <= 0 || strng.isEmpty || sz > strng.length) return ""
    strng.dropRight(strng.length % sz).grouped(sz).map { chunk =>
      if (chunk.map(_.toInt).sum % 2 == 0) chunk.reverse else chunk.tail + chunk.head
    }.mkString
  }
}
 2.
 object RevRot {

  def revRot(strng: String, sz: Int): String = {
    if(sz==0) ""
    else{
      strng.sliding(sz,sz)
           .filter(_.length==sz)
           .map(x=>{ if(x.toString.map(_.asDigit).sum%2==0) x.toString.reverse else x.toString.substring(1)+x.toString.substring(0,1)})
           .mkString
    }
  }
}
 3.
 object RevRot {

  def doRevOrRot(str: String): String = str.map(ch => Math.pow(ch.asDigit, 3).toInt).sum match {
    case res if res % 2 == 0 => str.reverse
    case _ => str.tail + str.head
  }

  def revRot(str: String, sz: Int): String = str match {
    case s if s.isEmpty || s.length < sz || sz <= 0 => ""
    case _ => doRevOrRot(str.substring(0, sz)) + revRot(str.substring(sz, str.length), sz)
  }
}
 */

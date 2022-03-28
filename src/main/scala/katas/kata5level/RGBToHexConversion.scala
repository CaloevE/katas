package katas.kata5level

/**
 * @author Caloev Evghenii
 */
object RGBToHexConversion extends App {

  def rgb(r: Int, g: Int, b: Int): String = {
    //My solution
    def negativeNumber(number: Int) = number match {
      case _ if (number < 0) => 0
      case _ if(number > 255) => 255
      case _ => number
    }

    //      if (number < 0) 0  else if(number > 255) 255 else number

    val result = String.format("%02X%02X%02X", negativeNumber(r), negativeNumber(g), negativeNumber(b))
    result
  }

  println(rgb(0, 0, 0) ) //=== "000000")
  println(rgb(1, 2, 3) ) //=== "010203")
  println(rgb(255, 255, 255) ) //=== "FFFFFF")
  println(rgb(254, 253, 252) ) //=== "FEFDFC")
  println(rgb(-20, 275, 125) ) //=== "00FF7D")
}

/**1.
 *  def rgb(r: Int, g: Int, b: Int): String =
    Seq(r, g, b).map(x => f"${255 min (x max 0)}%02X").mkString
 2.
  def rgb(r: Int, g: Int, b: Int): String = {
    Seq(r, g, b).map {
      case x if x <= 0   => "00"
      case x if x >= 255 => "FF"
      case x if x >= 16 =>
        x.toHexString.toUpperCase
      case x =>
        "0" + x.toHexString.toUpperCase
    }.mkString
  }
3.
  def rgb(r: Int, g: Int, b: Int) = {
    def rnd(n: Int) = n max 0 min 255
    "%02X%02X%02X" format (rnd(r), rnd(g), rnd(b))
  }

 4.
  def rgb(xs: Int*) = xs.map(x => f"${255 min (x max 0)}%02X").mkString
}

 5.
   def rgb(r: Int, g: Int, b: Int): String =
    List(r,g,b)
      .map(y => if (y < 0) 0 else if (y > 255) 255 else y)
      .map(i => i.toHexString.toUpperCase)
      .map(x => if (x.length < 2) "0" + x else x)
      .mkString
 */

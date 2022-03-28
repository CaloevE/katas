package katas.kata6level

/**
    Created by Evghenii.
    18-January-2022 
*/
    object RectangleToSquares extends App {

    def sqInRect(min: Int, max: Int): Array[Int] = {
        // your code
        var list = Array[Int]()
      var length = min
      var width = max
      while(length != width) {
        if (length > width){
           list =  list :+ width
            length -= width
        } else {
            width -= length
            list = list :+ length
        }
      }

        if (list.length > 0 ) list = list.appended(length) else list

      list

        /**
         * 1.  if (max == min) {
      return Array()
    }
    var (mmax, mmin) = (max, min)
    val lst = List.newBuilder[Int]
    while (mmax > 0 && min > 0) {
      if (mmin > mmax) {
        var tmp: Int = mmax
        mmax = mmin
        mmin = tmp
      }
      lst += mmin
      mmax -= mmin
    }
    lst.result().toArray
  }

         2.
         val Array(width, length) = Array(min, max).sorted
    if (width == length)
      if (squares.isEmpty) Array() else (width +: squares).reverse
    else
      sqInRect(length-width, width, width +: squares)

         3.
           // your code
    case (a, b) if(a * b >= 1 && a != b - a && a != b) =>
      Array(a) ++ sqInRect(Math.min(a, b - a), Math.max(a, b - a))
    case (a, b) if(a == b - a) => Array(a) ++ Array(a)
    case (a, b) if(a == b) => Array()
         */
    }

  println(sqInRect(5, 3).mkString("Array(", ", ", ")"))
}

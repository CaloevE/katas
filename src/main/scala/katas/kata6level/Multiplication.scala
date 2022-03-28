package katas.kata6level

/**
 * @author Caloev Evghenii
 */object Multiplication extends App {

  def persistence(n: Int): Int = {

    if (n > 9)
      persistence(n.toString.map(_.asDigit).product) + 1
    else 0

  }

  println(persistence(39))
  println(persistence(4))
  println(persistence(999))
}

/**1.
 *  def persistence(n: Int): Int = {

@tailrec
def persistanceWithCounter(n: Int, i: Int) : Int = {
      if (singleDigit(n)) i
      else persistanceWithCounter(multDigit(n), i + 1)
    }
    persistanceWithCounter(n,0)
  }
  def singleDigit(n: Int) = n.toString.length == 1
  def multDigit(n: Int) = n.toString.map(_.asDigit).product

 2.
 def muldig(n: Int): Int = if (n >= 10) n % 10 * muldig(n/10) else n

  def persistence(n: Int): Int = if (n >= 10) persistence(muldig(n)) + 1 else 0
 3.
 def persistence(n: Int): Int = {
    def pers_aux(n: Int, times: Int): Int =
      if (n < 10) times
      else pers_aux(n.toString.split("") map (_.toInt) product, times+1)
    pers_aux(n, 0)
  }
 */

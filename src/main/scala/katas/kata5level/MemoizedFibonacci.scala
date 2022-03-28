package katas.kata5level

/**
    *Created by Evghenii.
    *11-January-2022
*/
    object MemoizedFibonacci extends App {
//My solution
    def fib(n: Int): BigInt = {
      def counter(n: BigInt, a: BigInt, b: BigInt): BigInt =
        if (n <= 0) b
        else counter(n - 1, a = a + b, b = a)

        counter(n, 1, 0)
    }

    /**
     * 1.
     *  n match {
      case 0 | 1 => x
      case _ => fib(n - 1, y, x + y)
    }
     2.
    val cached: Map[Int, BigInt] = Map(0 -> 0, 1 -> 1)

  def fib(n: Int): BigInt =
    cached.getOrElseUpdate(n, fib(n-1) + fib(n-2))

     3.
     val fib: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fib.zip(fib.tail).map{ case (x, y) => x + y }
     4.
      lazy val fibs: LazyList[BigInt] = BigInt(0) #:: fibs.scanLeft(BigInt(1))(_ + _)
    fibs(n)
     */

}

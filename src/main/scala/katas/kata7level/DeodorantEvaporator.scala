package katas.kata7level

object DeodorantEvaporator extends App {

  def evaporator(content: Double, evapPerDay: Int, threshold: Int): Int = {
    // your code here
    val minPercent = ((content * threshold) / 100)

    def evapHelp(z: Double, evapPerDay: Int, accumulator: Int): Int =
    if (z < minPercent ) accumulator
    else  evapHelp( z = z - ((z * evapPerDay) / 100), evapPerDay, accumulator + 1)

    evapHelp(content, evapPerDay, 0)

  }

  println(evaporator(10, 10, 10))
}

/**
 * 1.   def evaporator(content: Double, evapPerDay: Int, threshold: Int): Int =
    Iterator.iterate(100.0)(x => x * (1.0 - evapPerDay / 100.0)).takeWhile(_ >= threshold).length

 2. def evaporator(content: Double, evapPerDay: Int, threshold: Int): Int = {
    var res = 0
    var c   = content
    val min = content * threshold / 100.0
    while (c > min) {
      c = c * (1 - evapPerDay / 100.0)
      res = res + 1
    }
    res
  }

 3.  def evaporator(content: Double, evapPerDay: Int, threshold: Int): Int = {
    def rec(perc : Double, evapPerDay : Int, threshold: Int, acc: Int): Int ={
      if (perc<threshold) acc else rec(perc*(1-evapPerDay.toDouble/100),evapPerDay,threshold,acc+1)
    }
    rec (100, evapPerDay, threshold, 0)
  }

 4. def evaporator(_content: Double, evapPerDay: Int, threshold: Int): Int = {
    (math.log(threshold / 100.0) / math.log(1 - evapPerDay / 100.0)).toInt + 1
  }

 */
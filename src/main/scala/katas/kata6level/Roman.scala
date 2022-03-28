package katas.kata6level

/**
 * @author Caloev Evghenii
 */object Roman extends App {

  def decode(roman: String): Int = {

    var previous = ' '
    var count = 0
    var newCount = 0

    for(i <- roman) {
      i match {
        case 'I' => count += 1
        case 'V' => if(previous == 'I') count += 3 else count += 5
        case 'X' => if(previous == 'I') count += 8  else count += 10
        case 'L' => if(previous == 'X') count += 30 else count += 50
        case 'C' => if(previous == 'X') count += 80 else count += 100
        case 'D' => if(previous == 'C') count += 300 else count += 500
        case 'M' => if(previous == 'C') count += 800  else count += 1000
      }
      previous = i
      newCount = count
    }
    newCount
  }

  //  println(decode("I"))
  //  println(decode("III"))
  //  println(decode("IV"))
  //  println(decode("XXI"))
  println(decode("MLXXXIX"))            //1089   (1000+50+30+1+8)
  println(decode("MMCCLXXIX"))          //2279
  println(decode("MCCCLXIX"))          // 1369

}

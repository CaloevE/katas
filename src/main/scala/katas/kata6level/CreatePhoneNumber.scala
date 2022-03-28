package katas.kata6level

/**
    Created by Evghenii.
    11-January-2022 
*/
    object CreatePhoneNumber {
  //My solution
    def createPhoneNumber(numbers: Seq[Int]): String = {
        var format = "(xxx) xxx-xxxx"

      for (i <- numbers){
        format = format.replaceFirst("x", i.toString)
      }
      return format
    }
  //First
    /**
     *  def createPhoneNumber(numbers: Seq[Int]) = {
    "(%d%d%d) %d%d%d-%d%d%d%d".format(numbers:_*)
  }
     //Second
        def createPhoneNumber(numbers: Seq[Int]) = {
    s"(${numbers.take(3).mkString}) ${numbers.slice(3,6).mkString}-${numbers.drop(6).mkString}"
  }
     //Third
     def createPhoneNumber(numbers: Seq[Int]) = {
    "(" + numbers.slice(0,3).mkString+ ") "+ numbers.slice(3,6).mkString+ "-" + numbers.slice(6,10).mkString
  }
     */
}

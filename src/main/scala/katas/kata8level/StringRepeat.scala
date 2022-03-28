package katas.kata8level

object StringRepeat extends App {
  def repeatStr(times: Int, str: String): String = {
    val result = str * times
    result
  }

  println(repeatStr(6,"I"))
}
package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  val string: String = "Hello"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 4212312313123L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14
  //variables
  var aVariable: Int = 4
  aVariable = 5 // side effects
  aVariable += 15
  println(aVariable)
}

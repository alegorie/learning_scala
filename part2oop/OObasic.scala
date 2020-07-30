package part2oop

object OObasic extends App {
  val person = new Person(name = "Andrew", age = 26, nationality = "UK")
  println(person.age)
  println(person.x)
  person.greet("Vitalii")

}

// constructor
class Person(name: String, val age: Int = 0, nationality: String) {
  // body
  val x = 2

  println(1 + 3)

  //method
  def greet(name: String): Unit = {
    println(s"${this.name} Says: Hi, $name")
  }

  //overloading
  def greet(): Unit = println(s"Hi, I`m $name")

  //def greet() : Int = 42 NOT overloading


  //multiple constructors
  def this(name: String) = this(name, 0, "NULL")


}

// class parameters are NOT Fields
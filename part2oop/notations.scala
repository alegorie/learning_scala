package part2oop

object notations extends App {

  import scala.language.postfixOps // postfix notation not works if not import


  val mary = new Person("Mary", "Inception")
  // "operators" in Scala
  val tom = new Person(name = "Tom", favoriteMovie = "Fight club")

  println(mary.likes("Inception"))
  println(mary likes "Inception")
  //infix notation -- syst sugar
  //prefix notation
  val x = -1

  print(mary hangOutWith tom)


  // all operators are methods
  // akka actors have ! ?
  println(1.+(2))
  println(1 + 2)
  val y = 1.unary_-

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck?!"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  println(s"x ${x}")
  println(s"y ${y}")

  println(mary.unary_!)
  println(!mary)


  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent

}

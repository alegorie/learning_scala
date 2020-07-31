package part2oop

object OObasic extends App {
  val person = new Person(name = "Andrew", age = 26, nationality = "UK")
  println(person.age)
  println(person.x)
  person.greet("Vitalii")

  val writer = new Author("Andrew", "Lock", 1801)
  val novel = new Novel("MyStory", 1861, writer)


  println(novel.isWrittenBy(writer))
  println(novel.authorAge)


  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
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


/*implement Novel and Author class
writer: (name, surname, year of birth):
- method fullname (concat name + surname)
novel: (name year of release, author):
- author age - age of author where novel released
- isWrittenBy (author)
- copy (new year of release) = new instance  of novel*/


class Author(name: String = "Unknown", surname: String = "Unknown", val year_of_birth: Int = 1980) {
  def fullname: String = name + " " + surname
}

class Novel(name: String = "Unknown", year_of_release: Int = 1900, author: Author) {
  def authorAge: Int = year_of_release - author.year_of_birth

  def isWrittenBy(author: Author) = author.fullname == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}

/* Counter class
  - receive int
  - method current count
  - method to increment
  - overload inc/dec to receive an amount
 */

class Counter(val count: Int = 0) {
  def inc = {
    println("Incrementing")
    new Counter(count + 1)
  } // immutability
  def dec = {
    println("Decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)
}
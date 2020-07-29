package lectures

import scala.annotation.tailrec

object Recursion extends App {
  /* Tail recursion tutorial*/
  //1. Concatenate as string n times

  @tailrec
  def concat(n: Int, aString: String, result: String): String = {
    if (n < 1) result
    else concat(n - 1, aString, result + aString)
  }

  println(concat(5, "Hello", ""))

  // 2. isPrime function with tailrec implementation
  def isPrime(n: Int): Boolean = {
    @tailrechttps://github.com/alegorie/learning_scala.git
    def isPrimeTailrec(t: Int, stillPrime: Boolean): Boolean = {
      if (!stillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && stillPrime)
    }
    isPrimeTailrec(n / 2, true)
  }

    println(isPrime(1337))

  // 3. Fibonacci with tailrec

  def fibonacci(n: Int): Int = {
    @tailrec
    def fibHelper(k: Int, last: Int, next: Int): Int = {
      if (k >= n) last
      else fibHelper(k + 1, last + next, last)
    }
    if (n <= 2) 1
    else fibHelper(2, 1, 1)
  }

  print(fibonacci(7))


}

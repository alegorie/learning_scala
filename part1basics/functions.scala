package lectures.part1basics

object functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def aInc(i: Int): Int = {
    if (i == 10) 1
    else aInc(i + 1)
  }

  println(aInc(10))

  // 1st func children greentings
  def greeting(name: String, age: Int): String = "Hello, my name is " + name + " and my age is " + age
  println(greeting("Yurii", 15))


  // 2nd Factorial
  def aFactorial(n: Int): Int = {
    if (n == 1) 1
    else n * aFactorial(n - 1)
  }
  println(aFactorial(5))

  // 3d Fibonacci

  def seqFibonacci(n: Int): Int = {
    if (n == 1 | n == 2) 1
    else seqFibonacci(n - 1) + seqFibonacci(n - 2)
  }

  println(seqFibonacci(1))

  //4th Tests if a number is prime

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }
  println(isPrime(19))
}


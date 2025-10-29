package iken

object HelloWorld {
  def hello(): Unit = {
    println("Hello, World!")
    println("chuc cac ban 1 ngay moi")
  }
  def main(args: Array[String]): Unit = {
    hello()
  }
  def add(a: Int, b: Int): Int = {
    a + b
  }

}

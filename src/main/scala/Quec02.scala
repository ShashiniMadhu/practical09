import scala.io.StdIn.readLine;

object Quec02 {
  def main(args: Array[String]): Unit = {
    println();
    print("Enter the integer: ");
    val number = readLine().toInt;

    val status = calculate(number);
    println(s"The number $number you given is a $status");
  }

  val negativeOrZero=(Number:Int)=> s"Negative / Zero";
  val even = (Number: Int) => s"Even number";
  val odd = (Number: Int) => s"Odd number";

  def calculate(number:Int): String = {
    if (number <= 0) negativeOrZero(number);
    else if (number%2==0) even(number);
    else odd(number);
  }

}

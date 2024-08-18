import scala.io.StdIn.readLine;

object Quec01 {
    val interest1 = (deposit: Double) => deposit * 0.02;
    val interest2 = (deposit: Double) => deposit * 0.04;
    val interest3 = (deposit: Double) => deposit * 0.035;
    val interest4 = (deposit: Double) => deposit * 0.065;

  def main(args: Array[String]): Unit = {
    println();2
    print("Enter the deposit amount: Rs. ")
    val deposit = readLine().toDouble

    val interest = calculate(deposit)
    println(s"The interest on Rs. $deposit is Rs. $interest")
  }

  def calculate(deposit:Double) : Double = {
    if(deposit <= 20000) interest1(deposit);
    else if (deposit <= 200000) interest2(deposit);
    else if(deposit <= 2000000) interest3(deposit);
    else interest4(deposit);
  }

}

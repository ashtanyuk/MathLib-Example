package simpletest

class MathLib {

  def factorial(x: BigInt): BigInt =
    if(x == 0) 
        1 
    else 
        x * factorial(x-1)   
}

object HelloWorld {
  
  var m = new MathLib
  def main(args: Array[String]) =
    println(m.factorial(5))
}



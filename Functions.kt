fun main(){

   val a = 10
   val b = 20
   val sum = "The sum of $a and $b is ${add(a,b,a)}"
   println(sum)
   val sub = "The sub of $a and $b is ${subtract(a,b)}"
   println(sub)

   printMessage()
   printMessage(4)
   println(isEven(3))

   val str = "Hello"
   val newStr = str.addExclamationMarks(3) // "Hello!!!"
   println(newStr)

   var fn = ::isEven
   println(fn(6))
   
}

// Function
fun add(num1:Int,num2:Int):Int{
    val sum = num1 + num2; return sum
 }

 // Overloading functions
 fun add(num1:Int,num2:Int,num3:Int):Int{
   val sum = num1 + num2 + num3
   return sum
}
 
 // Inline Function / Single expression function
 fun subtract(num1:Int,num2:Int) = num1 - num2

 fun isEven(x: Int) = if (x % 2 == 0) true else false
 
 // named Parameter
 fun printMessage(count:Int = 2){
    for(i in 1..count){
       println("Hello $i")
    }
 }

// Extension Function

 fun String.addExclamationMarks(n: Int): String {
    return this + "!".repeat(n)
}

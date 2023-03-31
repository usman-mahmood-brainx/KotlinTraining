fun main() {

   // Arrays
   val numbers = arrayOf(1, 2, 4, 3, 5)

   val size = numbers.size

   // Iterate over the elements of the array using a for loop
   for (i in numbers) {
      println(i)
   }

   // Sort the array in ascending order
   numbers.sort()
   for (i in numbers.indices) {
      println(i)
   }

   // Check if an element is present in the array
   val containsThree = 3 in numbers // Returns bolean varibale
   println(containsThree)



   // var score = 2
   // val message = "Hello World"
   // print(message)
   // print(score)

   // while(score > 0){
   //    print("Usman")
   //    score--
   // }
   for(i in 1..5 step 2){
      println(i)
   }
   val price = 10.5

   // String interpolation
   val formattedPrice = "The price is \$$price."
   println(formattedPrice)

   val a = 10
   val b = 20
   val sum = "The sum of $a and $b is ${add(a,b)}"
   println(sum)
   val sub = "The sub of $a and $b is ${subtract(a,b)}"
   println(sub)


   // Indices 
   val myList = listOf("apple", "banana", "cherry", "date")
   for (i in myList.indices) {
      println("Element $i: ${myList[i]}")
   }

}
// Function
fun add(num1:Int,num2:Int):Int{
   val sum = num1 + num2
   return sum
}

// Inline Function
fun subtract(num1:Int,num2:Int) = num1 - num2

// Default function
fun printMessage(count:Int = 2){
   for(i in 1..count){
      println("Hello $i")
   }
}



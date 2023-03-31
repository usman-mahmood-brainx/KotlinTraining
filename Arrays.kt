fun main(){
    // Arrays
   val numbers = arrayOf(1, 2, 4, 3, 5)

   var size = numbers.size

   // Iterate over the elements of the array using a for loop
   for (i in numbers) {
      println(i)
   }

   // Sort the array in ascending order
   numbers.sort()

   // Check if an element is present in the array
   val containsThree = 3 in numbers // Returns bolean varibale
   println(containsThree)

   // Indices
//    for (i in numbers.indices) {
//     println(i)
//    }

   // Dynamic Array / Mutable Array
   val dynamicArray = mutableListOf(1, 2, 3, 4, 5)

// Get the size of the list
    size = dynamicArray.size

// Access an element by index
val thirdNumber = dynamicArray[2]
dynamicArray.removeAt(3)

// Iterate over the elements of the list using a for loop
for (number in dynamicArray) {
    println(number)
}

// Remove all elements from the list
dynamicArray.clear()



}
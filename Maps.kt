fun main(){

    // Maps : Mutable and Immutable
   
   // Mutable
   val students = mutableMapOf<Int,String>()
   students.put(1,"Ryan")
   students.put(2,"Ali")
   students.put(3,"Usman")
 
   println(students.get(1))
   println(students.get(11))  // It will print null

    // we can also add element in map like this 
   students[8]= "Jones"

   // Iterating map
   for((key,value) in students){
    println("$key = $value")
   }

   // Immutable Map
   val map = mapOf<Int,String>(1 to "Hello",2 to "World")
   println(map) 



}
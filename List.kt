fun main(){
    // Creating a list of integers
    var intList = listOf(1, 2, 3, 4, 5)
    // Adding an element to a list

    print(intList)

    intList += 6
    print(intList)
    
    intList -= 4
    print(intList)

    // Adding an element to a list at specific element
    intList = intList.take(2) + 4 + intList.drop(1)
    print(intList)


    // Creating a list of strings
    val stringList = listOf("apple", "banana", "orange")
 

    // val name : String
    // name = "Usman Mahmood"
    // for(i in name.indices){
    //     println(name[i])
    // }

    // Creating a list of mixed types
    val mixedList = listOf(1, "two", 3.0, true)

    // Accessing an element in a list
    val firstElement = intList[0]

    
    // Removing an element from a list
    val updatedList = intList - 4

    // Checking if a list contains an element
    val containsElement = stringList.contains("banana")

    // Sorting a list
    val sortedList = intList.sorted()

    // Filtering a list
    val filteredList = intList.filter { it % 2 == 0 }

    // Mapping a list to a new list
    val mappedList = intList.map { it * 2 }

}
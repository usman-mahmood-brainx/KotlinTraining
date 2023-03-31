fun main(){
    val mylist = arrayListOf<String>("apple", "banana", "orange")
    // or 
    // val list = ArrayList<String>()
    // list.add("apple")
    // list.add("banana")
    // list.add("orange")
    // or
    // val list = arrayListOf("apple", "banana", "orange")

    mylist.add("grape")
    mylist.add(2, "pear")
    println(mylist)

    val fruit = mylist.get(1)
    mylist.remove("banana")
    for (fruit in mylist) {
        println(fruit)
    }
    
    // list.forEach { fruit ->
    //     println(fruit)
    // }


}
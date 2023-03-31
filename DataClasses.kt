fun main(){
    val p1 =  Person(1, "John")
    val p2 = Person(1,"John")

    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p2.hashCode())
    println(p1==p2)

    // copying 

    val p3 =p2.copy(id=3)
    println(p3)
    println(p1==p3)


    // Destructuring
    val(id,name) = p1             
    println("$id " + name)

    println(p1.component1()) // Prints Id

    println(p1.getName())
}

data class Person(val id:Int,val name:String){

}
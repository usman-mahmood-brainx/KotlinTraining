fun main(){
    var gender: String = "Male"
    var gender2:String? = null
    

    if (gender2 != null) {
        gender2.uppercase()
    }
    // Or we can use safe call operator

    //gender2 = "Female"
    println(gender2?.uppercase())

    // Executing multiple operations after checking not null with let

    gender2?.let{
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    }

    // ?: symbol is known as the null-coalescing operator,
    // or the Elvis operator. It is used to provide a default value when an expression is null.
    // Alvis operator ?:
    var selectedValue = gender2 ?: "NA"

    // Assert that name is not null and assign it to the non-nullable variable "notNullName"
    val notNullName = gender2!!
    println(notNullName)

}
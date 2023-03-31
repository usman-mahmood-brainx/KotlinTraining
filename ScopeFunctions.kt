fun main(){
    // Scope Functions : apply, let
    val emp = Employee("Usman",23)

    // emp.age = 20
    // emp.name = "alie"

    println(emp)

    // Apply
    emp.apply{
        age = 32
        name = "Hamza" 
    }   // It will return Employee object and also apply it
    println(emp)

    // let
    println(emp.age)
    println(emp.name)

    emp.let{
        println(it.name)
        println(it.age)
    } // Scope return type will be the type of its last expression

    // with is same as let but it is without "it"
    // with

    with(emp){
        age = 30
        name = "XYZ"
    }// Scope return type will be the type of its last expression

    // run
    // Run is combination of with or let
    emp.run{
        age = 35
        name = "PQR"
    }

}
data class Employee(var name:String,var age:Int )
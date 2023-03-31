fun main(){
    val mustang = Car("mustang", "petrol", 1000)

    println(mustang.name)
    mustang.drive()
}

class Car (val name:String, val type: String, var kmRan: Int)
{
    fun drive(){
        println("Car is driving")
    }

    fun applyBrakes(){
        println("Applied Brakes")
    }
}
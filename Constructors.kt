fun main(){
    var person = Person("Usman", 23)

    println(person.name)

    var car = AutoMobile("BMW", "Sedan",5, 1000, true)
    println(car.display())

    var car2 = AutoMobile("Audi", "Sedan")
    println(car2.display())
}

class AutoMobile(val name:String, val type: String,var doors:Int, var kmRan: Int,hasAirBags:Boolean)
{
    // initializer block
    init{
        println("$name is created")
    }

    var airBags = hasAirBags

    init{
        println("2nd Initializer BLock")
    }


    fun drive(){
        println("Car is driving")
    }

    fun applyBrakes(){
        println("Applied Brakes")
    }

    // Secondary Constructors
    constructor(nameParam:String,typeParam:String) : 
        this(nameParam,typeParam,4,500,true)

    fun display():String{
       return " name : $name \n Type: $type \n Doors: $doors" 
    }

    
}

class Person(nameParam:String, ageParam:Int){
    val name:String = nameParam
    

    var age: Int = ageParam
    
}
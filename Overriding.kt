fun main(){
    val oneplus = OnePlus("SmartPhone")
    oneplus.display()
    println(oneplus.type)
    // val generalMobile = Mobile("General")
    // generalMobile.display()
}

open class Mobile(typeParam:String){
    open val name: String = "" 
    open val size: Int = 5
    val type = typeParam

    fun makeCall() = println("Calling from Mobile")
    fun powerOff() = println("Shutting Down")

    // To override a method you want put open keyword before it
    open fun display()= println("Display From Mobile ")

}

class OnePlus(typeParam:String) : Mobile (typeParam){
    
    override val name: String = "One Plus"
    override val size:Int = 6

    // Ovveriding function
    override fun display(){
        super.display()
        println("One Plus Display")
    }
}


fun main(){
    var pizza1 = Pizza.create("Peppy Paneer")
    println(pizza1.type)

}


class Pizza private constructor(val type: String, val toppings:String){
    companion object Factory{
        fun create(pizzaType:String):Pizza{
            return when(pizzaType){
                "Tomato" -> Pizza("Tomato","Tomato,Cheese")
                "Peppy Paneer" -> Pizza("Paneer Farm","Paneer, Chees Burst, Tomato, Onion")
                else -> Pizza("Basic","Onion,Chees")
            }
        }
    }

    override fun toString():String{
        return "Pizza(type=$type,toppings=$toppings)"
    }
}
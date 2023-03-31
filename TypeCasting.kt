fun main(){
    val circle:Shape= Circle(4.0)
    val playerObj= Player("Hamza")
    // playerObj.setName("Usman")
    
    

    // Casting variable to specific type
    val id = 3
    // val strId = id as? String
    val strId = id as? Int
    println(strId)


    // Type Checking
    // if after casting the new variable is not null that means it is of same type
    // But if it is null then that means it is of different type

    val player2 = circle as? Player
    if(player2!= null){
         println("It is a player")
    } 
    else {
        println("it is not a player")
    }

    val arr = arrayOf(circle,playerObj)

    for(obj in arr){
        if(obj is Circle){
            obj.drag()
        }
        else{
            println((obj as Player).getName())
        }
    }



}

fun calculateAreas(shapes:Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}



interface Dragable{
    val dragSpeed:Int
    fun drag()
}

abstract class Shape:Dragable{
    abstract fun draw()
    open fun area(): Double{
        return 0.0
    }
}



class Circle(val radius:Double): Shape(){
    override val dragSpeed = 60
    override fun draw(){

    }
    override fun drag(){
        println("Circle is draggable")
    }

    override fun area():Double {
        return Math.PI * radius * radius
    }
    fun myFunction(){
        println("Circle My Function")
    }
}

class Square(val side:Double) : Shape(){
    override val dragSpeed = 60
    override fun draw(){
        
    }
    override fun area(): Double {
        return side *side
    }
    override fun drag(){
        println("Square is draggable")
    }

}

class Player(nameParam:String) : Dragable{
    private var name = nameParam
    init{
        setName(this.name)
    }
    fun setName(value:String){
        this.name = "Player name is : $value"
    }
    fun getName():String{
        return this.name
    }
    
    override val dragSpeed = 60
    override fun drag(){
        println("Speed of Player $dragSpeed")
    }

}
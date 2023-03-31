fun main(){
    val circle: Shape = Circle(4.0)
    //val square: Shape = Square(4.0)

    // println(circle.area())
    // println(square.area())

    circle.drag()
    val shapes = arrayOf(Circle(3.0),Circle(4.0),Square(4.0))
    calculateAreas(shapes)
    
    val playerObj = Player("Usman")
    playerObj.drag();

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

class Player(val name:String) : Dragable{
    override val dragSpeed = 60
    override fun drag(){
        println("Speed of Player $dragSpeed")
    }
}
fun main(){
    val circle: Shape = Circle(4.0)
    val square: Shape = Square(4.0)

    // println(circle.area())
    // println(square.area())


    val shapes = arrayOf(Circle(3.0),Circle(4.0),Square(4.0))
    calculateAreas(shapes)
}

fun calculateAreas(shapes:Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}

// interface Shape{
//     fun area(): Double{
//         return 0.0
//     }
// }


// abstract class Shape{
//     abstract fun draw()
//     open fun area(): Double{
//         return 0.0
//     }
// }

open class Shape{
    open fun draw(){}
    open fun area(): Double{
        return 0.0
    }
}


class Circle(val radius:Double): Shape(){
    override fun draw(){

    }

    override fun area():Double {
        return Math.PI * radius * radius
    }
}

class Square(val side:Double) : Shape(){
    override fun draw(){
        
    }
    override fun area(): Double {
        return side *side
    }
}
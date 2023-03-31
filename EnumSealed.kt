fun main(){
    // val day = Day.Sunday
    // println(day)
    // println(day.number)

    // for(i in Day.values()){
    //     println(i)
    // }
    // day.printFormattedDay()

    val tile:Tile = Red("Mushroom",25)
    val tile2 = Red("Fire",30)
    
    // println("${tile.points} - ${tile.type}")

    val points = when(tile){
        is Red -> tile.points*2
        is Blue -> tile.points * 5
    }
    println(points)




}

// Enum class
enum class Day(val number:Int){
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Firday(6),
    Saturday(7);

    fun printFormattedDay(){
        println("Day is $this")
    }
}

sealed class Tile
class Red(val type:String,val points:Int):Tile()
class Blue(val points:Int):Tile()
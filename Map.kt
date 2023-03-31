fun main(){
    var map = mapOf("a" to 1, "b" to 2, "c" to 3)

    
    println(map["a"])
    for ((k, v) in map) {
        println("$k -> $v")
    }

    val pair = "Ferrari" to "Katrina"                          // 3
  println(pair)

  infix fun String.onto(other: String) = Pair(this, other)   // 4
  val myPair = "McLaren" onto "Lucas"
  println(myPair)
}
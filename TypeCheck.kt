fun main(){
    val str = "Hello world"
    println(str::class.simpleName)

    // or 
    if(str is String)
        println("It is a String")
}
fun main(){

    // First Method 

    var a = object{
        val x : Int = 10
        fun method(){
            println("I am singleton");
        }
    }

    a.method() 

    println(SharingWidget.fbLikes)
    SharingWidget.fbLikes = 55
    println(SharingWidget.fbLikes)


}

// Second Method
object SharingWidget{
    var twitterLikes = 2
    var fbLikes = 44

    fun incrementTwitterLikes() = twitterLikes++
}
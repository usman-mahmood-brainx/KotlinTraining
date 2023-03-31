fun main(){
    calculateTimeAndRun{
        loop(100)
    }
}

inline fun calculateTimeAndRun(fn:()->Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time Taken : ${end - start} ms")
}

fun loop(n:Long){
    for(i in 1..n){
        println(i)
    }
}
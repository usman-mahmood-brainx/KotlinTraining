fun main(){

    //Assigning function to a variable
    // var fn:(a:Int,b:Int)->Int = ::sum
    var fn = ::sum
    println(allSum(1,2,fn))
    // println(allSum(1,2,::sum))

    println(fn(3,4))

    // Lamdba Expression/Function
    val lambdaSum = {x:Int,y:Int -> x+y}

    val multilinLambda =  

}

fun sum(a:Int,b:Int):Int {
    return a+b
}
fun allSum(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

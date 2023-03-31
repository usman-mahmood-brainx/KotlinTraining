fun main(){

    // Lamdba Expression/Function
    val lambdaSum = {x:Int,y:Int -> x+y}

    val multilinLambda =  {
        println("Hello Lambda")
        val a = 2+3
        a
    }

    val singleParamLambda: (Int) -> Int = {x -> x+x}


    println(singleParamLambda(2))

}
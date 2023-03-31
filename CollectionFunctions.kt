fun main(){
    // Collections Functions : Filter, Map

    val nums = listOf(1,2,3,4,5)
    println(isOdd(3))
    println(isOdd(2))

    // Filter Function

    // Method 1
    val oddlist = nums.filter(::isOdd)

    // Method 2
    // val oddlist = nums.filter(fun (a:Int):Boolean{
    //     return a % 2 != 0
    // })

    // Method 3
    // val oddlist = nums.filter{a:Int -> a % 2 != 0}

    // Method 4
    // val oddlist = nums.filter{ it % 2 != 0}

    println(oddlist)


    // Example 2 

    val userList = listOf(
        User(1,"A"),
        User(2,"B"),
        User(3,"C")
    )

    println(userList.filter{it.id == 2})

    // Map function
    val numSquare = nums.map{it * it}

    println(nums)
    println(numSquare)

    // val paidUsersList = userList.map{PaidUser(it.id,it.name,"Paid")}
    // println(paidUsersList)

    val paidUsersList = userList.filter{it.id == 2}.map{PaidUser(it.id,it.name,"Paid")}
    println(paidUsersList)


    // For Each

    nums.forEach{println(it)}

}

fun isOdd(a:Int):Boolean{
    return a % 2 != 0
}

data class User(val id:Int,val name:String)
data class PaidUser(val id:Int,val name:String,val type:String)
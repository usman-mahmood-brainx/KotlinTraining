fun main(){

     // Lists : Mutable and Immutable
    val ImmutableList = listOf(1,2,3)
    println(ImmutableList.indexOf(2))
    println(ImmutableList.get(2))
    println(ImmutableList.contains(5))

    // It will show error 
    // ImmutableList[2] = 4 

    val nums = mutableListOf(1,2,3)
    nums[2] = 4 
    println(nums.indexOf(2))
    println(nums.get(2))
    println(nums.contains(5))

    // Merging List
    val list2 = listOf(11,12)
    nums.addAll(list2)

    println(nums)



    
}
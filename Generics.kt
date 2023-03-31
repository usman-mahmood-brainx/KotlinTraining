fun main(){
    var intTypeData = Container(2)
    println(intTypeData.getValue())

    var stringTypeData = Container("Usman")
    println(stringTypeData.getValue())

    add(1,2,3,4,5)
}

class Container<T>(var data:T){
    fun setValue(value:T){
        data = value
    }

    fun getValue():T{
        return data
    }
}

fun add(vararg values: Int){
    var sum = 0
    for(i in values){
        sum+=i
    }
    println(sum)
}
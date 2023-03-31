fun main(){
    val obj = Outer()
    obj.i

    // val nested = Outer.Nested()
    val nested = Outer().Nested()
    nested.test()
}
class Outer{
    var i = 4
    inner class Nested{
        fun test(){
            println("I am nested class $i")
        }
    }
}

// class Outer{
//     var i = 4
//     class Nested{
//         fun test(){
//             println("I am nested class ")
//         }
//     }
// }
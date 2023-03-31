fun main(){
    MyClass.gn()
}

class MyClass{
    object MyObject {
        // To access this in java
        @JvmStatic
        fun fn(){
            println("Hello i am F from Object")
        }
    }

    companion object AnotherObject{
        fun fn(){
            println("Hello i am G from Companion Object")
        }
    }
 
}
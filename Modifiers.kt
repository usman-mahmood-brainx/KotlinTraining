fun main(){
    var obj = Child()
    obj.myFunction()
}

open class GrandFather{
    protected fun run(){
        println("GrandFather is running")
    }
}

open class Father:GrandFather(){

}

class Child:Father(){

    fun myFunction(){
        run()
        println("Child is running")
    }
}
open class Phone{
    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    init{
        println("Phone Constructor Called")
        makeCall()

    }
    fun makeCall(){
        println("call From Phone ")

    }

    fun display(){
        println("Display From Phone ")

    }
}

class BasicPhone : Phone() {
    fun getScreenInfo(){
        println("ScreenInfo From Basic Phone ")
    }
}

class SmartPhone : Phone() {
    init{
        println("SmartPhone Constructor Called")
        playMovie()
    }
    fun playMovie(){
        println("playMovie From SmartPhone  ")
    }

    fun takePicture(){

    }

    fun getDeviceInfo(){

    }


}
fun main(){
    var Infinix = SmartPhone();
}
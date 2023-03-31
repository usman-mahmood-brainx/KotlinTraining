import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
fun main(){
    val person = Student("John", 30)
    val jsonString = Json.encodeToString(person)
    
    println(jsonString) // Output: {"name":"John","age":30}


    val deserializedPerson = Json.decodeFromString<Person>(jsonString)

    println(deserializedPerson) // Output: Person(name=John, age=30)
}

@Serializable
data class Student(val name:String, val age:Int)
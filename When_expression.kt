import kotlin.random.Random


fun main(){
    val value = 8
    val ranges = 10..50

    val StringofValue = when(value){
        6 -> {
            println("SIX")
            "Value is 6"
        }
        7 -> {
            println("SEVEN")
            "Value is 7"
        }
        8 -> {
            println("EIGHT")
            "Value is 8"
        }
        else -> {
            println("Undefine")
            "Value cannot be reached"
        }


    }


    println(StringofValue)


    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }



    val anyType: Any = 100L

    //Gunakan if ketika hanya menggunakan 2 situasi
    if(anyType is Long){
        println("The value is Long type")
    }else{
        println("The value is not Long type")
    }

    //Gunakan when ketika menggunakan lebih dari 2 situasi
    when(anyType){
        is Long -> println("The value is Long type")
        is String -> println("The value is String type")
        is  Double -> println("The value is Double type")
        else -> println("Undefined")
    }
}

fun getRegisterNumber() = Random.nextInt(100)
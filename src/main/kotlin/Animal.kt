open class Animal (var name:String?=null, var weight:Double?=null, var length:Double?=null):IBirthday {



    fun Info():String{

        return "Name: ${name}, Weight: ${weight}, Length: ${length} "
    }

    override fun calculateBirthday(currentyear: Int, birthYear: Int): Int {

        return currentyear - birthYear
    }

}
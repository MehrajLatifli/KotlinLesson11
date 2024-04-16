open class Animal (var name:String?=null, var weight:Double?=null, var length:Double?=null):IBirthday {


    fun Info():String{

        return "Name: ${name}, Weight: ${weight}, Length: ${length} "
    }

    override fun calculateAge(currentyear: Int?, birthYear: Int?): Int {

        currentyear?.let{

            birthYear?.let{

                return currentyear - birthYear
            }
        }

        return 0


    }



}
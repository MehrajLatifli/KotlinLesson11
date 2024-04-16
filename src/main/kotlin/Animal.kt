open class Animal (var name:String?=null, var weight:Double?=null, var length:Double?=null, var parentArrayList: ArrayList<Animal>?=null):IBirthday {


    fun Info():String{

        val parentArrayListInfo = parentArrayList?.joinToString(", ") { it.name.toString() } ?: "There is no information about the animal's parents."

        return "Name: ${name}, Weight: ${weight}, Length: ${length} , The animal's parents: ${parentArrayListInfo}"
    }

    override fun calculateAge(currentyear: Int?, birthYear: Int?):String {

        currentyear?.let{

            birthYear?.let{

                return (currentyear - birthYear).toString()
            }
        }

        return "Age cannot be calculated. Because there is a lack of information."


    }



}
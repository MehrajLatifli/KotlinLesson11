package Models.Classes

import Models.Enums.FurType

data class Cat(var isUngrateful:Boolean?=null, var name_2:String? = null, var weight_2:Double? = null, var length_2:Double? = null, var furType_2: FurType? = null, var parentArrayList_2: ArrayList<Animal>? = null):Animal(name_2,weight_2,length_2,furType_2,parentArrayList_2)  {

    fun Sweety(sweety:Boolean?=null):String{

        sweety?.let{

            if(sweety==true)
            {
                return "The cat is sweety."
            }
            else{

                return "The cat is not sweety."
            }
        }
        return  "The value named sweety must not be empty."
    }

    fun isUngrateful():String{

        isUngrateful?.let{

            if(isUngrateful==true)
            {
                return "The dog is ungrateful."
            }
            else{

                return "The dog is not ungrateful."
            }
        }
        return  "The value named ungrateful must not be empty."
    }
}
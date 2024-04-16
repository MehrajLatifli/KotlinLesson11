class Cat (var isUngrateful:Boolean?=null, var name_1:String, var weight_2:Double, var length_2:Double):Animal(name_1,weight_2,length_2)  {

    fun Sweety(sweety:Boolean?=null):String{

        sweety?.let{

            if(sweety==true)
            {
                return "The cat is sweety"
            }
            else{

                return "The cat is not sweety"
            }
        }
        return  "The value named sweety must not be empty."
    }

    fun isUngrateful():String{

        isUngrateful?.let{

            if(isUngrateful==true)
            {
                return "The dog is isUngrateful"
            }
            else{

                return "The dog is not isUngrateful"
            }
        }
        return  "The value named isUngrateful must not be empty."
    }
}
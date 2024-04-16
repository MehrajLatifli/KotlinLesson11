class Cat (var sweety:Boolean?=null, var name_1:String, var weight_2:Double, var length_2:Double):Animal(name_1,weight_2,length_2)  {

    fun Sweety(Sweety:Boolean):String{

        Sweety?.let{

            if(Sweety==true)
            {
                return "The cat is sweety"
            }
            else{

                return "The cat is not sweety"
            }
        }
        return  "The value named sweety must not be empty."
    }
}
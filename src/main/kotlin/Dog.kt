 class Dog(var friendly:Boolean?=null, var name_1:String, var weight_2:Double, var length_2:Double):Animal(name_1,weight_2,length_2) {

     fun Friendly(friendly:Boolean):String{

         friendly?.let{

             if(friendly==true)
             {
                 return "The dog is friendly"
             }
             else{

                 return "The dog is not friendly"
             }
         }
        return  "The value named friendly must not be empty."
     }
}
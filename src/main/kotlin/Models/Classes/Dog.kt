package Models.Classes

import Models.Enums.FurType

data class Dog(var isWild:Boolean?=null, var name_1:String? = null, var weight_1:Double? = null, var length_1:Double? = null, var furType_1: FurType? = null, var parentArrayList_1: ArrayList<Animal>? = null):Animal(name_1,weight_1,length_1,furType_1,parentArrayList_1) {

     fun Friendly(friendly:Boolean?=null):String{

         friendly?.let{

             if(friendly==true)
             {
                 return "The dog is friendly."
             }
             else{

                 return "The dog is not friendly."
             }
         }
        return  "The value named friendly must not be empty."
     }


     fun isWild():String{

         isWild?.let{

             if(isWild==true)
             {
                 return "The dog is wild."
             }
             else{

                 return "The dog is not wild."
             }
         }
         return  "The value named wild must not be empty."
     }
}
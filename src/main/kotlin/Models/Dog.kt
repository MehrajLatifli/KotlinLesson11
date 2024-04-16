package Models

class Dog(var isWild:Boolean?=null, var name_1:String, var weight_2:Double, var length_2:Double, var parentArrayList_2: ArrayList<Animal>?):
    Animal(name_1,weight_2,length_2,parentArrayList_2) {

     fun Friendly(friendly:Boolean?=null):String{

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

     fun isWild():String{

         isWild?.let{

             if(isWild==true)
             {
                 return "The dog is isWild"
             }
             else{

                 return "The dog is not isWild"
             }
         }
         return  "The value named isWild must not be empty."
     }
}
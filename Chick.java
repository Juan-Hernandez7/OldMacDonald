class Chick implements Animal 
{
 

  private String myType;     
     private String mySound;      
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick()     {         
         myType = "Chick";
         
         if(Math.random()<.5)
         {
           mySound = "cluck";

         }
         else
         {
         	mySound = "cheep";
         }

              
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;}    //your code here 
}

class Pig implements Animal //implements Animal 
{     
   private String myType;     
     private String mySound;      
     public Pig(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Pig()     {         
         myType = "Pig";
         mySound = "oink";    
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;}    //your code here 
  //your code here
}

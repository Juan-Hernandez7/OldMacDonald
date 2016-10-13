class NamedCow extends Cow
{
  public Cow(String type, String name,String sound)  
        {         
         myType = type;         
         mySound = sound;
         myName = name;     
        }     

     public cow()
     {

     	myType= "cow";
     	myName="Elsie";
     	mySound= "moo"
     }
     public String getName(){return myName;}
}
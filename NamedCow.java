class NamedCow extends Cow
{
	private String myName,myType,mySound;
  public NamedCow(String type, String name,String sound)  
        {    myType= type;     
         myName = name;   
         mySound= sound;  
        }     

     public NamedCow()
     {
     	myType = "cow";
     	myName="Elsie";
     	mySound="moo";
     	
     	
     }
     
     
     
     public String getName(){return myName;}
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
          
}
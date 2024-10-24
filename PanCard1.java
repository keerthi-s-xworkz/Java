class PanCard1{
	
  String panNumber;
  String name;
  String fatherName;
  String dateOfBirth;
  
             public PanCard1(String pn,String nm,String fn,String dob){
    System.out.println("pancard constructor is invoked");
       panNumber=pn;
	   name=nm;
	   fatherName=fn;
	   dateOfBirth=dob;
	   
 }
 
  public void getPanCardDetails(){
	  System.out.println("the pan card panNumber is:"+panNumber);
	  System.out.println("the pan card name is:"+name);
	  System.out.println("the pan card fatherName is:"+fatherName);
	  System.out.println("the pan card dateOfBirth is:"+dateOfBirth);
  }
}
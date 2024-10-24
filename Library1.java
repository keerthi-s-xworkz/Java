class Library1{
  
  long libraryId;
  String address;
  String type;
  String libraryOwnerName;
  
       public Library1(long id ,String add,String tp,String own){
    System.out.println("library constructor is invoked");
       libraryId=id;
	   address=add;
	   type=tp;
	   libraryOwnerName=own;
	   
 }
 
  public void fetchLibraryDetails(){
	  System.out.println("the library id is:"+libraryId);
	   System.out.println("the library address is:"+address);
	    System.out.println("the library type is:"+type);
		 System.out.println("the library libraryOwnerName is:"+libraryOwnerName);
  }
}
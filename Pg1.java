class Pg1{
  String pgOwner;
  int rent;
  int noOfFloors;
  String pgAddress;
  
        public Pg1(String own,int rnt,int flr,String add){
    System.out.println("pg constructor is invoked");
       pgOwner=own;
	   rent=rnt;
	   noOfFloors=flr;
	   pgAddress=add;
 }
 
 
  public void fetchPgDetails(){
	  System.out.println("the pg owner name is :"+pgOwner);
	  System.out.println("the pg  rent is :"+rent);
	  System.out.println("the pg  noOfFloors is :"+noOfFloors);
	  System.out.println("the pg  pgAddress is :"+pgAddress);
  }
  
}
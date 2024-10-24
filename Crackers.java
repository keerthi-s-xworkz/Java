class Crackers{
 int crackerId;
 String crackerName;
 double price;
 String crackerType;
 
 public Crackers(){
	 this(1,"flowerpot");
	 System.out.println("no arg i.e ,string constructor is invoked");
 }
 
 public Crackers(int crackerId,String crackerName){
	 this(1000.00,"sparkling");
	 System.out.println("2 arg i.e ,string constructor is invoked");
 this.crackerId=crackerId;
 this.crackerName=crackerName;

 }
 public void spark(){
	 
 }
 public  Crackers(double price,String crackerType){
	 System.out.println("2 arg i.e ,string constructor is invoked");
	 this.price=price;
 this.crackerType=crackerType;
 }
 public void getCrackerDetails(){
 System.out.println("the cracker  id is :"+crackerId);
  System.out.println("the cracker  name is :"+crackerName);
  System.out.println("the cracker  price is :"+price);
  System.out.println("the cracker  type is :"+crackerType);
 
 }
}
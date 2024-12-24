class Hotel{
 int foodPrice;
 String hotelName;
 String hotelAddress;
 String foodName;
 
 public void(){
	 
 }
 public Hotel(int foodPrice,String hotelName){
	 this(100,"abhiruchi");
	 System.out.println("constructor is invoked");
     this.foodPrice=foodPrice;
     this.hotelName=hotelName;

 }
 public void fetchHotelDetails(){
 System.out.println("the hotel food price is :"+foodPrice);
 System.out.println("the hotel name is:"+hotelName);
 System.out.println("the hotel address is :"+hotelAddress);
 System.out.println("the hotel food name is:"+foodName);
 }
}
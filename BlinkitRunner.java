class BlinkitRunner{
 public static void main(String[]delivery){
	String foodName="lemon rice";
	
double price=Blinkit1.Search(foodName);
System.out.println("the price of " + foodName +" is "+price);

double priceWithQuantity= Blinkit1.search(foodName,3);
System.out.println("the price of " + foodName +" is "+priceWithQuantity);
}

}
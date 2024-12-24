class SwiggyTester{
 public static void main(String[]delivery){
	String foodName="Burger";
	
double price=Swiggy1.Search(foodName);
System.out.println("the price of " + foodName +" is "+price);

double priceWithQuantity= Swiggy1.search(foodName,3);
System.out.println("the price of " + foodName +" is "+priceWithQuantity);
}

}
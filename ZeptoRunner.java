class ZeptoRunner{
 public static void main(String[]delivery){
	String foodName="gulab jamun";
	
double price=Zepto1.Search(foodName);
System.out.println("the price of " + foodName +" is "+price);

double priceWithQuantity= Zepto1.search(foodName,3);
System.out.println("the price of " + foodName +" is "+priceWithQuantity);
}

}
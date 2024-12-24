class ZomatoRunner{
 public static void main(String[]delivery){
	String foodName="upma";
	
double price=Zomato1.Search(foodName);
System.out.println("the price of " + foodName +" is "+price);

double priceWithQuantity= Zomato1.search(foodName,4);
System.out.println("the price of " + foodName +" is "+priceWithQuantity);
}

}
class EatClubRunner{
 public static void main(String[]delivery){
	String foodName="kolkata biryani";
	
double price=EatClub1.Search(foodName);
System.out.println("the price of " + foodName +" is "+price);

double priceWithQuantity= EatClub1.search(foodName,4);
System.out.println("the price of " + foodName +" is "+priceWithQuantity);
}

}
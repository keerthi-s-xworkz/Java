class Zomato{
	
public static void main(String args[]){
	
double price=Search("upma");
System.out.println("the price of the upma is "+price);

double price1=Search("poha");
System.out.println("the price of the poha is "+price1);

double price2=Search("vada");
System.out.println("the price of the vada is "+price2);

double price3=Search("masala dosa");
System.out.println("the price of the masala dosa is "+price3);

double price4=Search("avalakii");
System.out.println("the price of the avalakki is "+price4);

double price5=Search("noodles");
System.out.println("the price of the noodles is "+price5);

double price6=Search("rava dosa");
System.out.println("the price of the rava dosa is "+price6);

double price7=Search("parata");
System.out.println("the price of the parata is "+price7);

double price8=Search("onion dosa");
System.out.println("the price of the onion dosa is "+price8);

double price9=Search("ragi dosa");
System.out.println("the price of the ragi dosa is "+price9);

double price10=Search("vadape");
System.out.println("the price of the vadape is "+price10);

double price11=Search("besibelebath");
System.out.println("the price of the besibelebath is "+price11);

double price12=Search("ghee rice");
System.out.println("the price of the ghee rice is "+price12);

double price13=Search("sizzawan rice");
System.out.println("the price of the sizzawan rice is "+price13);

double price14=Search("menthirice");
System.out.println("the price of the menthirice is "+price14);

}
public static double Search(String foodName){
  if(foodName=="upma"){
  return 25.34;
  }
   if(foodName=="poha"){
  return 29.34;
  }
  if(foodName=="vada"){
  return 45.55;
  }
  if(foodName=="masala dosa"){
  return 60.34;
  }
  if(foodName=="avalakii"){
  return 81.34;
  }
  if(foodName=="noodles"){
  return 42.98;
  }
  if(foodName=="rava dosa"){
  return 50.12;
  }
  if(foodName=="parata"){
  return 35.65;
  }
  if(foodName=="onion dosa"){
  return 71.92;
  }
  if(foodName=="ragi dosa"){
  return 21.90;
  }
  if(foodName=="vadape"){
  return 45.93;
  }
  if(foodName=="besibelebath"){
  return 23.99;
  }
  if(foodName=="ghee rice"){
  return 65.72;
  }
  if(foodName=="sizzawan rice"){
  return 56.03;
  }
  if(foodName=="menthirice"){
  return 45.98;
  }
  else{
	  System.out.println("food not found");
  }
  return 34.90;
}
}
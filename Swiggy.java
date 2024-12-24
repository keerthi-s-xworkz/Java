class Swiggy{
public static void main(String args[]){
	
double price=Search("pizza");
System.out.println("the price of the pizza is "+price);

double price1=Search("burger");
System.out.println("the price of the burger is "+price1);

double price2=Search("idli");
System.out.println("the price of the idli is "+price2);

double price3=Search("dosa");
System.out.println("the price of the dosa is "+price3);

double price4=Search("tomato rice");
System.out.println("the price of the tomato rice is "+price4);

double price5=Search("maggi");
System.out.println("the price of the maggi is "+price5);

double price6=Search("roti");
System.out.println("the price of the roti is "+price6);

double price7=Search("chapathi");
System.out.println("the price of the chapathi is "+price7);

double price8=Search("thalipat");
System.out.println("the price of the thalipat is "+price8);

double price9=Search("akki roti");
System.out.println("the price of the akki roti is "+price9);

double price10=Search("puri");
System.out.println("the price of the puri is "+price10);

double price11=Search("colour rice");
System.out.println("the price of the colour rice is "+price11);

double price12=Search("pongal");
System.out.println("the price of the pongal is "+price12);

double price13=Search("pulighorii");
System.out.println("the price of the pulighorii is "+price13);

double price14=Search("veg rice");
System.out.println("the price of the veg rice is "+price14);

}
public static double Search(String foodName){
  if(foodName=="pizza"){
  return 83.99;
  }
   if(foodName=="Burger"){
  return 93.34;
  }
  if(foodName=="idli"){
  return 45.55;
  }
  if(foodName=="dosa"){
  return 60.34;
  }
  if(foodName=="tomato rice"){
  return 80.90;
  }
  if(foodName=="maggi"){
  return 40.23;
  }
  if(foodName=="roti"){
  return 50.88;
  }
  if(foodName=="chapathi"){
  return 30.54;
  }
  if(foodName=="thalipat"){
  return 70.67;
  }
  if(foodName=="akki roti"){
  return 34.21;
  }
  if(foodName=="puri"){
  return 39.98;
  }
  if(foodName=="colour rice"){
  return 35.34;
  }
  if(foodName=="pongal"){
  return 25.82;
  }
  if(foodName=="pulighorii"){
  return 45.98;
  }
  if(foodName=="veg rice"){
  return 39.50;
  }
  else{
	  System.out.println("food not found");
  }
  return 99.80;
}
}
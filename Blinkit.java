class Blinkit{
public static void main(String rice[]){
double price=Search("lemon rice");
System.out.println("the price of the lemon rice is "+price);

double price1=Search("coconent rice");
System.out.println("the price of the coconent rice is "+price1);

double price2=Search("tawa pulao");
System.out.println("the price of the tawa pulao is "+price2);

double price3=Search("curd rice");
System.out.println("the price of the curd rice is "+price3);

double price4=Search("pudina rice");
System.out.println("the price of the pudina rice is "+price4);

double price5=Search("potato rice");
System.out.println("the price of the potato rice is "+price5);

double price6=Search("sushi");
System.out.println("the price of the sushi is "+price6);

double price7=Search("biryani");
System.out.println("the price of the biryani is "+price7);

double price8=Search("jeera rice");
System.out.println("the price of the jeera rice is "+price8);

double price9=Search("veg pulao");
System.out.println("the price of the veg pulao is "+price9);

double price10=Search("brown rice");
System.out.println("the price of the brown rice is "+price10);

double price11=Search("glutinousrice");
System.out.println("the price of the glutinousrice is "+price11);

double price12=Search("fried rice");
System.out.println("the price of the fried riceis "+price12);

double price13=Search("veg biryani");
System.out.println("the price of the veg biryani is "+price13);

double price14=Search("plainrice");
System.out.println("the price of the plainrice is "+price13);

}
public static double Search(String foodName){
  if(foodName=="lemon rice"){
  return 25.34;
  }
   if(foodName=="coconent rice"){
  return 29.34;
  }
  if(foodName=="tawa pulao"){
  return 45.55;
  }
  if(foodName=="curd rice"){
  return 60.34;
  }
  if(foodName=="pudina rice"){
  return 81.34;
  }
  if(foodName=="potato rice"){
  return 42.98;
  }
  if(foodName=="sushi"){
  return 50.12;
  }
  if(foodName=="biryani"){
  return 35.65;
  }
  if(foodName=="jeera rice"){
  return 71.92;
  }
  if(foodName=="veg pulao"){
  return 21.90;
  }
  if(foodName=="brown rice"){
  return 45.93;
  }
  if(foodName=="glutinousrice"){
  return 23.99;
  }
  if(foodName=="fried rice"){
  return 65.72;
  }
  if(foodName=="veg biryani"){
  return 56.03;
  }
  if(foodName=="plainrice"){
  return 45.98;
  }
  else{
	  System.out.println("rice is not found");
  }
  return 34.90;
}
}
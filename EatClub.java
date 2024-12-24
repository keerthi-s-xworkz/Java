class EatClub{
public static void main(String args[]){
double price=Search("kolkata biryani");
System.out.println("the price of the kolkata biryani is "+price);

double price1=Search("sindhi biryani");
System.out.println("the price of the sindhi biryani is "+price1);

double price2=Search("memoni biryani");
System.out.println("the price of the memoni biryani is "+price2);

double price3=Search("ambur biryani");
System.out.println("the price of the ambur biryani is "+price3);

double price4=Search("hyderbadi biryani");
System.out.println("the price of the hyderbadi biryani is "+price4);

double price5=Search("dindigul biryani");
System.out.println("the price of the dindigul biryani is "+price5);

double price6=Search("paella");
System.out.println("the price of the paella is "+price6);

double price7=Search("risotto");
System.out.println("the price of the risotto is "+price7);

double price8=Search("egg fried rice");
System.out.println("the price of the egg fried rice is "+price8);

double price9=Search("croissant");
System.out.println("the price of the croissant is "+price9);

double price10=Search("aloo gobi");
System.out.println("the price of the aloo gobi is "+price10);

double price11=Search("gobi rice");
System.out.println("the price of the gobi rice is "+price11);

double price12=Search("paneer rice");
System.out.println("the price of the paneer rice is "+price12);

double price13=Search("butter chicken");
System.out.println("the price of the butter chicken is "+price13);

double price14=Search("chilli rice");
System.out.println("the price of the chilli rice is "+price13);

}
public static double Search(String foodName){
  if(foodName=="kolkata biryani"){
  return 80.34;
  }
   if(foodName=="sindhi biryani"){
  return 56.34;
  }
  if(foodName=="memoni biryani"){
  return 45.55;
  }
  if(foodName=="ambur biryani"){
  return 75.34;
  }
  if(foodName=="hyderbadi biryani"){
  return 120.34;
  }
  if(foodName=="dindigul biryani"){
  return 42.98;
  }
  if(foodName=="paella"){
  return 59.12;
  }
  if(foodName=="risotto"){
  return 106.65;
  }
  if(foodName=="egg fried rice"){
  return 91.92;
  }
  if(foodName=="croissant"){
  return 21.90;
  }
  if(foodName=="aloo gobi"){
  return 54.93;
  }
  if(foodName=="gobi rice"){
  return 65.99;
  }
  if(foodName=="paneer rice"){
  return 45.72;
  }
  if(foodName=="butter chicken"){
  return 32.03;
  }
  if(foodName=="chilli rice"){
  return 98.98;
  }
  else{
	  System.out.println("biryani not found");
  }
  return 86.90;
}
}
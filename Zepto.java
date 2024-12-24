class Zepto{
public static void main(String sweet[]){
double price=Search("gulab jamun");
System.out.println("the price of the gulab jamun is "+price);

double price1=Search("kheer");
System.out.println("the price of the kheer is "+price1);

double price2=Search("mysore park");
System.out.println("the price of the mysore park is "+price2);

double price3=Search("gajar ka halwa");
System.out.println("the price of the gajar ka halwa is "+price3);

double price4=Search("jalebi");
System.out.println("the price of the jalebi is "+price4);

double price5=Search("barfi");
System.out.println("the price of the barfi is "+price5);

double price6=Search("rasgulla");
System.out.println("the price of the rasgulla is "+price6);

double price7=Search("kaju katli");
System.out.println("the price of the kaju katli is "+price7);

double price8=Search("kulfi");
System.out.println("the price of the kulfi is "+price8);

double price9=Search("laddu");
System.out.println("the price of the laddu is "+price9);

double price10=Search("lassi");
System.out.println("the price of the lassi is "+price10);

double price11=Search("cookies");
System.out.println("the price of the cookies is "+price11);

double price12=Search("ghevar");
System.out.println("the price of the ghevar is "+price12);

double price13=Search("rasmalai");
System.out.println("the price of the rasmalai is "+price13);

double price14=Search("motichoor laddu");
System.out.println("the price of the motichoor laddu is "+price13);

}
public static double Search(String foodName){
  if(foodName=="gulab jamun"){
  return 25.34;
  }
   if(foodName=="kheer"){
  return 29.34;
  }
  if(foodName=="mysore park"){
  return 45.55;
  }
  if(foodName=="gajar ka halwa"){
  return 60.34;
  }
  if(foodName=="jalebi"){
  return 81.34;
  }
  if(foodName=="barfi"){
  return 42.98;
  }
  if(foodName=="rasgulla"){
  return 50.12;
  }
  if(foodName=="kaju katli"){
  return 35.65;
  }
  if(foodName=="kulfi"){
  return 31.92;
  }
  if(foodName=="laddu"){
  return 21.45;
  }
  if(foodName=="lassi"){
  return 65.93;
  }
  if(foodName=="cookies"){
  return 23.12;
  }
  if(foodName=="ghevar"){
  return 65.02;
  }
  if(foodName=="rasmalai"){
  return 32.23;
  }
  if(foodName=="motichoor laddu"){
  return 47.03;
  }
  else{
	  System.out.println("sweet not found");
  }
  return 25.90;
}
}
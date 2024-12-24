class Swiggy1{
public static double Search(String foodName){
if(foodName=="pizza"){
  return 83.99;
  }
   if(foodName=="Burger"){
  return 93.34;
  }
  else{
  System.out.println("food name not found");
  }
  return 0.0;
}
public static double search(String foodName,int quantity){
	if(foodName=="pizza"){
  return 83.99*quantity;
	}
  return 0.0;
}
}
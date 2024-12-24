class Zomato1{
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
  else{
  System.out.println("food name not found");
  }
  return 0.0;
}
public static double search(String foodName,int quantity){
	if(foodName=="upma"){
  return 35.99*quantity;
	}
  return 0.0;
}
}
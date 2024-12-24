class Zepto1{
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
  else{
  System.out.println("sweet not found");
  }
  return 0.0;
}
public static double search(String foodName,int quantity){
	if(foodName=="gulab jamun"){
  return 82.32*quantity;
	}
  return 0.0;
}
}
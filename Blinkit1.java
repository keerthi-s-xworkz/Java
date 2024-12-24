class Blinkit1{
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
  else{
	  System.out.println("rice is not found");
  }
  return 34.90;
}
public static double search(String foodName,int quantity){
	if(foodName=="lemon rice"){
  return 55.59*quantity;
	}
  return 0.0;
}
}
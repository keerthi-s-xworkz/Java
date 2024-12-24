class EatClub1{
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
  else{
	  System.out.println("biryani not found");
  }
  return 86.90;
}
public static double search(String foodName,int quantity){
	if(foodName=="kolkata biryani"){
  return 235.65*quantity;
	}
  return 0.0;
}
}
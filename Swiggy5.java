class Swiggy5{
    public static void main(String[]args){
        double Price=Search("Pizza");
        double Price1=Search("burger");
	System.out.println("the swiggy is"+Price);
	System.out.println("the swiggy is"+Price1);
	
    }
    public static double Search(String foodname){
        if(foodname=="Pizza"){
        return 34.09;
    }
    if (foodname=="burger"){
        return 56.84;
    }
    else{
        System.out.println("foodname npt found");
    }
       return 67.90;
}
}
class Harpic1{
  int quantity;
  long id;
  int price;
  String color;
  
      public Harpic1(int qual,long i,int p,String clr){
    System.out.println("Harpic constructor is invoked");
       quantity=qual;
       id=i;
       price=p;
       color=clr;
 }
 
              public void fetchHarpicDetails(){
	            System.out.println("the harpic quantity is :"+quantity);
				System.out.println("the harpic id is :"+id);
				System.out.println("the harpic price is :"+price);
				System.out.println("the harpic color is :"+color);
  }
  
}
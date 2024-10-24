class IceCream1{
  
  long id;
  int quantity;
  String brand;
  String flavors;
  String type;
  
  public IceCream1(long i,int qul,String br,String fla,String tp){
    System.out.println("icecream  constructor is invoked");
       id=i;
       quantity=qul;
       brand=br;
       flavors=fla;
      type=tp;
 }
      public void getIceCreamDetails(){
	  System.out.println("the ice cream id is :"+id);
	  System.out.println("the ice cream quantity is :"+quantity);
	  System.out.println("the ice cream brand is :"+brand);
	  System.out.println("the ice cream flavors is :"+flavors);
	  System.out.println("the ice cream type is :"+type);
	  
  }
  
}
class TubeLight1{
  
  long id;
  int price;
  String brand;
  int voltage;
  
      public TubeLight1(long i,int p,String br,int vtg){
    System.out.println("tublight constructor is invoked");
       id=i;
       price=p;
       brand=br;
       voltage=vtg;
 }
  
  public void fetchTubeLightDetails(){
	  System.out.println("the tublight id is:"+id);
	  System.out.println("the tublight price is:"+price);
	  System.out.println("the tublight brand is:"+brand);
	  System.out.println("the tublight voltage is:"+voltage);
	  
	  
  }
  
}
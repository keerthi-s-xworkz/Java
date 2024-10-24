class Wallet1{
  
  String id;
  String color;
  String brand;
  int noOfCompartments;
  
       public Wallet1(String i,String clr,String br,int comp){
    System.out.println("wallet constructor is invoked");
       id=i;
       color=clr;
       brand=br;
       noOfCompartments=comp;
 }
  
  
          public void getWalletDetails(){
	             System.out.println("the wallet id is :"+id);
	             System.out.println("the wallet color is :"+color);
	             System.out.println("the wallet brand is :"+brand);
		         System.out.println("the wallet noOfCompartments is :"+noOfCompartments);
  }
  
}
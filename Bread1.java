class Bread1{
  String type;
  int noOfSlices;
  String brandName;
  
      public Bread1(String tp,int sli,String br){
    System.out.println("bread constructor is invoked");
       type=tp;
	   noOfSlices=sli;
	   brandName=br;
	   
 }
 
 
  public void getBreadDetails(){
	  System.out.println("the bread type is :"+type);
	  System.out.println("the bread noOfSlices is :"+noOfSlices);
	  System.out.println("the bread brandName is :"+brandName);
	  
  }
  
}
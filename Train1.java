class Train1{
  long trainNo;
  int noOfCoaches;
  String trainName;
  
   public Train1(long tr,int coa,String tn){
    System.out.println("train constructor is invoked");
       trainNo=tr;
	   noOfCoaches=coa;
	   trainName=tn;
	   
 }
  public void getTrainDetails(){
	  System.out.println("the train of trainNo is:"+trainNo);
	  System.out.println("the train of noOfCoaches are:"+noOfCoaches);
	  System.out.println("the train of trainName is:"+trainName);
	  
  }
  }
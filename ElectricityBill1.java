class ElectricityBill1{
  String rrNo;
  long accountId;
  String address;
  
   public ElectricityBill1(String rn,long acc,String add){
    System.out.println("electric bill constructor is invoked");
       rrNo=rn;
	   accountId=acc;
	   address=add;
	   
 }
 
  public void fetchElectricityBill(){
	  System.out.println("the electric city rrno is:"+rrNo);
	  System.out.println("the electric city accountId is:"+accountId);
	  System.out.println("the electric city address is:"+address);
  }
}
class TrainTicket1{
  long trainPnrNo;
  int age;
  String name;
  String gender;
  
   public TrainTicket1(long trno,int a,String nm,String g){
    System.out.println("train ticket constructor is invoked");
       trainPnrNo=trno;
	   age=a;
	   name=nm;
	   gender=g;
	   
 }
  public void displayTrainTicketDetails(){
	  System.out.println("the train ticket pnrno is:"+trainPnrNo);
	  System.out.println("the train ticket age is:"+age);
	  System.out.println("the train ticket name is:"+name);
	  System.out.println("the train ticket gender is:"+gender);
  }
}
class TrainingBatch1{
  int noOfTrinees;
  String batchName;
  String trainerName;
  String instituteName;
  
   public TrainingBatch1(int nt,String bn,String tn,String in){
    System.out.println("training batch constructor is invoked");
       noOfTrinees=nt;
	   batchName=bn;
	   trainerName=tn;
	   instituteName=in;
	   
 }
  public void displayTrainingBatchDetails(){
	  System.out.println("the training batch of noOfTrinees are:"+noOfTrinees);
	  System.out.println("the training batch of batchName is:"+batchName);
	  System.out.println("the training batch of trainerName are:"+trainerName);
	  System.out.println("the training batch of instituteName is:"+instituteName);
  }
}
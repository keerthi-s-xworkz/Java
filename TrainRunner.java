class TrainRunner{

public static void main(String train[]){
 Train train1=new Train();
 
 train1.trainNo=12442L;
 train1.noOfCoaches=24;
 train1.trainName="Vande Bharat Express";
 train1.getTrainDetails();
 
 Train tar=new Train();
 
 tar.trainNo=8453L;
 tar.noOfCoaches=54;
 tar.trainName="Rajdhani Expess";
 tar.getTrainDetails();
 
 }

}
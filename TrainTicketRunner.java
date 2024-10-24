class TrainTicketRunner{

public static void main(String train[]){
 TrainTicket ticket=new TrainTicket();
 
 ticket.trainPnrNo=8460474720L;
 ticket.age=21;
 ticket.name="keerthi";
 ticket.gender="female";
 ticket.displayTrainTicketDetails();
 
 TrainTicket tari=new TrainTicket();
 
 tari.trainPnrNo=847853L;
 tari.age=23;
 tari.name="manjula";
 tari.gender="female";
 tari.displayTrainTicketDetails();
 
 }

}
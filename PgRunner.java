class PgRunner{

public static void main(String args[]){
 Pg stay=new Pg();
 
 stay.pgOwner="meghana";
 stay.rent=6000;
 stay.noOfFloors=2;
 stay.pgAddress="5th block 64th cross rajajinagar";
 stay.fetchPgDetails();
 Pg live=new Pg();
 
 live.pgOwner="deeksha";
 live.rent=8000;
 live.noOfFloors=4;
 live.pgAddress="basaveshwar nagar 5th cross ballari";
 live.fetchPgDetails();
 
 }

}
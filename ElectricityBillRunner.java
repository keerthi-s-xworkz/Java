class ElectricityBillRunner{

public static void main(String bill[]){
 ElectricityBill electricity=new ElectricityBill();
 
 electricity.rrNo="14543E";
 electricity.accountId=1100157649L;
 electricity.address="th petrolem corp,near majestic bus station,malleswaram";
 electricity.fetchElectricityBill();
 
 ElectricityBill elect=new ElectricityBill();
 
 elect.rrNo="56738H";
 elect.accountId=7487427837L;
 elect.address="basaveshwar nagar,near sangameshwar temple,ballari";
 elect.fetchElectricityBill();
 
 }

}
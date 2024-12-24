class Tv{
static boolean isConnected;
static int currentVolume;
static int increaseVolume=5;
static int decreaseVolume;
public static void main(String args[]){
System.out.println("main Started");
boolean channels=onOrOff();
System.out.println("Tv isconnected is "+channels);
channels=onOrOff();
System.out.println("tv is connected is"+channels);

channels=onOrOff();
System.out.println("tv is connected is"+channels);
 increaseVolume();
 increaseVolume();
 increaseVolume();
 increaseVolume();
 increaseVolume();
 
  
 System.out.println("main ended");
}
public static boolean onOrOff(){
System.out.println("start of turned onOrOff");
isConnected=!isConnected?true:false;
System.out.println("end of turn onOrOff");
return isConnected;
}
public static void increaseVolume(){
	System.out.println("start increasing the volume of tv ");
	if (isConnected==true){
		if(currentVolume<increaseVolume){
			currentVolume=currentVolume+1;
			System.out.println("the current volume is incresed "+currentVolume);
           }else{
			System.out.println("maximum voulme is reached"+currentVolume);
		   }
          }else{
			System.out.println("switch on the Tv");
  }
}	
}
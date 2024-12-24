class HeadSets{
 static boolean isConnected;
 static int currentVolume;
 static int increaseVolume=5;
 static int decreaseVolume;
public static void main(String args[]){
System.out.println("start of main");
 boolean thing=onOrOff();
 System.out.println("headsets are connected "+thing);
 thing=onOrOff();
 System.out.println("headsets are connected "+thing);
 thing=onOrOff();
 System.out.println("headsets are connected "+thing);
 increaseVolume();
 increaseVolume();
 increaseVolume();
 increaseVolume();
 increaseVolume();
 System.out.println("end of the main");
}
public static boolean onOrOff(){
System.out.println("start of onoroff");
isConnected=!isConnected?true:false;
System.out.println("end of onoroff");
return isConnected;
}
public static void increaseVolume(){
System.out.println("start of increase volume" );
if(isConnected==true){
if(currentVolume<increaseVolume){
currentVolume=currentVolume+1;
System.out.println("currentVolume is "+currentVolume);
}else{
System.out.println("maximum volume is reached");
}
}else{
System.out.println("first turnon the headsets");
}
}
}


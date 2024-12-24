class Fan1{
static boolean isConnected;
static int currentSpeed;
static int maxSpeed=2;
static int minSpeed;
	
public static void main(String args[]){
boolean fan=  onOrOff();
System.out.println(" fan  is connected "+fan);
fan=onOrOff();
System.out.println(" fan is connected "+fan);
fan=onOrOff();
System.out.println(" fan is connected "+fan);
maxSpeed();
maxSpeed();

}
public static boolean onOrOff(){
isConnected=!isConnected ? true:false;
return isConnected;
}
public static void maxSpeed(){
	 System.out.println("start of maxSpeed method ");
	 if(isConnected==true){
		 if(currentSpeed<maxSpeed){
			 currentSpeed=maxSpeed+1;
			 System.out.println("the current speed  is "+currentSpeed);
			}else{
				System.out.println(" max speed reached");
			}
				
	 }else{
			 System.out.println("firstly turnon the fan");
		 }
 }
}


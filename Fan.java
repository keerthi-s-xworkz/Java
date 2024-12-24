class Fan{
	static boolean isConnected;
    static int currentSpeed;
	static int increaseSpeed=4;
	static int decreaseSpeed;
 public static void main(String args[]){
	 System.out.println("main started");
		boolean fanSpeed=  onOrOff();
 System.out.println("fan condction is connected "+fanSpeed);
 
       fanSpeed=onOrOff();
	  System.out.println("fan is connected "+fanSpeed);
	  
	  fanSpeed=onOrOff();
	  System.out.println("fan is connected "+fanSpeed);
	  
	  increaseSpeed();
	  increaseSpeed();
	  increaseSpeed();
	  increaseSpeed();
	  System.out.println("main ended");
 }
 public static boolean onOrOff(){
	 System.out.println("start of onOrOff");
      isConnected=!isConnected ? true:false;
     System.out.println("end of onOrOff");
	 return isConnected;
 }
 public static void increaseSpeed(){
	 System.out.println("start of increasespeed method ");
	 if(isConnected==true){
		 if(currentSpeed<increaseSpeed){
			 currentSpeed=currentSpeed+1;
			 System.out.println("the current speed  is "+currentSpeed);
			}else{
				System.out.println("speed is  reached");
			}
				
	 }else{
			 System.out.println("mainly turnon the fan");
		 }
 }
}
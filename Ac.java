class Ac{
	static boolean isConnected;
    static int currentVolume;
	static int increaseTemp=6;
	static int decreaseTemp;
 public static void main(String args[]){
	 System.out.println("main started");
		boolean acCondction=  onOrOff();
 System.out.println("ac condction is connected "+acCondction);
 
     acCondction=onOrOff();
     System.out.println("ac is connected "+acCondction);
	 
	 acCondction=onOrOff();
     System.out.println("ac is connected "+acCondction);
	 
	 increaseTemp();
	 increaseTemp();
	 increaseTemp();
	 increaseTemp();
	 increaseTemp();
	 increaseTemp();
	  System.out.println("main ended");
 }
 public static boolean onOrOff(){
	 System.out.println("start of onOrOff");
      isConnected=!isConnected ? true:false;
     System.out.println("end of onOrOff");
	 return isConnected;
 }
 public static void increaseTemp(){
	 System.out.println("start of increaseTemp method ");
	 if(isConnected==true){
		 if(currentVolume < increaseTemp){
			 currentVolume=currentVolume+1;
			 System.out.println("the present temp  is "+currentVolume);
			}else{
				System.out.println("max temp reached");
			}
				
	 }else{
			 System.out.println("mainly turnon the ac");
		 }
 }
}
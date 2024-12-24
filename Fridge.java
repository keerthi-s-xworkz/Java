class Fridge{
	static boolean isConnected;
    static int currentTemp;
	static int increaseTemp=5;
	static int decreaseTemp;
 public static void main(String args[]){
	 System.out.println("main started");
		boolean anyThing=  onOrOff();
 System.out.println("fridge is connected "+anyThing);
 
     anyThing=onOrOff();
	  System.out.println("fridge is connected "+anyThing);
	  
	  anyThing=onOrOff();
	  System.out.println("fridge is connected "+anyThing);
	  
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
		 if(currentTemp<increaseTemp){
			 currentTemp=currentTemp+1;
			 System.out.println("the present temp  is "+currentTemp);
			}else{
				System.out.println("tem is reached");
			}
				
	 }else{
			 System.out.println("mainly turnon the fridge");
		 }
 }
}
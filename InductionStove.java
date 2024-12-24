class InductionStove{
	static boolean isConnected;
    static int currentFlam;
	static int increaseFlam=3;
	static int decreaseFlam;
 public static void main(String jbl[]){
	 System.out.println("main started");
		boolean stove=  onOrOff();
 System.out.println(" induction stove is connected "+stove);
 
       stove=onOrOff();
     System.out.println("induction stove is connected "+stove);
	 
	 stove=onOrOff();
     System.out.println("induction stove is connected "+stove);
	   
	   increaseFlam();
	   increaseFlam();
	   increaseFlam();
	   
	  System.out.println("main ended");
 }
 public static boolean onOrOff(){
	 System.out.println("start of onOrOff");
      isConnected=!isConnected ? true:false;
     System.out.println("end of onOrOff");
	 return isConnected;
 }
 public static void increaseFlam(){
	 System.out.println("start of increaseFlam method ");
	 if(isConnected==true){
		 if(currentFlam<increaseFlam){
			 currentFlam=currentFlam+1;
			 System.out.println("the current flam  is "+currentFlam);
			}else{
				System.out.println(" increase flam reached");
			}
				
	 }else{
			 System.out.println("mainly turnon the stove");
		 }
 }
}
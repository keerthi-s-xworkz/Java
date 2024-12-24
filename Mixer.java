class Mixer{
	static boolean isConnected;
    static int currentVolume;
	static int maxVolume=8;
	static int minVolume;
 public static void main(String args[]){
	 System.out.println("main started");
	    boolean mixe=  onOrOff();
 System.out.println("mixer is connected "+mixe);
 
        mixe=onOrOff();
	  System.out.println("mixer is connected "+mixe);
	  
	  mixe=onOrOff();
	  System.out.println("mixer is connected "+mixe);
	  
	    increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		
	  System.out.println("main ended");
 }
 public static boolean onOrOff(){
	 System.out.println("start of onOrOff");
      isConnected=!isConnected ? true:false;
     System.out.println("end of onOrOff");
	 return isConnected;
 }
 public static void increaseVolume(){
	 System.out.println("start of increasevolume method ");
	 if(isConnected==true){
		 if(currentVolume<maxVolume){
			 currentVolume=currentVolume+1;
			 System.out.println("the current volume is "+currentVolume);
			}else{
				System.out.println("max volume reached");
			}
				
	 }else{
			 System.out.println("switch on the mixer switch");
		 }
 }
}
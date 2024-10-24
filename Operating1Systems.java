class Operating1Systems{
 
long phoneNumber;
String version;


    public Operating1Systems(long pno,String vr){
    System.out.println("operatingsystem constructor is invoked");
       phoneNumber=pno;
	   version=vr;
	   
 }
 
	public void displayOperatingSystemDetails(){
	System.out.println("the OperatingSystem phoneNumber is :"+phoneNumber);
	System.out.println("the OperatingSystem version is :"+version);
}
}
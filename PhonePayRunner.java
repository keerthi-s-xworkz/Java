class PhonePayRunner{
	
	public static void main(String cell[]){
		
		System.out.println("main started");
		boolean  isInsurancesadded =PhonePay.addInsurances("health");
		System.out.println("is insurance added "+isInsurancesadded);
		
		isInsurancesadded =PhonePay.addInsurances("life");
		System.out.println("is insurance added "+isInsurancesadded);
		
		isInsurancesadded =PhonePay.addInsurances("car");
		System.out.println("is insurance added "+isInsurancesadded);
		
		isInsurancesadded =PhonePay.addInsurances("bike");
		System.out.println("is insurance added "+isInsurancesadded);
		
		isInsurancesadded =PhonePay.addInsurances("travel");
		System.out.println("is insurance added "+isInsurancesadded);
		
		PhonePay.getInsurances();
		
	boolean insuranceNameUpdate =PhonePay.updateInsurancesName("home","travel");
		System.out.println("is planet is updated "+insuranceNameUpdate);
		
        PhonePay.getInsurances();
	  
		
		System.out.println("main ended");
	}
}
class BannkRunner{
	
	public static void main(String cell[]){
		
		System.out.println("main started");
		boolean isBankNameAdded =Bannk.addBankNames("SBI");
		System.out.println("is bank name  added "+isBankNameAdded);
		
		isBankNameAdded =Bannk.addBankNames("Pragathi gramen");
		System.out.println("is bank name  added "+isBankNameAdded);
		
		isBankNameAdded =Bannk.addBankNames("indian");
		System.out.println("is bank name  added "+isBankNameAdded);
		
		isBankNameAdded =Bannk.addBankNames("IFIC");
		System.out.println("is bank name  added "+isBankNameAdded);
		
		isBankNameAdded =Bannk.addBankNames("HDFC");
		System.out.println("is bank name added "+isBankNameAdded);
		
		Bannk.getBankName();
		
		boolean productNameUpdate =Bannk.updateBankName("delt","IFIC");
		System.out.println("is bank  name update "+productNameUpdate);
		
        Bannk.getBankName();
		
		System.out.println("main ended");
	}
}
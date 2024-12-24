class CellPhoneRunner{
	
	public static void main(String cell[]){
		
		System.out.println("main started");
		boolean isApplicationAdded =CellPhone.addApplication("instagram");
		System.out.println("is application added ="+isApplicationAdded);
		
		isApplicationAdded =CellPhone.addApplication("snapchat");
		System.out.println("is application added ="+isApplicationAdded);
		
		isApplicationAdded =CellPhone.addApplication("kotak");
		System.out.println("is application added ="+isApplicationAdded);
		
		isApplicationAdded =CellPhone.addApplication("threads");
		System.out.println("is application added ="+isApplicationAdded);
		
		isApplicationAdded =CellPhone.addApplication("zepto");
		System.out.println("is application added ="+isApplicationAdded);
		
		CellPhone.getApplication();

		boolean applicationNameUpdate =CellPhone.updateApplicationByName("SBI","kotak");
		System.out.println("is application update name is"+applicationNameUpdate);
	
		
		boolean appDeleated =CellPhone.deleteApplicationByName("threads");
		        CellPhone.getNewApplication();
		System.out.println("main ended");
	}
}
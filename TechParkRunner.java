class TechParkRunner{
	
	public static void main(String args[]){
		
		System.out.println("main started");
		boolean isCompanyNameAdded =TechPark.addCompanyName("HCL");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("infosys");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("wipro");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("sonata");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("mphasis");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("tech mahindra");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("larsen");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName(" fueled");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("cognizant");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("accenture");
		System.out.println("is company name added "+isCompanyNameAdded);
	
		isCompanyNameAdded =TechPark.addCompanyName("oracle ");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("IBM");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName(" capgemini");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("coforge");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		isCompanyNameAdded =TechPark.addCompanyName("hexaware technologies");
		System.out.println("is company name added "+isCompanyNameAdded);
		
		TechPark.getCompanyName();
		
		boolean companyNameUpdate =TechPark.updateCompanyName("deliot","coforge");
		System.out.println("is company  name update "+companyNameUpdate);
		
        TechPark.getCompanyName();
		
		System.out.println("main ended");
	}
}
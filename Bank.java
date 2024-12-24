class Bank{
	public static void main(String bank[]){
		boolean ref=bankRegistation("keerthi","saleru",21,63661893067L,70842651921L,"NBK66PH",
		"basaveshwara nagar 5th cross near kidzee school mathru niliya ballari",true,
		"basaveshwara nagar 5th cross near kidzee school mathru niliya ballari",
		"current account","Siddarameshwara.s","manjula.s","SBI","female");
		System.out.println("is user register"+ref);
	}
public static boolean bankRegistation(String firstName,String lastName,int age,long phoneNumber,
  long adharNo,String panCardNumber,String currentAddress,boolean permanentAddressSameAsCurrentAddress
  ,String permanentAddress,String accountType, String fatherName,String motherName,String branch,String gender){
  System.out.println("the bankholder first name is "+firstName);
  System.out.println("the bankholder last name  is "+lastName);
  System.out.println("the bankholder age is "+age);
  System.out.println("the bankholder phone number is "+phoneNumber);
  System.out.println("the bankholder adhar number is "+adharNo);
  System.out.println("the bankholder pan card number  is "+panCardNumber);
  System.out.println("the bankholder current address is "+currentAddress);
  System.out.println("the bankholder permanent address is same as current address"+permanentAddressSameAsCurrentAddress);
  System.out.println("the bankholder permanent address is "+permanentAddress);
  System.out.println("the bankholder account type is "+accountType);
  System.out.println("the bankholder father name  is "+fatherName);
  System.out.println("the bankholder mother name is "+motherName);
  System.out.println("the bankholder branch is "+branch);
  System.out.println("the bankholder gender is "+gender);
  return true;
  
}
}
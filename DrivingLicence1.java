class DrivingLicence1{
  
String dlNo;
String validTill;
String name;
String dateOfBirth;
String bloodGroup;
String fatherName;
long rtoOfficeNumber;

      public DrivingLicence1(String dl,String vd,String nm,String dob,String bg,String fn,long rto){
    System.out.println("driving licence constructor is invoked");
       dlNo=dl;
	   validTill=vd;
	   name=nm;
	   dateOfBirth=dob;
	   bloodGroup=bg;
	   fatherName=fn;
	   rtoOfficeNumber=rto;
	   
 }

	public void fetchDrivingLicences(){
	System.out.println("the driving licences dlNo is :"+dlNo);
	System.out.println("the driving licences validTill is :"+validTill);
	System.out.println("the driving licences name is :"+name);
	System.out.println("the driving licences dateOfBirth is :"+dateOfBirth);
	System.out.println("the driving licences bloodGroup is :"+bloodGroup);
	System.out.println("the driving licences fatherName is :"+fatherName);
	System.out.println("the driving licences rtoOfficeNumber is :"+rtoOfficeNumber);
}

}
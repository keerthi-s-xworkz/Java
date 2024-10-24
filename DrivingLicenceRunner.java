class DrivingLicenceRunner{

public static void main(String drive[]){
 DrivingLicence drivingLicence=new DrivingLicence();
 
 drivingLicence.dlNo="MH03 20080022135";
 drivingLicence.validTill="08/02/2026";
 drivingLicence.name="ANURAG";
 drivingLicence.dateOfBirth="09/02/1976";
 drivingLicence.bloodGroup="ab+ve";
 drivingLicence.fatherName="raj breja";
 drivingLicence.rtoOfficeNumber=26633853L;
 drivingLicence.fetchDrivingLicences();
 
 DrivingLicence licence=new DrivingLicence();
 
 licence.dlNo="mk84 20026622176";
 licence.validTill="15/07/2029";
 licence.name="bharath";
 licence.dateOfBirth="04/10/2000";
 licence.bloodGroup="o+ve";
 licence.fatherName="Siddarameshwara";
 licence.rtoOfficeNumber=26630989L;
 licence.fetchDrivingLicences();
 }

}
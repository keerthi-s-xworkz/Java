class PhonePay{

static  String insurances[]={null,null,null,null,null};
static int index;

    public static boolean addInsurances(String insurance){
     System.out.println(" addInsurances started");
       boolean isInsurancesadded=false;
       if(insurance !=null){
        System.out.println("insurance contain value proceed");
        insurances[index]=insurance;
            index++;
       isInsurancesadded =true;
    }else{
          System.out.println("insurance is empty /null");
		  }
			 System.out.println("addInsurances ended");
			  return isInsurancesadded;

}
public static void getInsurances(){
	System.out.println("get insurance started");
	System.out.println("list of insurances are");
	for(String insurance:insurances)
		System.out.println( insurance);
	}
	public static boolean updateInsurancesName(String newInsurancesName,String oldInsurancesName){
		boolean isInsurancesNameUpdated=false;
		for(int start=0;start<insurances.length;start++){
			if(insurances[start]==oldInsurancesName){
				insurances[start]=newInsurancesName;
				isInsurancesNameUpdated=true;
				break;
			}
		}
		if(isInsurancesNameUpdated==false)System.out.println(oldInsurancesName+"not found");
		return isInsurancesNameUpdated;
}
}


import java.util.Arrays;
class TechPark{

static  String companyNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

    public static boolean addCompanyName(String companyName){
     System.out.println(" companyName started");
       boolean isCompanyNameAdded=false;
       if(companyName !=null){
        System.out.println("company Name contain value ");
        companyNames[index]= companyName;
            index++;
        isCompanyNameAdded=true;
    }else{
          System.out.println("companyName is empty /null");
		  }
			 System.out.println("companyName ended");
			  return isCompanyNameAdded;

}
public static void getCompanyName(){
	System.out.println("getCompany name started");
	System.out.println("list of company Name are");
	for(String companyName:companyNames)
		System.out.println( companyName);
	}
	public static boolean updateCompanyName(String newCompanyName,String oldCompanyName){
		boolean isCompanyNameUpdated=false;
		for(int start=0;start<companyNames.length;start++){
			if(companyNames[start]==oldCompanyName){
				
				companyNames[start]=newCompanyName;
				isCompanyNameUpdated=true;
				break;
			}
		}
		if(isCompanyNameUpdated==false)System.out.println(oldCompanyName+"not found");
		return isCompanyNameUpdated;
}
public static boolean deleteCompanyByName(String companyName ){
	System.out.println("delate company name is started");
	boolean isCompanyNameDeleated=false;
	int index,newIndex;
	for(index=0,newIndex=0;index<companyNames.length;index++){
		String existingCompanyName=companyNames[index];
		if(existingCompanyName!=companyName){
			companyNames[newIndex++]=existingCompanyName;
		}else{
			isCompanyNameDeleated=true;
		}
	}
	companyNames=Arrays.copyOf(companyNames,newIndex);
	return isCompanyNameDeleated;
}
}


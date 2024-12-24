class CellPhone{

static  String applications[]={null,null,null,null,null};
static String newApplications[]={null,null,null,null};
static int index;

    public static boolean addApplication(String application){
     System.out.println("addApplication started");
       boolean isApplicationAdded=false;
       if(application !=null){
        System.out.println("application contain value proceed");
        applications[index]=application;
            index++;
        isApplicationAdded=true;
    }else{
          System.out.println("application is empty /null");
		  }
			 System.out.println("addApplication ended");
			  return isApplicationAdded;

}
public static void getApplication(){
	System.out.println("getApplication started");
	System.out.println("list of applications are");
	for(String application:applications)
		System.out.println( application);
	}
	public static boolean updateApplicationByName(String newAppName,String oldAppName){
		boolean isAppUpdated=false;
		for(int start=0;start<applications.length;start++){
			if(applications[start]==oldAppName){
				applications[start]=newAppName;
				isAppUpdated=true;
				break;
			}
		}
		if(isAppUpdated==false)System.out.println(oldAppName+"not found");
		return isAppUpdated;
	}
	public static boolean deleteApplicationByName(String appName){
		System.out.println("delete application by name started");
         boolean isAppNameDeleated=false;
      for(int index=0,newIndex=0;index<applications.length;index++){
		  String existingAppName=applications[index];
if(existingAppName !=appName){
	newApplications[newIndex++]=existingAppName;
	}else{
	isAppNameDeleated=true;
         }
}
int size=newIndex;
applications=Arrays.copyOf(applications,size);
return isAppNameDeleated;
}
    public static void getNewApplication(){
	System.out.println("getNewApplication started");
	System.out.println("list of new applications are");
	for(String application:newApplications)
		System.out.println( application);
}
}
	
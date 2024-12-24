class Olympics{

static  String sportsNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

    public static boolean addSportName(String sportName){
     System.out.println("sportName started");
       boolean isSportNameAdded=false;
       if(sportName !=null){
        System.out.println("sports name contains the value ");
        sportsNames[index]=sportName ;
            index++;
        isSportNameAdded=true;
    }else{
          System.out.println("sportName is empty /null");
		  }
			 System.out.println("sportName ended");
			  return isSportNameAdded;

}
public static void getSportName(){
	System.out.println("get sport name started");
	System.out.println("list of sport names are");
	for(String sportName:sportsNames)
		System.out.println(sportName );
	}
	public static boolean updateSportName(String newSportName,String oldSportName){
		boolean isSportNameUpdated=false;
		for(int start=0;start<sportsNames.length;start++){
			if(sportsNames[start]==oldSportName){
				sportsNames[start]=newSportName;
				isSportNameUpdated=true;
				break;
			}
		}
		if(isSportNameUpdated==false)System.out.println(oldSportName+"not found");
		return isSportNameUpdated;
}
}



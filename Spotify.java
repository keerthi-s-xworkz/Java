class Spotify{

static  String artistNames[]={null,null,null,null,null,null,null,null};
static int index;

    public static boolean addArtistName(String artistname){
     System.out.println("addArtistName started");
       boolean isArtistNameAdded=false;
       if(artistname !=null){
        System.out.println("artist name contain value proceed");
        artistNames[index]=artistname;
            index++;
        isArtistNameAdded=true;
    }else{
          System.out.println("artist name is empty /null");
		  }
			 System.out.println("addArtistName ended");
			  return isArtistNameAdded;

}
public static void getArtistName(){
	System.out.println("getartistname started");
	System.out.println("list of artistNames are");
	for(String artistname:artistNames)
		System.out.println( artistname);
	}

	public static boolean updateArtistName(String newArtistName,String oldArtistName){
		boolean isArtistNameUpdated=false;
		for(int start=0;start<artistNames.length;start++){
			if(artistNames[start]==oldArtistName){
				artistNames[start]=newArtistName;
				isArtistNameUpdated=true;
				break;
			}
		}
		if(isArtistNameUpdated==false)System.out.println(oldArtistName+"not found");
		return isArtistNameUpdated;
}
}




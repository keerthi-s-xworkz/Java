class Theatre{

static  String movieNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

    public static boolean addMovieName(String movieName){
     System.out.println(" add movie name started");
       boolean isMovieNameAdded=false;
       if(movieName !=null){
        System.out.println("movie contain value ");
        movieNames[index]= movieName;
            index++;
        isMovieNameAdded=true;
    }else{
          System.out.println(" movie name is empty /null");
		  }
			 System.out.println("movie name ended");
			  return isMovieNameAdded;
	
}
public static void getMovieName(){
		System.out.println("get movie name started");
		System.out.println("list of movie names are");
		for(String movieName:movieNames)
			System.out.println(movieName);
	}
		public static boolean updateMovieName(String newMovieName,String oldMovieName){
		boolean isMovieNameUpdated=false;
		for(int start=0;start<movieNames.length;start++){
			if(movieNames[start]==oldMovieName){
				
				movieNames[start]=newMovieName;
				isMovieNameUpdated=true;
				break;
			}
		}
		if(isMovieNameUpdated==false)System.out.println(oldMovieName+"not found");
		return isMovieNameUpdated;
}
}
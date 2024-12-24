class Galaxy{

static  String planets[]={null,null,null,null,null,null,null,null};
static int index;

    public static boolean addPlanetName(String planet){
     System.out.println("addPlanetName started");
       boolean isPlanetNameAdded=false;
       if(planet!=null){
        System.out.println("planet name contain value proceed");
        planets[index]=planet;
            index++;
        isPlanetNameAdded=true;
    }else{
          System.out.println("planet name is empty /null");
		  }
			 System.out.println("addPlanetName ended");
			  return isPlanetNameAdded;

}
public static void getPlanetName(){
	System.out.println("getPlanetName started");
	System.out.println("list of planets are");
	for(String planet:planets)
		System.out.println( planet);
	}
	public static boolean updatePlanetByName(String newPlanetName,String oldPlanetName){
		boolean isPlanetUpdated=false;
		for(int start=0;start<planets.length;start++){
			if(planets[start]==oldPlanetName){
				
				planets[start]=newPlanetName;
				isPlanetUpdated=true;
				break;
			}
		}
		if(isPlanetUpdated==false)System.out.println(oldPlanetName+"not found");
		return isPlanetUpdated;
}
}



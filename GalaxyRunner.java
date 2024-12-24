class GalaxyRunner{
	
	public static void main(String cell[]){
		
		System.out.println("main started");
		boolean isPlanetNameAdded =Galaxy.addPlanetName("mercury");
		System.out.println("is  planet name added "+isPlanetNameAdded);
		
		isPlanetNameAdded =Galaxy.addPlanetName("venus");
		System.out.println("is  planet name added "+isPlanetNameAdded);
		
		isPlanetNameAdded =Galaxy.addPlanetName("earth ");
		System.out.println("is  planet name added "+isPlanetNameAdded);
		
		isPlanetNameAdded =Galaxy.addPlanetName("mars");
		System.out.println("is  planet name added "+isPlanetNameAdded);
		
		isPlanetNameAdded =Galaxy.addPlanetName("jupiter");
		System.out.println("is  planet name added "+isPlanetNameAdded);
		
	    isPlanetNameAdded =Galaxy.addPlanetName("saturn");
		System.out.println("is  planet name added "+isPlanetNameAdded);
		
		isPlanetNameAdded =Galaxy.addPlanetName("uranaus ");
		System.out.println("is  planet name added "+isPlanetNameAdded);
		
		isPlanetNameAdded =Galaxy.addPlanetName("neptune");
		System.out.println("is planet name added "+isPlanetNameAdded);
	
		Galaxy.getPlanetName();
		
				boolean planetNameUpdate =Galaxy.updatePlanetByName("ploto","mars");
		System.out.println("is planet is updated "+planetNameUpdate);
		
        Galaxy.getPlanetName();
		
		System.out.println("main ended");
	}
}
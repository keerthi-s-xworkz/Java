class OlympicsRunner{
	
	public static void main(String args[]){
		
		System.out.println("main started");
		boolean isSportNameAdded =Olympics.addSportName("athletics");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("boxing");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("badminton");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("gymnastics");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("archery");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("basketball");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("tabel tennis");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName(" volleyball");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("cricket");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("road cycling");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("judo");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("baseball");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName(" shooting");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("weightlifting");
		System.out.println("is sports name added "+isSportNameAdded);
		
		isSportNameAdded =Olympics.addSportName("sailing");
		System.out.println("is sports name added "+isSportNameAdded);
		
		Olympics.getSportName();
		
		boolean sportNameUpdate =Olympics.updateSportName("swimming","judo");
		System.out.println("is sport name is updated"+sportNameUpdate);
		
        Olympics.getSportName();
		
		System.out.println("main ended");
	}
}
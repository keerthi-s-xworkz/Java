class TheatreRunner{
	
	public static void main(String args[]){
		
		System.out.println("main started");
		boolean isMovieNameAdded =Theatre.addMovieName("a1 express");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("mahanati");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("double ismart");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("satyabhama");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("yoshada");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("buddy");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("hit");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName(" devil");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("devara");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("virupaksha");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("calling sahasra");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("nanaku prematho");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName(" lovely");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("hyper");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		isMovieNameAdded =Theatre.addMovieName("king");
		System.out.println("is movie name added "+isMovieNameAdded);
		
		Theatre.getMovieName();
		
		boolean movieNameUpdate =Theatre.updateMovieName("salar","devara");
		System.out.println("is movie update name is"+movieNameUpdate);
		
        Theatre.getMovieName();
		
		System.out.println("main ended");
	}
}
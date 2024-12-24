class SpotifyRunner{
	
	public static void main(String cell[]){
		
		System.out.println("main started");
		boolean isArtistNameAdded =Spotify.addArtistName("janaki");
		System.out.println("is application added "+isArtistNameAdded);
		
		isArtistNameAdded =Spotify.addArtistName("anuradha bhat");
		System.out.println("is application added "+isArtistNameAdded);
		
		isArtistNameAdded =Spotify.addArtistName("sunitha ");
		System.out.println("is application added "+isArtistNameAdded);
		
		isArtistNameAdded =Spotify.addArtistName("chitra");
		System.out.println("is application added "+isArtistNameAdded);
		
		isArtistNameAdded =Spotify.addArtistName("rajesh krishnan");
		System.out.println("is application added "+isArtistNameAdded);
		
	    isArtistNameAdded =Spotify.addArtistName("karthik");
		System.out.println("is application added "+isArtistNameAdded);
		
		isArtistNameAdded =Spotify.addArtistName("sanjith hegde ");
		System.out.println("is application added "+isArtistNameAdded);
		
		isArtistNameAdded =Spotify.addArtistName("shreya ghoshal");
		System.out.println("is application added "+isArtistNameAdded);
	
		Spotify.getArtistName();
		
		boolean artistNameUpdate =Spotify.updateArtistName("SPB","sunitha");
		System.out.println("is artist name is undated "+artistNameUpdate);
		
        Spotify.getArtistName();
		
		System.out.println("main ended");
	}
}
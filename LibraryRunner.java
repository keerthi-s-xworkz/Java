class LibraryRunner{

public static void main(String args[]){
 Library lib=new Library();
 
 lib.libraryId=00111000L;
 lib.address="the state centeral library";
 lib.type="public libraries";
 lib.libraryOwnerName="ranganathan";
 lib.fetchLibraryDetails();
 
 Library any=new Library();
 any.libraryId=1230004567L;
 any.address="ram mandira library";
 any.type="school libraries";
  any.libraryOwnerName="thomas bodley";
 any.fetchLibraryDetails();
 
 }

}
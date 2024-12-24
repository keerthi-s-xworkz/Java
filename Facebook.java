class Facebook{
   public static void main(String Socialmedia[]){
   System.out.println("main started");
   String ref =login("pavi@gmail.com","pavi9948");
	System.out.println(ref);
	boolean ref1=userSignUp("keerthi","saleru","ramesh99800","636189","20/07/2002",22,true);
	System.out.println("is user signup"+ref);
	System.out.println("main ended");
	}
      public static String login(String email,String password){
		  System.out.println("login started");
	  String message=null;
	  if(email !=null ||password!=null){
       System.out.println("email/passwoed is checked");
	   message="login successfull";
	  }
	  else{
		  System.out.println("email/password is invalid");
		  message="login unsuccessfull";
	  }
	  System.out.println("login ended");
	  return message;
	  }
	  public static boolean userSignUp (String firstName,String lastName,String email,String password,String dateOfBirth,int age,
       boolean signedUp){
	  System.out.println("the facebook first name is "+firstName);
      System.out.println("the facebook  last name is "+lastName);
      System.out.println("the facebook email is "+email);
      System.out.println("the facebook  password is "+password);
      System.out.println("the facebook date Of Birth is "+dateOfBirth);
      System.out.println("the facebook age is "+age);
	  System.out.println("the facebook account signup is "+signedUp);
	  return true;
}
}
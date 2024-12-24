class FaceBook1{
	public static void main(String seva[]){
		boolean ref=userSignUp("keerthi","saleru","ramesh99800","636189","20/07/2002",22,true);
		System.out.println("is user signup"+ref);
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
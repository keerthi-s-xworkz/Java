class PassPortSeva{
	public static void main(String seva[]){
		boolean ref=userregister("po","bangaluru","keerthi","saleru","15/07/2002",
		"keerthisaleru@gmail.com",true,"keerthisaleru@gmail.com","keerthi@63618",
		"keerthi@63618","colour","blue","53amaj4f");
		System.out.println("is user register"+ref);
}
public static boolean userregister(String cpvLocation,String dcdrLocation,String name,
   String userName,String DOB,String email,boolean emailLogin,String loginId,String pwd,
   String confirmesPwd,String hintQues,String hintAns,String captche){
      System.out.println("the passport cpv location is "+cpvLocation);
      System.out.println("the passport dcdr location is "+dcdrLocation);
      System.out.println("the passport name is "+name);
      System.out.println("the passport  DOB is "+DOB);
      System.out.println("the passport email is "+email);
      System.out.println("the passport emailLogin is "+emailLogin);
      System.out.println("the passport  loginId is "+loginId);
      System.out.println("the passport pwd  is "+pwd);
      System.out.println("the passport confirmes pwd is "+confirmesPwd);
      System.out.println("the passport hintQues is "+hintQues);
      System.out.println("the passport hintAns is "+hintAns);
      System.out.println("the passport captche is "+captche);
      return true;}
}
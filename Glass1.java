class Glass1{
  
  int id;
  String type;
  
      public Glass1(int i,String tp){
    System.out.println("glass constructor is invoked");
       id=i;
       type=tp;
 }
  
    public void getGlassDetails(){
	  System.out.println("the glass id is:"+id);
	  System.out.println("the glass type is :"+type);
  }
  
}
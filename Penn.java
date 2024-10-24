class Penn{
 String brandName;
 double price;
 String color;
 String material;
 String type;
 
 /*public Penn(){
 System.out.println("pen constructor is invoked");
 }*/
 
 public Penn(String bname,double p,String col,String mat,String tp){
 System.out.println("pen constructor is invoked");
 brandName=bname;
 price=p;
 color=col;
 material=mat;
 type=tp;
 }
 
 public void displayDetails(){
 System.out.println("the pen details are:.......");
 System.out.println("the brand name is:"+brandName);
 System.out.println("the price name of pen is :"+price);
 System.out.println("the pen color is :"+color);
 System.out.println("the material of the pen is :"+material);
 System.out.println("the pen type is :"+type);
 }
}
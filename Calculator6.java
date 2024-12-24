class Calculator6{
 public static void main(String cal[]){
 System.out.println("main started");
 add (23,55);
 add(54,80);
 sub(30,20);
 sub(90,60);
 System.out.println("main ended");
}
 
 public static void add(int num1,int num2){
 int num1num2=num1+num2;
 System.out.println(num1num2);
}
public static void sub(int num1,int num2){
 int num1num2=num1-num2;
 System.out.println(num1num2);
}
}
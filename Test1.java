1. Java-in java we can write once and run anywhere.
java is platform independent

2. JDK-java development kit
JRE-java runtime environment
JVM-java virtual mechine and it is dependent on byte code 
jvm is used in runtime,and it is present in jre.
JDK,JRE,JVM are platform dependent.
JVM contains development tools,JRE contains set of libiries.

3. Data Types are two types
1) primitive DataType
2) Non-primitive DataType
Primitive data types are int,char,float,double,long,shot,byte,boolean.
default values for int 0,float 0.0,double 0,long 0,shot 0, byte 0,boolean false.
non-primitive data types are String,Array(which starts with uppercase letters)
ex:class Pavi{
static int age;
static char A;
static float num;
static double details;
static long password;
static short address;
static boolean completed;
static byte homename;
public static void main(String args[]){
System.out.println("the pavi age is "+age);
System.out.println("the pavi a is"+A);
System.out.println("the pavi a is"+num);
System.out.println("the pavi details is"+details);
System.out.println("the pavi password is"+password);
System.out.println("the pavi a is"+address);
System.out.println("the pavi completed is"+completed);
System.out.println("the pavi homename is"+homename);
}
}
 

4. Primitive DataType are inbuild and they are provied by the java
Non-primitive DataType are used by users and they are not provied  by java programers.

5. instance variable 
ex:class IceCream{
   int price;
   String flavour;
   String brand;
   String type;
}
 Static variable
 ex:class IceCream{
  static int price=45;
  static String flavour="vennila";
  static String brand="amul";
  static String type="cone";
  }
  
6. public static void main(String[]args){
}
main is a method which is called from JRE of JVM and while in runtime main will be called. 

7. method chaining -calling method again and again 
this()is the keyword used in constructor chaining
ex:class Hotel{
 int foodPrice;
 String hotelName;
 String hotelAddress;
 String foodName;
 
 public Hotel(int foodPrice,String hotelName){
	 this(100,"abhiruchi");
	 System.out.println(" is invoked");
     this.foodPrice=foodPrice;
     this.hotelName=hotelName;

 }
 public void fetchHotelDetails(){
 System.out.println("the hotel food price is :"+foodPrice);
 System.out.println("the hotel name is:"+hotelName);
 System.out.println("the hotel address is :"+hotelAddress);
 System.out.println("the hotel food name is:"+foodName);
 }
 
 class HotelRunner{
 public static void main(String args[]){
 Hotel htl=new Hotel();
 htl.fetchHotelDetails();
 }
 }
 
8. a)class is in uppercase
b) initliziation not done
c)identifier expected
d)void shoud be their in getPersonDetails
e)7,3
g)10



9. class Students{
static  String studentNames[]={"akhila","kavya","pavithra"};
static int marks[]={99,85,79};
public static void main(String args[]){
System.out.println("student names are:"+studentNames.length);
System.out.println("student marks are :"+marks.length);
for(int i=0;i<studentNames.length;i++){
String ref=studentNames[i];
int anything=marks[i];
System.out.println(ref);
System.out.println(anything);
}
}
}

10. class Fan1{
static boolean isConnected;
static int currentSpeed;
static int maxSpeed=2;
static int minSpeed;	

public static void main(String args[]){
boolean fan=  onOrOff();
System.out.println(" fan  is connected "+fan);
fan=onOrOff();
System.out.println(" fan is connected "+fan);
fan=onOrOff();
System.out.println(" fan is connected "+fan);
maxSpeed();
maxSpeed();
}
public static boolean onOrOff(){
isConnected=!isConnected ? true:false;
return isConnected;
}
public static void maxSpeed(){
if(isConnected==true){
if(currentSpeed<maxSpeed){
currentSpeed=maxSpeed+1;
System.out.println("the current speed  is "+currentSpeed);
}
}

11. this- is used for constructor chaining 
this()-avoid ambitity between instance variable and methods

12. calling method again and again called stack over flow
ex:class Something{
public static void main(String some[]){
System.out.println(some[0]);
}
}

13. overloading has two types method overloading and constructor overloading
changing in the length of the parameters
constructor is used as object
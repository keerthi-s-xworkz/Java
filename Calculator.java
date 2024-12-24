class Calculator{
public static void main (String[] calculate){
	System.out.println("main started");
	//invoke
	add(89,74);
	add(79,103);
	substract(56,4);
	substract(65,23);
	System.out.println("main ended");
}
//method
public static void add (int num1,int num2){
	int num1num2=num1+num2;
	System.out.println(num1num2);
}

public static void substract(int num3,int num4){
	int num3num4=num3-num4;
	System.out.println(num3num4);
}
}
class PizzaHut{
static  String PizzaNames[]={"cheese","corn","chilly"};
public static void main(String[]args){
System.out.println("pizza names are:"+PizzaNames.length);
for(int i=0;i<PizzaNames.length;i++){
String ref=PizzaNames[i];
System.out.println(ref);
}
}
}
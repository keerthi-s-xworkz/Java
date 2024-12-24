class Domains1{
static String PizzaNames[]={"cheese","chilly","onion"};
public static void main(String[]args){
System.out.println("the pizza names are:"+PizzaNames.length);
for(int i=0;i<PizzaNames.length;i++){
String ref=PizzaNames[i];
System.out.println(ref);
}
}
}
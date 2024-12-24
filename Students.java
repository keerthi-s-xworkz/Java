class Students{
static  String studentNames[]={"akhila","kavya","pavithra"};
static int marks[]={99,85,79};
public static void main(String args[]){
System.out.println("student names are:"+studentNames.length);
System.out.println("student marks are :"+marks.length);
for(int i=0;i<studentNames.length;i++){
	/*for(int i=0;i<marks.length;i++){*/
String ref=studentNames[i];
int anything=marks[i];
System.out.println(ref);
System.out.println(anything);
}
}
}
class Factorial{

   public static void main(String gettingFact[]){
   System.out.println("main started");
   int factorialNumber=5;
   
   int fact=1;
   for(int ref=1; ref<=factorialNumber;ref++){
     fact=fact*ref;
   }
   System.out.println("the factoral of= "+factorialNumber + " is " +fact );
   System.out.println("main ended");
}


}
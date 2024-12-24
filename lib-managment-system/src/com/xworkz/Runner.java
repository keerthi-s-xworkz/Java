package com.xworkz;

public class Runner {

    //stack overflow error
//    public static void main(String[] args) {
//            m();
//    }
//
//    public static void m(){
//        m();
//    }

    //null point exception
//    static String str=null;
//
//    public static void main(String[] args) {
//        System.out.println();---------
   // --------------
//    }
            //out of memory error
//    public static void main(String[] args) {
//
//        Integer[]Array=new Integer[10000*10000];
//        //System.out.println("the array value is"+ Array);
//    }


             //out of memory error----it is a class
//    public static void main(String[] args) {
//        for (int i=0;i<100;i++){
//       // for (int i=0;i<100;){
//            System.out.println(i);
//        }
//    }

               //assertationError
//    public static void main(String[] args) {
//        int value=15;
//        assert value>20:"underweight";
//        System.out.println("value"+value);
//    }

          //null point exception
         String str=null;
    public static void main(String[] args) {
        String str=null;
        //str="";
        try{
            System.out.println(str.length());
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
    }


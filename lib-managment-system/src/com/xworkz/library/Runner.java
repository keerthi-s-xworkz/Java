package com.xworkz.library;

public class Runner {

    public static void main(String[] args) {
        String str9="KEERTHI S";
        str9.length();
        String str10=str9.toLowerCase();
        System.out.println(str10);
        System.out.println("-----------------");


        String str19="keerthi s";
        str9.length();
        String str11=str19.toUpperCase();
        System.out.println(str11);
        System.out.println("-------------------");


        String str ="Akhila";                //using literal method
        String str1="Akhila";
        System.out.println(str==str1);
        System.out.println(str);
        //System.out.println(str1);
        System.out.println("------------------");


        String str2=new String("Akhila");       //using new keyword
        String str3=new String("paru");
//        String str7=new String("pavi");
        System.out.println(str2.equals(str3));
        System.out.println(str2);
        System.out.println(str3);
//        System.out.println(str7);
        System.out.println("---------------");

        String str8=new String("kee");
        str="kee";       //scp-string constant pool
        String str4=new String("kee");//instance memory
        System.out.println(str8==str4);
        System.out.println(str8.equals(str4));

        //Object obj=new String();
        System.out.println("---------------");

        Integer ref=new Integer(5);
       // Integer ref;
        ref=5;
        Integer ref1=new Integer(6);
        System.out.println(ref==ref1);
        System.out.println(ref.equals(ref1));
        System.out.println("-------------");

        String any="Baba";
        any="Singh";
        any="parrot";
        System.out.println(any);

    }
}

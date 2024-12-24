package com.xworkz;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.xworkz.librarybook.Book;

import java.util.Scanner;

public class ExceptionRunner {
    public static void main(String[] args) {
        System.out.println("main started");
//from ui we add them to backend we use text/string.

//        String st="782";
//        int status=Integer.parseInt(st);
//        System.out.println("user status is:"+status);
//
//        String st1="true";
//        boolean ref=Boolean.parseBoolean(st1);
//        System.out.println("user ref is:"+ref);
//
//        String st2="1234567890";
//        long anything=Long.parseLong(st2);
//        System.out.println("user anything is:"+anything);
//
//        try {
//            int i[] = new int[1];
//            i[0] = 987;
//            i[1] = 878;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("size is full");
//        }

//        int i[]=new int[1];
//        i[0]=7889;
//        i[1]=7809;
//        System.out.println(i);

//        String st8="78K2";
//        Scanner scanner=new Scanner(System.in); //scanner is a class
//        System.out.println("Enter the number");

        Scanner scanner=new Scanner(System.in);

        Book book=new Book();
        System.out.println("Enter the bookName");
        String bookName=scanner.next();
        book.setBookName(bookName);

        System.out.println("enter the bookId");
        int bookId=scanner.nextInt();
        book.setBookId(bookId);

        System.out.println("Enter the author name of book");
        //scanner.nextLine();
        String author=scanner.next();
        book.setAuthor(author);

        System.out.println("Enter the book prize");
        double prize=scanner.nextDouble();
        book.setPrice(prize);
        System.out.println(book);

        Book b1=new Book();
        System.out.println("Enter the bookName");
        String bookName1=scanner.next();
        book.setBookName(bookName1);

        System.out.println("enter the bookId");
        int bookId1=scanner.nextInt();
        book.setBookId(bookId1);

        System.out.println("Enter the author name of book");
        scanner.nextLine();
        String author1=scanner.nextLine();
        book.setAuthor(author1);

        System.out.println("Enter the book prize");
        double prize1=scanner.nextDouble();
        book.setPrice(prize1);

        System.out.println(b1);

        Book b2=new Book();
        System.out.println("Enter the bookName");
        String bookName2=scanner.next();
        book.setBookName(bookName2);

        System.out.println("enter the bookId");
        int bookId2=scanner.nextInt();
        book.setBookId(bookId2);

        System.out.println("Enter the author name of book");
        scanner.nextLine();
        String author2=scanner.nextLine();
        book.setAuthor(author2);

        System.out.println("Enter the book prize");
        double prize2=scanner.nextDouble();
        book.setPrice(prize2);
        System.out.println(b2);

        Book b3=new Book();
        System.out.println("Enter the bookName");
        String bookName3=scanner.next();
        book.setBookName(bookName3);

        System.out.println("enter the bookId");
        int bookId3=scanner.nextInt();
        book.setBookId(bookId3);

        System.out.println("Enter the author name of book");
        scanner.nextLine();
        String author3=scanner.nextLine();
        book.setAuthor(author3);

        System.out.println("Enter the book prize");
        double prize3=scanner.nextDouble();
        book.setPrice(prize3);
        System.out.println(b3);

        Book b4=new Book();
        System.out.println("Enter the bookName");
        String bookName4=scanner.next();
        book.setBookName(bookName4);

        System.out.println("enter the bookId");
        int bookId4=scanner.nextInt();
        book.setBookId(bookId4);

        System.out.println("Enter the author name of book");
        scanner.nextLine();
        String author4=scanner.nextLine();
        book.setAuthor(author4);

        System.out.println("Enter the book prize");
        double prize4=scanner.nextDouble();
        book.setPrice(prize4);
        System.out.println(b4);

        Book b5=new Book();
        System.out.println("Enter the bookName");
        String bookName5=scanner.next();
        book.setBookName(bookName5);

        System.out.println("enter the bookId");
        int bookId5=scanner.nextInt();
        book.setBookId(bookId5);

        System.out.println("Enter the author name of book");
        scanner.nextLine();
        String author5=scanner.nextLine();
        book.setAuthor(author5);

        System.out.println("Enter the book prize");
        double prize5=scanner.nextDouble();
        book.setPrice(prize5);
        System.out.println(b5);

        Book b6=new Book();
        System.out.println("Enter the bookName");
        String bookName6=scanner.next();
        book.setBookName(bookName6);

        System.out.println("enter the bookId");
        int bookId6=scanner.nextInt();
        book.setBookId(bookId6);

        System.out.println("Enter the author name of book");
        scanner.nextLine();
        String author6=scanner.nextLine();
        book.setAuthor(author6);

        System.out.println("Enter the book prize");
        double prize6=scanner.nextDouble();
        book.setPrice(prize6);
        System.out.println(b6);


        Book b8=new Book();
        System.out.println("Enter the bookName");
        String bookName8=scanner.next();
        book.setBookName(bookName8);

        System.out.println("enter the bookId");
        int bookId8=scanner.nextInt();
        book.setBookId(bookId8);

        System.out.println("Enter the author name of book");
        scanner.nextLine();
        String author8=scanner.nextLine();
        book.setAuthor(author8);

        System.out.println("Enter the book prize");
        double prize8=scanner.nextDouble();
        book.setPrice(prize8);
        System.out.println(b8);


        Book b9=new Book();
        System.out.println("Enter the bookName");
        String bookName9=scanner.next();
        book.setBookName(bookName9);

        System.out.println("enter the bookId");
        int bookId9=scanner.nextInt();
        book.setBookId(bookId9);

        System.out.println("Enter the author name of book");
        scanner.nextLine();
        String author9=scanner.nextLine();
        book.setAuthor(author9);

        System.out.println("Enter the book prize");
        double prize9=scanner.nextDouble();
        book.setPrice(prize9);
        System.out.println(b9);
       // System.out.println(book.toString());
        System.out.println("main ended");

    }
}

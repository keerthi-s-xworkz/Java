package com.xworkz.library;

import com.xworkz.librarybook.Book;
import lombok.ToString;

import java.util.Scanner;
@ToString
public class LibBookRunner  {

    public static void main(String args[]) {
//        CollegeLib collegeLib =new CollegeLib();
//        Book book = new Book();
//        System.out.println(book);
//        book.setBookId(3);
//        book.setBookName("ghgj");
//        book.setAuthor("uytiuo");
//        book.setPrice(342.35);
//        System.out.println(book);
//
//
//        Book book1 =new  Book();
//        System.out.println(book1);
//        book1.setBookId(4);
//        book1.setBookName("ghgj");
//        book1.setAuthor("uytiuo");
//        book1.setPrice(342.35);
//        System.out.println(book);

//        Book book2 =new  Book();
//        System.out.println(book2);
//        book2.setBookId(3);
//        book2.setBookName("ghgj");
//        book2.setAuthor("uytiuo");
//        book2.setPrice(342.35);

//           Object obj=new Book() ;//up casting(implicit type casting)
//       boolean same=book1.equals(book);
//        System.out.println(same);
////        collegeLib.addBook(book);
//
//
//        System.out.println(book.hashCode());
//        System.out.println(book1.hashCode());
        //exception---
//immutable-we can not change or modify the content or value ,we can not share the property from one class to another class
        //make class as final make members as private
        //final with variable we can not reassign the value

        // LibBookRunner ref=new LibBookRunner();
//        ref.setBookId(3);
//        ref.setBookName("jshskjdj");
//        ref.setAuthor("elkwewlk");
//        ref.setPrice(99.99);

        System.out.println("main started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of Books to be added");
        int size = scanner.nextInt();
        CollegeLib collegeLib = new CollegeLib(size);


        for (int i = 0; i < size; i++) {
            Book book = new Book();
            System.out.println("Enter the bookName");
            book.setBookName(scanner.next());
            System.out.println("Enter the author of the book");
            book.setAuthor(scanner.next());
            System.out.println("Enter the prize of the book");
            book.setPrice(scanner.nextDouble());
            System.out.println("Enter the book id");
            book.setBookId(scanner.nextInt());
        }
      String input=null;
        do {
            System.out.println("Press 1 to get bookId");
            System.out.println("Press 2 to updatePrice by id");
            int Options = scanner.nextInt();
            switch (Options) {
                case 1:
                    collegeLib.getBook();
                    break;
                case 2:
                    System.out.println("enter the price to be updated");
                    double ref = scanner.nextDouble();
                    break;
                default:
                    System.out.println("please provide valid options");
            }
            System.out.println("do you want to continue Yes/No");
            input = scanner.next();
        } while (input.equalsIgnoreCase("Yes"));
        System.out.println("thank you for ur coporation");
        System.out.println("main ended");
    }
    }




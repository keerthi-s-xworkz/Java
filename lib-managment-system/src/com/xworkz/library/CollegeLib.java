package com.xworkz.library;

import com.xworkz.BookNotFoundException;
import com.xworkz.IdNotFoundException;
import com.xworkz.librarybook.Book;

public class CollegeLib {
    Book book[]=null;

    public CollegeLib(int size) {
        book=new Book[size];
    }
    int index;

    public boolean addBook(Book book) {
        boolean isAdded = false;
        try {
            if (book != null) {
                if (book.getBookId() > 0 && book.getBookName() != null) {
                    this.book[index++] = book;
                    isAdded = true;
                }
            }
        }catch (BookNotFoundException B){
            B.printStackTrace();
        }
        return isAdded;
    }
    public void getBook(){
        for(Book book:book){
            if(book !=null){
                System.out.println(book);
            }
        }
    }

    public boolean updatePriceById(int id,double updatePrice){
        boolean isUpdatePrice=false;
        try {
            for (Book ref : book) {
                if (ref.getBookId() == id) {
                    ref.setPrice(updatePrice);
                    isUpdatePrice = true;
                }
            }
            if (isUpdatePrice == false)
                System.out.println(id + "not found");
        }catch (IdNotFoundException p){
            p.printStackTrace();
        }
        return isUpdatePrice;
    }



}

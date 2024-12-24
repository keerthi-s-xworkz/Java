package com.xworkz.collagelibrary;

import com.xworkz.lib.book.Book;

public class CollegeLibrary {
   Book book =new Book();

    public boolean addBook(Book book){
        boolean isAdded = false;
        if(book !=null){
            if(book.getBookId() > 0 && book.getBookName()!=null){
                this.book =book;
                isAdded = true;
            }
            return isAdded;
        }
    }
}

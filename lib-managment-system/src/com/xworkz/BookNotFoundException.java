package com.xworkz;

public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException(String errorMsg){
        super(errorMsg);
    }
}

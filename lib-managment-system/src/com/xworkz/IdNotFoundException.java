package com.xworkz;

public class IdNotFoundException extends RuntimeException{

    public IdNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

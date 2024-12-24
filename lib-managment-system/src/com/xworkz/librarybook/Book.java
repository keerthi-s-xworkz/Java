package com.xworkz.librarybook;

public  class Book  {
    private  String bookName;
    private  String author;
    private  double price;
    private  int bookId;


    public Book(){
       //
        // System.out.println("Book cons is invoked");
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String bookId(){
       // System.out.println("book id is invoked");
        return " book id is invoked";
    }

    @Override
    public String toString(){
        return "Book -(Book Id ="+this.bookId+","+
                "BookName="+this.bookName+"," +
                "Author="+this.author+","+
                "prize="+this.price+")";
    }


//    @Override
//    public int hashCode(){
//        return this.bookId;
//    }
//
//
//    @Override
//    public  boolean equals (Object obj){
//        Book book=(Book) obj;     //explicit type casting
//        //if(this.bookId==book.bookId && bookName ==book.bookName && author ==book.author && price==book.price)
//        if (this.hashCode()==book.hashCode())
//            return true;
//
//        return false;
//    }



}

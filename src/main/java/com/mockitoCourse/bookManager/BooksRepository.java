package com.mockitoCourse.bookManager;

import java.util.HashSet;
import java.util.Set;

public class BooksRepository {

    public Set<String> getBooks(){
        //connects to database and return books
        return new HashSet<String>();
    }
    public String addBook(String book){
        //adds book to database
        return book;
    }

}

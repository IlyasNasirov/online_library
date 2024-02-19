package com.library.dao;

import com.library.entity.Book;

import java.util.List;

public interface BookDao {

    public List<Book> getAllBooks();
    public Book getBook(int id);
    public void addBook(Book book);
    public void deleteBook(int id);

}

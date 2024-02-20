package com.library.service;

import com.library.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();
    public Book getBook(int id);
    public void addBook(Book book);
    public void deleteBook(int id);
    public List<Book> getBookByName(String nameBook);
}

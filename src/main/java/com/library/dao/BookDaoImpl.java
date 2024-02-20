package com.library.dao;

import com.library.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
   private SessionFactory sessionFactory;
    @Override
    public List<Book> getAllBooks() {
        Session session=sessionFactory.getCurrentSession();
        List<Book> allBook=session.createQuery("from Book",Book.class).getResultList();
        return allBook;
    }
    @Override
    public Book getBook(int id) {
            Session session=sessionFactory.getCurrentSession();
            Book book=session.get(Book.class,id);
        return book;
    }
    @Override
    public void addBook(Book book) {
            Session session=sessionFactory.getCurrentSession();
            session.save(book);
    }
    @Override
    public void deleteBook(int id) {
            Session session=sessionFactory.getCurrentSession();
        Query<Book> query= session.createQuery("delete from Book where id=:bookId");
        query.setParameter("bookId",id);
        query.executeUpdate();
    }

    @Override
    public List<Book> getBookByName(String nameBook) {
        Session session=sessionFactory.getCurrentSession();
        Query<Book> query=session.createQuery("from Book where nameBook=:name ",Book.class);
        query.setParameter("name",nameBook);
        List<Book> books=query.getResultList();

        return books;
    }
}

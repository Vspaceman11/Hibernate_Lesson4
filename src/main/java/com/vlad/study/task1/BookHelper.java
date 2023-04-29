package com.vlad.study.task1;

import com.vlad.study.task1.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class BookHelper {
    private SessionFactory sessionFactory;

    public BookHelper(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Book> getBookList(){
        Session session = sessionFactory.openSession();
        List<Book> bookList = session.createQuery("From Book").getResultList();
        session.close();
        return bookList;
    }
    public Book getBookById(long id){
        Session session = sessionFactory.openSession();
        Book book = session.get(Book.class, id);
        session.close();
        return book;
    }
    public void addBook(Book book){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(book);
        session.getTransaction().commit();
        session.close();

    }
}

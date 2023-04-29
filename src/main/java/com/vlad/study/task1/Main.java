package com.vlad.study.task1;

import com.vlad.study.task1.entity.Author;
import com.vlad.study.task1.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookHelper bookHelper = new BookHelper();
        AuthorHelper authorHelper = new AuthorHelper();

        Author author1 = new Author("George Orwell");
        Author author2 = new Author("Richard Morgan");
        Book book1 = new Book("1984", 1);
        Book book2 = new Book("Animal Farm", 1);
        Book book3 = new Book("Altered Carbon", 2);

        try{
//            authorHelper.addAuthor(author1);
//            authorHelper.addAuthor(author2);
//
//            bookHelper.addBook(book1);
//            bookHelper.addBook(book2);
//            bookHelper.addBook(book3);

            System.out.println("Book by id:");
            Book bookById = bookHelper.getBookById(3);
            System.out.println(bookById);

            System.out.println("List of authors:");
            List<Author> authorList = authorHelper.getAuthorList();
            for (Author a:authorList) {
                System.out.println(a);
            }

            System.out.println("List of books:");
            List<Book> bookList = bookHelper.getBookList();
            for (Book b: bookList) {
                System.out.println(b);
            }

        } catch (Exception e){
            throw new RuntimeException();
        }
    }
}
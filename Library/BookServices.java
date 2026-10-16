
package com.kiet.Library.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kiet.Library.model.Book;

@Service
public class BookServices {

    private final List<Book> books = new ArrayList<>();

    public BookServices() {
        books.add(new Book(201, "Effective Java",
                "Joshua Bloch", "Programming", 2018, true));
        books.add(new Book(202, "Clean Code",
                "Robert C. Martin", "Programming", 2008, true));
        books.add(new Book(203, "Wings of Fire",
                "A.P.J. Abdul Kalam", "Biography", 1999, true));
        books.add(new Book(204, "The Alchemist",
                "Paulo Coelho", "Fiction", 1988, false));
        books.add(new Book(205, "Introduction to Algorithms",
                "Thomas H. Cormen", "Education", 2009, true));
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public Book updateBook(int bookId, Book updatedBook) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                book.setCategory(updatedBook.getCategory());
                book.setPublicationYear(
                        updatedBook.getPublicationYear());
                book.setAvailable(updatedBook.isAvailable());
                return book;
            }
        }
        return null;
    }

    public boolean deleteBook(int bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Book> searchByCategory(String category) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getCategory().equalsIgnoreCase(category)) {
                result.add(book);
            }
        }

        return result;
    }

    public List<Book> findPublishedFromYear(int fromYear) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublicationYear() >= fromYear) {
                result.add(book);
            }
        }

        return result;
    }
}


package com.kiet.Library.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.Library.model.Book;
import com.kiet.Library.services.BookServices;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookServices service;

    public BookController(BookServices service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<?> getBookById(
            @PathVariable int bookId) {

        Book book = service.getBookById(bookId);

        if (book == null) {
            return ResponseEntity.status(404)
                    .body(Map.of("message", "Book not found"));
        }

        return ResponseEntity.ok(book);
    }

    @PostMapping
    public ResponseEntity<?> addBook(@RequestBody Book book) {

        if (service.getBookById(book.getBookId()) != null) {
            return ResponseEntity.status(409)
                    .body(Map.of("message", "Book ID already exists"));
        }

        return ResponseEntity.status(201)
                .body(service.addBook(book));
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<?> updateBook(
            @PathVariable int bookId,
            @RequestBody Book updatedBook) {

        Book book = service.updateBook(bookId, updatedBook);

        if (book == null) {
            return ResponseEntity.status(404)
                    .body(Map.of("message", "Book not found"));
        }

        return ResponseEntity.ok(book);
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<?> deleteBook(
            @PathVariable int bookId) {

        if (!service.deleteBook(bookId)) {
            return ResponseEntity.status(404)
                    .body(Map.of("message", "Book not found"));
        }

        return ResponseEntity.ok(
                Map.of("message", "Book deleted successfully"));
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchByCategory(
            @RequestParam String category) {

        List<Book> result = service.searchByCategory(category);

        if (result.isEmpty()) {
            return ResponseEntity.ok(
                    Map.of("message", "No books found in this category"));
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/published")
    public ResponseEntity<?> findPublishedFromYear(
            @RequestParam int fromYear) {

        List<Book> result =
                service.findPublishedFromYear(fromYear);

        if (result.isEmpty()) {
            return ResponseEntity.ok(
                    Map.of("message", "No books found for this year"));
        }

        return ResponseEntity.ok(result);
    }
}

package san.edu.lab3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import san.edu.lab3.domain.Book;
import san.edu.lab3.service.BookService;

import java.util.List;


@RestController
@Slf4j
public class BookUrlVersioningController {
    private BookService bookService;

    public BookUrlVersioningController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/v1/books")
    public List<Book> getBooks()
    {
        return bookService.getBooks();
    }


    @GetMapping("/v1/books/{id}")
    public Book getBooks(@PathVariable("id") Long id)
    {
        System.out.println("Running...");
        return bookService.getBook(id);
    }

    //3. POST /books - add a new book
    @PostMapping("/v1/books")
    public Book createBooks(@Validated Book book)
    {
        log.info("Book:",book.toString());
        return bookService.createBook(book);
    }
    @PutMapping("/v1/books")
    public Book updateBooks(@Validated Book book)
    {
        log.info("Updated Book:",book.toString());
        return bookService.updateBook(book);
    }
    @DeleteMapping("/v1/books/{id}")
    public Boolean deleteBooks(@PathVariable("id") Long id)
    {
        log.info("Deleted Book ID:",id);
        return bookService.deleteBook(id);
    }
}

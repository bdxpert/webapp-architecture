package san.edu.lab3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import san.edu.lab3.domain.Book;
import san.edu.lab3.service.BookService;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/books-version")
public class BookCustomHeaderVersioningController {
    private BookService bookService;

    public BookCustomHeaderVersioningController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks()
    {
        return bookService.getBooks();
    }


    @GetMapping(value="/{id}",headers = "X-Version=1")
    public Book getBooks(@PathVariable("id") Long id)
    {
        System.out.println("Running...");
        return bookService.getBook(id);
    }
    @GetMapping(value="/{id}",headers = "X-Version=2")
    public Book getBooksV2(@PathVariable("id") Long id)
    {
        System.out.println("Running...");
        return bookService.getBook(id);
    }

}

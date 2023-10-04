package san.edu.lab3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import san.edu.lab3.domain.Book;
import san.edu.lab3.service.BookService;


@RestController
@Slf4j
@RequestMapping("/books")
public class BookMediaTypeVersioningController {
    private BookService bookService;

    public BookMediaTypeVersioningController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping(value="/{id}", produces = "application/cs.miu.edu-v1+json")
    public Book getBooks(@PathVariable("id") Long id)
    {
        System.out.println("Running...");
        return bookService.getBook(id);
    }
    @GetMapping(value="/{id}", produces = "application/cs.miu.edu-v2+json")
    public Book getBooksV2(@PathVariable("id") Long id)
    {
        System.out.println("Running...");
        return bookService.getBook(id);
    }


}

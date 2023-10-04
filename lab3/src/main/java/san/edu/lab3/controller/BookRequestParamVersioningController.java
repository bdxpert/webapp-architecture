package san.edu.lab3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import san.edu.lab3.domain.Book;
import san.edu.lab3.service.BookService;


@RestController
@Slf4j
@RequestMapping("/books")
public class BookRequestParamVersioningController {
    private BookService bookService;

    public BookRequestParamVersioningController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping(value="/{id}", params = "version=1")
    public Book getBooks(@PathVariable("id") Long id)
    {
        System.out.println("Running...");
        return bookService.getBook(id);
    }
    @GetMapping(value="/{id}", params = "version=2")
    public Book getBooksV2(@PathVariable("id") Long id)
    {
        System.out.println("Running...");
        return bookService.getBook(id);
    }

}

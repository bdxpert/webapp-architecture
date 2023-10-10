package san.edu.lab7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import san.edu.lab7.domain.Book;
import san.edu.lab7.service.BookService;

import java.util.List;

/*
Create a Spring Boot Web Project with following features

1. Create a UserController which can register a new User with email, password, roles

2. Create a BookController which has CRUD operations

3. Add Spring security features below:

3. 1 All authenticated users can get books

3.2 Only Admin can update, delete, create a new Book

3.3 all users(unauthenticated, authenticated) can register new user


 */
@RestController
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getBooks()
    {
        return bookService.getBooks();
    }
    @GetMapping("/book/{id}")
    public Book getBooks(@PathVariable("id") Long id)
    {
        System.out.println("Running...");
        return bookService.getBook(id);
    }
}

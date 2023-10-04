package san.edu.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import san.edu.lab2.domain.Book;
import san.edu.lab2.service.BookService;


@Controller
@RequestMapping("/book")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/{id}")
    public ModelAndView index2(@PathVariable("id") long id) {
        ModelAndView mav = new ModelAndView("index2");
        mav.addObject("id", id);
        return mav;
    }

    @GetMapping("/books")
    public Book getBooks(@RequestParam(name = "id") Long id)
    {
        return bookService.getBook(id);
    }
}

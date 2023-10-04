package san.edu.lab2.service;

import org.springframework.stereotype.Component;
import san.edu.lab2.domain.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookServiceImpl implements BookService {
    private List<Book> books;
    public BookServiceImpl() {
        books = new ArrayList<>();
        Book book1 = new Book(1l,"Head First", "222-223-4455");
        Book book2 = new Book(2l,"Head First2", "222-223-4456");
        Book book3 = new Book(3l,"Head First3", "222-223-4457");
        books.add(book1);
        books.add(book2);
    }

    @Override
    public List<Book> getBooks() {

        return books;
    }
    @Override
    public Book getBook(long id){
        return books.stream().filter(book->book.getId()==id).findFirst().get();
    }
}

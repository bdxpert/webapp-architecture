package san.edu.lab3.service;

import org.springframework.stereotype.Component;
import san.edu.lab3.domain.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookServiceImpl implements BookService {
    private List<Book> books;

    public BookServiceImpl() {
        books = new ArrayList<>();
        Book book1 = new Book(1l, "Head First", "222-223-4455", 23.4);
        Book book2 = new Book(2l, "Head First2", "222-223-4456", 24.4);
        Book book3 = new Book(3l, "Head First3", "222-223-4457", 26.4);
        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

    @Override
    public List<Book> getBooks() {

        return books;
    }

    @Override
    public Book getBook(long id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().get();
    }

    @Override
    public Book createBook(Book book) {
        this.books.add(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        Book bookExisting = getBook(book.getId());
        if (bookExisting != null) {
            bookExisting.setIsbn(book.getIsbn());
            bookExisting.setPrice(book.getPrice());
            bookExisting.setTitle(book.getTitle());
        }

        return bookExisting;
    }

    @Override
    public Boolean deleteBook(Long id) {
        Book bookExisting = getBook(id);
        if (bookExisting != null) {
            books.remove(bookExisting);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

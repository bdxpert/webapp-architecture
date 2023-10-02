package san.edu.lab1.service;

import san.edu.lab1.domain.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBooks();
    public Book getBook(long id);
}

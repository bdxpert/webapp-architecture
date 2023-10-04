package san.edu.lab2.service;


import san.edu.lab2.domain.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBooks();
    public Book getBook(long id);
}

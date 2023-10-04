package san.edu.lab2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    long id;
    String title;
    String isbn;
}

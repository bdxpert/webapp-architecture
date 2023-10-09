package san.edu.lab4.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
//2. Create an Unidirectional ManyToOne association between Book and Publisher using annotations
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String isbn;
    private double price;

    @ManyToOne
    //@JoinColumn(name="publisher_id")
    @JoinTable(name="book_publisher",
    joinColumns = {@JoinColumn(name="book_id")},
    inverseJoinColumns = {@JoinColumn(name="publisher_id")})
    private Publisher publisher;
}

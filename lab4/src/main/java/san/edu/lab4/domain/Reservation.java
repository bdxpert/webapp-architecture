package san.edu.lab4.domain;

import jakarta.persistence.*;
import lombok.Data;
//5. Create a Unidirectional ManyToOne association between Reservation and Book using annotations.
@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    //@JoinColumn(name="publisher_id")
    @JoinTable(name="reservation_book",
            joinColumns = {@JoinColumn(name="reservation_id")},
            inverseJoinColumns = {@JoinColumn(name="book_id")})
    private Book book;
}

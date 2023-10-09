package san.edu.lab4.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//4. Create a Unidirectional OneToMany association between Customer and Reservation using annotations.
@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany
    @JoinTable(name = "customer_reservation",
               joinColumns =@JoinColumn(name = "customer_id"),
               inverseJoinColumns = @JoinColumn(name = "reservation_id"))
    List<Reservation> reservationList = new ArrayList<>();

}

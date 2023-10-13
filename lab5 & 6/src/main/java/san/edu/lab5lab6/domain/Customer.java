package san.edu.lab5lab6.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;

    @OneToMany(mappedBy = "customer")
    List<Order> orders = new ArrayList<>();

}

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

    @OneToMany
    @JoinTable(name = "customer_item_order",
               joinColumns =@JoinColumn(name = "customer_id"),
               inverseJoinColumns = @JoinColumn(name = "order_id"))
    List<Order> reservationList = new ArrayList<>();

}

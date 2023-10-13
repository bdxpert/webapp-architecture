package san.edu.lab5lab6.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="item_order")
public class Order {
    @Id
    long id;

    LocalDate date;

    @ManyToOne
    @JoinTable(name = "customer_item_order",
            joinColumns =@JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private Customer customer;

    @OneToMany
    @JoinTable(name = "item_order_order_line",
            joinColumns =@JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "order_line_id"))
    List<OrderLine> orderLine = new ArrayList<>();
}

package san.edu.lab5lab6.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderLine {
    @Id
    private long id;
    private int quantity;

    @ManyToOne
    @JoinTable(name="order_line_product",
            joinColumns = {@JoinColumn(name="order_line_id")},
            inverseJoinColumns = {@JoinColumn(name="product_id")})
    private Product product;

}

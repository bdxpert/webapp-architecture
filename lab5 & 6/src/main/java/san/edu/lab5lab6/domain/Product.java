package san.edu.lab5lab6.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
//@Inheritance(strategy= InheritanceType.JOINED)

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    long id;
    String name;
    String description;
}

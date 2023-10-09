package san.edu.lab4.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Department department;
    @ManyToOne
    private Office office;
}

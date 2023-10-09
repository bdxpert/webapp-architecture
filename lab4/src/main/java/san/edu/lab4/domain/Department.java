package san.edu.lab4.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
//1. Create a Bidirectional OneToMany association between Department and Employee using annotations.
@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy="department")
    private List<Employee> employees = new ArrayList<>();
}

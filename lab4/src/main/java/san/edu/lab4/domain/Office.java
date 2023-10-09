package san.edu.lab4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Office {
    @Id
    private long id;
    private String name;

    @OneToMany(mappedBy = "office")
    List<Employee> employees = new ArrayList<>();

}

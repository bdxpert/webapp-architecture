package san.edu.lab5lab6.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
    @Id
    private Long id;
    private String doctortype;
    private String firstname;
    private String lastname;
}
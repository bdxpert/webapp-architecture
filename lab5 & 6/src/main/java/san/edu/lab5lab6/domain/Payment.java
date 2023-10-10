package san.edu.lab5lab6.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {

    @Id
    long appointment_id;
    private String paydate;
    private double amount;
}

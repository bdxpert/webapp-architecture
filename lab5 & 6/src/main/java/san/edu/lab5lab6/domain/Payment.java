package san.edu.lab5lab6.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Payment {

    private String paydate;
    private double amount;
}

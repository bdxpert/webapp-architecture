package san.edu.lab5lab6.domain;

import jakarta.persistence.*;

@Entity
//@SecondaryTables(
//    @SecondaryTable(name="payment",
//            pkJoinColumns=
//                    { @PrimaryKeyJoinColumn(name="appointment_id", referencedColumnName="id")// reference column is appintment id
//    })
//)
public class Appointment {
    @Id
    @GeneratedValue
    private Long id;
    private String appdate;

    @Embedded
    private Payment payment;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
}

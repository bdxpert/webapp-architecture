package san.edu.lab4.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
//3. Create a Bidirectional ManyToMany association between Student and Course using annotations.

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToMany
    @JoinTable( name="student_course",
            joinColumns={@JoinColumn(name="student_id")},
    inverseJoinColumns = {@JoinColumn(name="course_id")})
    private List<Course> course;
}

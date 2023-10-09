package san.edu.lab4.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import san.edu.lab4.domain.Department;
import san.edu.lab4.service.DepartmentService;
/*
1. Create a Bidirectional OneToMany association between Department and Employee using annotations.

2. Create an Unidirectional ManyToOne association between Book and Publisher using annotations

3. Create a Bidirectional ManyToMany association between Student and Course using annotations.

4. Create a Unidirectional OneToMany association between Customer and Reservation using annotations.

5. Create a Unidirectional ManyToOne association between Reservation and Book using annotations.

6. Create a Bidirectional ManyToOne association between Employee and Office using annotations.
*/
@RestController
@Slf4j
@RequestMapping("/department")
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department create(@RequestBody Department department) {
        return departmentService.create(department);
    }
    @PutMapping
    public Department update(@RequestBody Department department) {
        return departmentService.update(department);
    }
}

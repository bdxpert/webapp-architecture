package san.edu.lab4.service;

import san.edu.lab4.domain.Department;

public interface DepartmentService {
    public Department create(Department department);
    public Department update(Department department);
    public Department get(Long id);

}

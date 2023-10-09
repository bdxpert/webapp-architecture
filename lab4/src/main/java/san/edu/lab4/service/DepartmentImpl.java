package san.edu.lab4.service;

import org.springframework.stereotype.Service;
import san.edu.lab4.domain.Department;
import san.edu.lab4.repository.DepartmentRepository;


@Service
public class DepartmentImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department create(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department update(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department get(Long id) {
        return departmentRepository.getById(id);
    }
}

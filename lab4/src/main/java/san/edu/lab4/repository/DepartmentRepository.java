package san.edu.lab4.repository;

import org.springframework.stereotype.Repository;
import san.edu.lab4.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}

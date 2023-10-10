package san.edu.lab5lab6.repository;

import org.springframework.stereotype.Repository;
import san.edu.lab5lab6.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

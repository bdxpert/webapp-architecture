package san.edu.lab5lab6.service;

import org.springframework.stereotype.Service;
import san.edu.lab5lab6.domain.Customer;
import san.edu.lab5lab6.repository.CustomerRepository;

@Service
public class CustomerImpl implements CustomerService {

    private CustomerRepository departmentRepository;

    public CustomerImpl(CustomerRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Customer create(Customer department) {
        return departmentRepository.save(department);
    }

    @Override
    public Customer update(Customer department) {
        return departmentRepository.save(department);
    }

    @Override
    public Customer get(Long id) {
        return departmentRepository.getById(id);
    }
}

package san.edu.lab5lab6.service;

import org.springframework.stereotype.Service;
import san.edu.lab5lab6.domain.Customer;
import san.edu.lab5lab6.repository.CustomerRepository;

@Service
public class CustomerImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer create(Customer department) {
        return customerRepository.save(department);
    }

    @Override
    public Customer update(Customer department) {
        return customerRepository.save(department);
    }

    @Override
    public Customer get(Long id) {
        return customerRepository.getById(id);
    }
}

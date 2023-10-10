package san.edu.lab5lab6.service;

import san.edu.lab5lab6.domain.Customer;

public interface CustomerService {
    public Customer create(Customer department);
    public Customer update(Customer department);
    public Customer get(Long id);

}

package san.edu.lab5lab6.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import san.edu.lab5lab6.domain.Customer;
import san.edu.lab5lab6.service.CustomerService;


@RestController
@Slf4j
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService departmentService) {
        this.customerService = departmentService;
    }

    @PostMapping
    public Customer create(@RequestBody Customer department) {
        return customerService.create(department);
    }
    @PutMapping
    public Customer update(@RequestBody Customer department) {
        return customerService.update(department);
    }
}

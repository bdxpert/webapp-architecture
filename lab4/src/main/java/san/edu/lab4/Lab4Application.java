package san.edu.lab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import san.edu.lab4.domain.Book;
import san.edu.lab4.domain.Department;
import san.edu.lab4.domain.Employee;
import san.edu.lab4.domain.Publisher;
import san.edu.lab4.repository.BookRepository;
import san.edu.lab4.repository.EmployeeRepository;
import san.edu.lab4.repository.PublisherRepository;
import san.edu.lab4.service.DepartmentService;

@SpringBootApplication
public class Lab4Application implements ApplicationRunner {
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private PublisherRepository publisherRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab4Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Department department1 = new Department();
		department1.setName("English");

		Department department2 = new Department();
		department2.setName("Math");
		Employee employee1 = new Employee();
		employee1.setName("Bob");
		employee1.setDepartment(department1);

		Employee employee2 = new Employee();
		employee2.setName("Bob");
		employee2.setDepartment(department2);

		departmentService.create(department1);
		departmentService.create(department2);
		employeeRepository.save(employee2);
		employeeRepository.save(employee1);

		Publisher publisher = new Publisher();
		publisher.setName("SSD");
		publisherRepository.save(publisher);

		Book book = new Book();
		book.setIsbn("2223-444-444");
		book.setPrice(12.0);
		book.setTitle("My Book");
		book.setPublisher(publisher);
		bookRepository.save(book);


	}
}

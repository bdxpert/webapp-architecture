package san.edu.lab5lab6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import san.edu.lab5lab6.service.CustomerService;

@SpringBootApplication
public class Lab5Lab6Application implements ApplicationRunner {
	@Autowired
	private CustomerService departmentService;


	public static void main(String[] args) {
		SpringApplication.run(Lab5Lab6Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {


	}
}

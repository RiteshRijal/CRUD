package com.crud.operation.springbootbackend;

import com.crud.operation.springbootbackend.model.Employee;
import com.crud.operation.springbootbackend.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(SpringbootBackendApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
//   to create a data
//		Employee employee1=new Employee();
//		employee1.setFirstName("Ram");
//		employee1.setLastName("Yadav");
//		employee1.setEmailId("ramyadav@gmail.com");
//
//		Employee employee2=new Employee();
//		employee2.setFirstName("Hari");
//		employee2.setLastName("Yadav");
//		employee2.setEmailId("hariyadav@gmail.com");
//
//
//		Employee employee3=new Employee();
//		employee3.setFirstName("Krishna");
//		employee3.setLastName("Yadav");
//		employee3.setEmailId("Krishnayadav@gmail.com");


//		List<Employee>employees=List.of(employee1,employee2,employee3);
//		Iterable<Employee> allemp = userRepository.saveAll(employees);

		//passing with help of lamda
//		allemp.forEach(employee ->{
//			System.out.println(employee);
//		});
// to update the data inside database
//		Optional<Employee> optional = userRepository.findById(3);
//		Employee employee = optional.get();
//		System.out.println(employee);
//
//		employee.setLastName("Sharma");
//		Employee result = userRepository.save(employee);
//		System.out.println(result);

		userRepository.deleteById(4);
		System.out.println("deleted");


		System.out.println("-------------");
	}
}

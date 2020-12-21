package net.javapractice.springboot.datatabse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javapractice.spingboot.model.User;
import net.javapractice.spingboot.repository.UserRepository;

@SpringBootApplication
public class AccessMongodb implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(AccessMongodb.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		userRepository.deleteAll();
//
//		// save a couple of customers
//		userRepository.save(new User("Alice", "Smith", "smith@gmail.com"));
//		userRepository.save(new User("Bob", "Smith", "Bob@gmail.com"));
//
//		// fetch all customers
//		System.out.println("Customers found with findAll():");
//		System.out.println("-------------------------------");
//		for (User user : userRepository.findAll()) {
//			System.out.println(user);
//		}
//		System.out.println();
//
//		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(userRepository.findByFirstName("Alice"));
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (User user : userRepository.findByLastName("Smith")) {
//			System.out.println(user);
//		}

	}

}
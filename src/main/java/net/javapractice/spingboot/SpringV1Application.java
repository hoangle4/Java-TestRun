package net.javapractice.spingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javapractice.spingboot.model.User;
import net.javapractice.spingboot.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SpringV1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringV1Application.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run (String... args) throws Exception {
		this.userRepository.save(new User("Hoang", "Le", "hoanglva@gmail.com"));
		this.userRepository.save(new User("Hoang", "Le", "hoanglva@gmail.com"));
		this.userRepository.save(new User("Hoang", "Le", "hoanglva@gmail.com"));
	}
	
}

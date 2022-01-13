package com.m2ilyon.ndiaye.mongoapi;

import com.m2ilyon.ndiaye.mongoapi.model.Address;
import com.m2ilyon.ndiaye.mongoapi.model.Gender;
import com.m2ilyon.ndiaye.mongoapi.model.User;
import com.m2ilyon.ndiaye.mongoapi.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
public class MongoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoapiApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository userRepository) {
		return args -> {
			Address address = new Address(
					"78 BoilerPlate Street",
					"23PL",
					"NY",
					"US"
			);
			User u = new User(
					"John",
					"Doe",
					"john_doe",
					"john.doe@gmail.com",
					Gender.MALE,
					address,
					BigDecimal.valueOf(100.00),
					LocalDateTime.now()
			);
			userRepository.save(u);
		};
	}

}

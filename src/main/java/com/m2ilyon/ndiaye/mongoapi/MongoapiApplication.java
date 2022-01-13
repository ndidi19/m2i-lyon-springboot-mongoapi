package com.m2ilyon.ndiaye.mongoapi;

import com.m2ilyon.ndiaye.mongoapi.model.Address;
import com.m2ilyon.ndiaye.mongoapi.model.Gender;
import com.m2ilyon.ndiaye.mongoapi.model.User;
import com.m2ilyon.ndiaye.mongoapi.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class MongoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoapiApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository userRepository, MongoTemplate mongoTemplate) {
		return args -> {
			Address address = new Address(
					"78 BoilerPlate Street",
					"23PL",
					"NY",
					"US"
			);
			User u = new User(
					"John",
					"Smith",
					"john_smith",
					"john.smith@gmail.com",
					Gender.MALE,
					address,
					BigDecimal.valueOf(100.00),
					LocalDateTime.now()
			);

//			Query query = new Query();
//			query.addCriteria(Criteria.where("email").is(u.getEmail()));
//
//			List<User> userList = mongoTemplate.find(query, User.class);
//			if (userList.isEmpty()) {
//				System.out.println("Save user with firstname : " + u.getFirstname());
//				userRepository.insert(u);
//			} else {
//				System.out.println("User already exists for given email : " + u.getEmail());
//			}

			userRepository.findUserByEmail(u.getEmail())
					.ifPresentOrElse(user -> {
						System.out.println("User already exists for given email : " + u.getEmail());
					}, () -> {
						userRepository.insert(u);
						System.out.println("Saved user with firstname : " + u.getFirstname());
					});


		};
	}

}

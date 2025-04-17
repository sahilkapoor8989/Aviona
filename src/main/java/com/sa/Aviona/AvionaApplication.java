package com.sa.Aviona;

import com.sa.Aviona.model.User;
import com.sa.Aviona.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AvionaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvionaApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserRepository userRepository) {
		return args -> {
			userRepository.save(User.builder()
					.name("Abhishek")
					.email("abhishek@blabla.com")
					.phoneNumber("9999999999")
					.roleId(1L)
					.build());

			userRepository.save(User.builder()
					.name("Sahil")
					.email("sahil@blabla.com")
					.phoneNumber("8888888888")
					.roleId(2L)
					.build());
		};
	}
}

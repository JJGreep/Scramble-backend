package com.Scramble.backend;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication()
@ComponentScan(basePackages = {"com.Scramble.backend.*"})
public class BackendApplication {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;


	public static void main(String[] args) throws Exception {
        SpringApplication.run(BackendApplication.class, args);

	}

	@Bean
	public CommandLineRunner init(AccountRepo userDao){
		return args -> {
			Account user1 = new Account();
			user1.setUserName("twaalf");
			user1.setEmail("twaalf@hotmail.com");
			user1.setPassword(passwordEncoder.encode("twaalf"));
			userDao.save(user1);

			Account user2 = new Account();
			user2.setUserName("drie");
			user2.setEmail("drie@hotmail.com");
			user2.setPassword(passwordEncoder.encode("drie"));
			userDao.save(user2);
		};
	}
}

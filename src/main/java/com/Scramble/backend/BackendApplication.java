package com.Scramble.backend;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Models.Restaurant;
import com.Scramble.backend.Models.Search;
import com.Scramble.backend.Repositories.AccountRepo;
import com.Scramble.backend.Services.ZomatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
		};

	}
}

package com.Scramble.backend;

import com.Scramble.backend.Models.Restaurant;
import com.Scramble.backend.Models.Search;
import com.Scramble.backend.Services.ZomatoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.lang.reflect.Array;
import java.util.ArrayList;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Scramble.backend.Controllers","com.Scramble.backend.Models","com.Scramble.backend.Services","com.Scramble.backend.Transformers","com.Scramble.backend.Entities","com.Scramble.backend.Repositories"})
public class BackendApplication {

	public static void main(String[] args) throws Exception {
        SpringApplication.run(BackendApplication.class, args);

	}

}

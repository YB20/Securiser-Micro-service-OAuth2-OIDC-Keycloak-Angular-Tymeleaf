package com.example.customerfrontthmeleaftapp;

import com.example.customerfrontthmeleaftapp.entities.Customer;
import com.example.customerfrontthmeleaftapp.repos.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThmeleaftAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerFrontThmeleaftAppApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().name("Youssef").email("youssef@gmail.com").build());
			customerRepository.save(Customer.builder().name("Maryam").email("maryam@gmail.com").build());
			customerRepository.save(Customer.builder().name("Amir").email("Amir@gmail.com").build());
		};
	}

}

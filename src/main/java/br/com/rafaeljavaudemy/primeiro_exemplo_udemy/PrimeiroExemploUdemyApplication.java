package br.com.rafaeljavaudemy.primeiro_exemplo_udemy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeiroExemploUdemyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroExemploUdemyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\n\nTEST");
		
	}

}

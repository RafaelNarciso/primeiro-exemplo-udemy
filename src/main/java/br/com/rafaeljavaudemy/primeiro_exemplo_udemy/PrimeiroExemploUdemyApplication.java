package br.com.rafaeljavaudemy.primeiro_exemplo_udemy;

import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.model.Produto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

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

package br.com.vitorzucon.nesting_optmization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class NestingOptmizationApplication {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Dotenv dotenv = Dotenv.load();
		SpringApplication.run(NestingOptmizationApplication.class, args);
	}

}

package edu.eci.cvds.sistemabiblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("edu.eci.cvds.sistemabiblioteca.repository")
@EntityScan("edu.eci.cvds.sistemabiblioteca.model")
@SpringBootApplication()
public class SistemaBibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaBibliotecaApplication.class, args);
	}

}

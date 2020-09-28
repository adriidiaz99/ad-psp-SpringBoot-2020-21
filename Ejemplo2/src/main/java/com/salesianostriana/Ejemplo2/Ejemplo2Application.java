package com.salesianostriana.Ejemplo2;

import com.salesianostriana.Ejemplo2.dao.AlumnoRepository;
import com.salesianostriana.Ejemplo2.model.Alumno;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejemplo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo2Application.class, args);
	}

	@Bean
	public CommandLineRunner init(AlumnoRepository alumnRepo){

		return args -> {
			alumnRepo.save(Alumno.builder()
					.nombre("pedro")
					.direccion("Micasa").build());
			System.out.println(alumnRepo.findAll());
		};
	}

}

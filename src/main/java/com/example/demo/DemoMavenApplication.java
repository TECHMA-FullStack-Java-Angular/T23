package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMavenApplication.class, args);
		
	}
	
	@GetMapping("/")
	public String bienvenidoMaven() {
		return String.format("Proyecto Maven funciona correctamente.");
	}
	
	@GetMapping("/prueba")
	public String pruebaMaven(@RequestParam(value="proyecto", defaultValue="Maven") String proyecto) {
		return String.format("Proyecto: %s!", proyecto);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoGraddleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGraddleApplication.class, args);
	}
	
	@GetMapping("/")
	public String bienvenidoGraddle() {
		return String.format("Proyecto Graddle funciona correctamente.");
	}
	
	@GetMapping("/prueba")
	public String pruebaMaven(@RequestParam(value="proyecto", defaultValue="Graddle") String proyecto) {
		return String.format("Proyecto: %s!", proyecto);
	}

}

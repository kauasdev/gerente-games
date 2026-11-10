package br.senac.tads.dsw.gerente_games;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	@GetMapping("/hello")
	public Mensagem hello() {
		return new Mensagem("Kauan Silva Lopes", "Olá, mundo! Meu primeiro endpoint Spring Boot.");
	}
}


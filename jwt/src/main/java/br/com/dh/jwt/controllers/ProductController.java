package br.com.dh.jwt.controllers;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.jwt.services.JwtService;
import br.com.dh.jwt.services.UsuarioServiceImpl;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/produto")
@RequiredArgsConstructor
public class ProductController {
	
	@GetMapping
	public String produtoTeste() {
		return "Teste bem sucedido";
	}
}

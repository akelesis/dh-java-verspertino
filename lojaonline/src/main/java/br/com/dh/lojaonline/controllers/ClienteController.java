package br.com.dh.lojaonline.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.lojaonline.model.Database;
import br.com.dh.lojaonline.model.entities.Cliente;
import br.com.dh.lojaonline.model.repositories.ClienteRepository;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping()
	public Iterable<Cliente> getClientes() {
		return clienteRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> getById(@PathVariable int id) {
		return clienteRepository.findById(id);
	}
	
	@PostMapping()
	public Cliente addCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable int id) {
		clienteRepository.deleteById(id);
	}
	
	@PutMapping("/{idCliente}")
	public Cliente updateCliente(@PathVariable int idCliente, @RequestBody Cliente dadosCliente) throws Exception {
		Cliente clienteDB = clienteRepository.findById(idCliente)
				.orElseThrow(() -> new IllegalAccessException());
		
		if(!dadosCliente.getCpf().isEmpty()) clienteDB.setCpf(dadosCliente.getCpf());
		if(!dadosCliente.getNome().isEmpty()) clienteDB.setNome(dadosCliente.getNome());
		
		clienteRepository.save(clienteDB);
		
		return clienteDB;
	}
	
}

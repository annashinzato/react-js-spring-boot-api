package sysconstucao.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import sysconstucao.crm.model.Cliente;
import sysconstucao.crm.repository.ClienteRepository;



@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("Cliente/{id}")
	public Cliente ListaCliente(@PathVariable(value="id")long id) {
		return clienteRepository.findById(id);
	}
		
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletarCliente (@RequestBody Cliente cliente) {
		 clienteRepository.delete(cliente);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public Cliente update (@RequestBody Cliente Cliente) {
		 return clienteRepository.save(Cliente);
	}
	
}
		
	


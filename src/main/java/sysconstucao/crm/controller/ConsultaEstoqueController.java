package sysconstucao.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import sysconstucao.crm.repository.ConsultaEstoqueRepository;
import sysconstucao.crm.model.ConsultaEstoque;

@RestController
@RequestMapping("/consulta")
public class ConsultaEstoqueController  {

	@Autowired
	private ConsultaEstoqueRepository ConsultaEstoqueRepository;
	
	@GetMapping
	public List<ConsultaEstoque> listar(){
		return ConsultaEstoqueRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ConsultaEstoque adicionar (@RequestBody ConsultaEstoque ConsultaEstoque) {
		return ConsultaEstoqueRepository.save(ConsultaEstoque);
	}
	
	@DeleteMapping
	public void deletaConsulta(@RequestBody ConsultaEstoque ConsultaEstoque) {
		ConsultaEstoqueRepository.delete(ConsultaEstoque);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public ConsultaEstoque update(@RequestBody ConsultaEstoque ConsultaEstoque) {
		return ConsultaEstoqueRepository.save(ConsultaEstoque);
	}
	

	
	
}
	


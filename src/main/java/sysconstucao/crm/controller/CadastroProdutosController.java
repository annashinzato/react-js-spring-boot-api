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

import sysconstucao.crm.model.CadastroProdutos;
import sysconstucao.crm.repository.CadastroProdutosRepository;


@RestController
@RequestMapping("/CadastroP")
public class CadastroProdutosController {
	
	@Autowired
	private CadastroProdutosRepository CadastroProdutosRepository;
	
	@GetMapping
	public List<CadastroProdutos> listar(){
		return CadastroProdutosRepository.findAll();
	}
	
	@GetMapping("CadastroProdutos/{id}")
	public CadastroProdutos ListaCadastroProdutos(@PathVariable(value="id")long id) {
		return CadastroProdutosRepository.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CadastroProdutos adicionar(@RequestBody CadastroProdutos CadastroProdutos) {
		return CadastroProdutosRepository.save(CadastroProdutos);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletarProduto (@RequestBody CadastroProdutos CadastroProdutos) {
		 CadastroProdutosRepository.delete(CadastroProdutos);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public CadastroProdutos update (@RequestBody CadastroProdutos CadastroProdutos) {
		 return CadastroProdutosRepository.save(CadastroProdutos);
	}
	
	
	
	
	
	

}

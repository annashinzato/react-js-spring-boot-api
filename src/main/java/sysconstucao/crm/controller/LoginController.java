package sysconstucao.crm.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import sysconstucao.crm.model.Login;
import sysconstucao.crm.repository.LoginRpository;


@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginRpository LoginRpository;
	
	@GetMapping
	public List<Login> listar(){
		return LoginRpository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Login adicionar(@RequestBody Login Login) {
		return LoginRpository.save(Login);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletarLogin(@RequestBody Login login) {
		LoginRpository.delete(login);
	}
	
	
		

}

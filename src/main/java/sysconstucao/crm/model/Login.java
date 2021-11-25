package sysconstucao.crm.model;

import javax.persistence.Entity;


@Entity
public class Login {
	
	private String email;
	private int senha;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
	
}

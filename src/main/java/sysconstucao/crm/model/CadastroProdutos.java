package sysconstucao.crm.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadastroProdutos {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	public String NomeP;
	public String Categoria;
	public String Data;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeP() {
		return NomeP;
	}
	public void setNomeP(String nomeP) {
		NomeP = nomeP;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getData() {
		return Data;
	}
	/*public void setData(String data) {
		Data = ;
	}
	*/


}

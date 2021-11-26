package sysconstucao.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private int cep;
	private int telefone;
	
	
	
	
}



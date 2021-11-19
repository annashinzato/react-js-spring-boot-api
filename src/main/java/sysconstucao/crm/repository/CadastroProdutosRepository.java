package sysconstucao.crm.repository;

import sysconstucao.crm.model.CadastroProdutos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroProdutosRepository extends JpaRepository<CadastroProdutos, Long>{
	CadastroProdutos findById(long id);
}

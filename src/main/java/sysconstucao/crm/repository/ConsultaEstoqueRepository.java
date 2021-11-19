package sysconstucao.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sysconstucao.crm.model.ConsultaEstoque;

public interface ConsultaEstoqueRepository extends JpaRepository<ConsultaEstoque, Long> {
	ConsultaEstoque findById(long codProduto);
}


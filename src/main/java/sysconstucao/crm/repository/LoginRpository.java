package sysconstucao.crm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sysconstucao.crm.model.Login;

@Repository
public interface LoginRpository extends JpaRepository<Login, Long> {
	
}

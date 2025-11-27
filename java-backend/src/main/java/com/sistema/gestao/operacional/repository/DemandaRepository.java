package sistema.gestao.operacional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema.gestao.operacional.model.Demanda;

public interface DemandaRepository extends JpaRepository<Demanda, Long> {

}

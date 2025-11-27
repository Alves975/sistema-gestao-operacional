package sistema.gestao.operacional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema.gestao.operacional.model.Log;

public interface LogRepository extends JpaRepository<Log, Long> {

}

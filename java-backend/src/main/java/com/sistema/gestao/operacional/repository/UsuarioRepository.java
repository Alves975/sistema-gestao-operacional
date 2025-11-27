package sistema.gestao.operacional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema.gestao.operacional.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

package futebol.br.site.varzea.repository;

import futebol.br.site.varzea.model.bean.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
}

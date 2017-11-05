package pe.com.GeoConcesionX.Repositorio;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.GeoConcesionX.model.Usuario;



@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{

	
}

package pe.com.GeoConcesionX.Service;
import java.util.List;

import org.springframework.stereotype.Service;
import pe.com.GeoConcesionX.model.Usuario;


@Service
public interface UsuarioService {

	public Usuario buscarPorId(int id);
}

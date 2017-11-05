package pe.com.GeoConcesionX.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.GeoConcesionX.Repositorio.UsuarioRepositorio;
import pe.com.GeoConcesionX.model.Usuario;



@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired UsuarioRepositorio repositorioInterface;
		
	@Override
	public Usuario buscarPorId(int id) {
		return repositorioInterface.findOne(id);
	}
	
}

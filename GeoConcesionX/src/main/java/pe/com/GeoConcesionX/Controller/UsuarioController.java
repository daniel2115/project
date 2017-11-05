package pe.com.GeoConcesionX.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.GeoConcesionX.Service.UsuarioService;
import pe.com.GeoConcesionX.model.Usuario;

@Controller
public class UsuarioController {
	@Autowired
	UsuarioService usuarioservice;
	
	
	@RequestMapping(value="/")
	public String Login(Model model){	
		Usuario usuario = new Usuario();
		model.addAttribute("usuario",usuario);
		return "/admin/index";
	}
	
	@RequestMapping(value="/menu",method = RequestMethod.POST)
	public String Menu(Usuario usuario,Model model){
		//Validacion:
		if (usuario.getCorreo().equals("admin@hotmail.com") 
				&& usuario.getPassword().equals("123")){
			return "/admin/Menu";	
		}
		else{
			
			if(!usuario.getCorreo().equals("admin@hotmail.com")){
				model.addAttribute("mensaje1","Correo Invalido");
							
			}
			
			if(!usuario.getPassword().equals("123")){
				model.addAttribute("mensaje2","Contraseña Invalida");
			}
			
			return "/admin/index";
		}
	}
	
	@RequestMapping(value="/menu")
	public String MenuGet(Usuario usuario,Model model){
			return "/admin/Menu";	
	}
	
	@RequestMapping(value="/menu/detalle")
	public String Detalle(Model model){
		return "/admin/maps-vector";
	}
	
	@RequestMapping(value="/menu/config")
	public String Configuracion(Model model){
		return "/admin/config";
	}
	
	@RequestMapping(value="/menu/favo")
	public String FavoritosConcesion(Model model){
		return "/admin/FavoConcesiones";
	}
	
	@RequestMapping(value="/menu/favo/lugar")
	public String FavoritoLugar(Model model){
		return "/admin/FavoLugares";
	}
	
	@RequestMapping(value="/menu/favo/petit")
	public String FavoritosPetitorio(Model model){
		return "/admin/FavoPetitorio";
	}
	
	@RequestMapping(value="/menu/detalle/concesion")
	public String Rarw(Model model){
		return "/admin/concesionDetalle";
	}
	
	@RequestMapping(value="/menu/detalle/arealibre")
	public String Rarw2(Model model){
		return "/admin/LugardisponibleDetalle";
	}
	
	@RequestMapping(value="/menu/detalle/concesion/vencida")
	public String Rarw3(Model model){
		return "/admin/concesionVencidaDetalle";
	}
}

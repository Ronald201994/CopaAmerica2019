package edu.cibertec.rest.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.CamisetaDTO;
import edu.cibertec.servicio.CamisetaServicio;

@Path("/post")
public class RestCamiseta {
	//http://localhost:8081/API_CopaAmerica2019/post/registrarCamiseta/PERU/	
	@POST
	@Path("/registrarCamiseta")
	@Consumes({MediaType.TEXT_PLAIN})
	@Produces(MediaType.APPLICATION_JSON)
	public String registrarCamiseta(CamisetaDTO camiseta){
		System.out.println("Entró al método registrarCamiseta()");
		String mensaje = "";
		boolean ok = false;
		CamisetaServicio servicio = new CamisetaServicio();
		
		ok = servicio.registrarCamiseta(camiseta);
		
		if (ok) {
			mensaje = "Se registró con exito!";
		}
		else {
			mensaje = "No se registró con exito!";
		}
		
		return mensaje;
	}
}

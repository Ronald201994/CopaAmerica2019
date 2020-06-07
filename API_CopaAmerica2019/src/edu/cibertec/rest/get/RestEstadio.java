package edu.cibertec.rest.get;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import edu.cibertec.dto.EstadioDTO;
import edu.cibertec.servicio.EstadioServicio;

@Path("/estadio")
public class RestEstadio {
	//http://localhost:8080/API_CopaAmerica2019/estadio/listarEstadios
	@GET
	@Path("/listarEstadios")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EstadioDTO> ListarEstadios(){
		System.out.println("Entró al método ListarEstadios()");
		
		List<EstadioDTO> listaEstadios = new ArrayList<>();		
		EstadioServicio servicio = new EstadioServicio();
		
		listaEstadios = servicio.listarEstadios();
		
		return listaEstadios;
	}
	
	//http://localhost:8080/API_CopaAmerica2019/estadio/obtenerEstadioByNombreAndPais/Peru/Estadio Nacional del Perú
	@GET
	@Path("/obtenerEstadioByNombreAndPais/{nombrePais}/{nombreEstadio}")
	@Produces(MediaType.APPLICATION_JSON)
	public EstadioDTO ObtenerEstadioByNombreAndPais(@PathParam("nombrePais") String nombrePais, @PathParam("nombreEstadio") String nombre){
		System.out.println("NombrePais: "+nombrePais);
		System.out.println("NombrePais: "+nombre);
		
		EstadioDTO estadio = new EstadioDTO();		
		EstadioServicio servicio = new EstadioServicio();
		
		estadio = servicio.obtenerEstadioByNombreAndPais(nombrePais, nombre);
		
		return estadio;
	}
}

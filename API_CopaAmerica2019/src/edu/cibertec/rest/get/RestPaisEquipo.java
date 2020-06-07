package edu.cibertec.rest.get;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.PaisEquipoDTO;
import edu.cibertec.servicio.PaisEquipoServicio;

@Path("/paisEquipo")
public class RestPaisEquipo {
	
	//http://localhost:8080/API_CopaAmerica2019/paisEquipo/listarSelecciones
	@GET
	@Path("/listarSelecciones")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PaisEquipoDTO> ListarSelecciones(){
		System.out.println("Entró al método ListarSelecciones()");
		
		List<PaisEquipoDTO> listaSelecciones = new ArrayList<>();		
		PaisEquipoServicio servicio = new PaisEquipoServicio();
		
		listaSelecciones = servicio.listarSelecciones();
		
		return listaSelecciones;
	}
	
	//http://localhost:8080/API_CopaAmerica2019/paisEquipo/hola	
	//url: http://localhost:8080/api-rest/get/hola	
	@GET
	@Path("/hola")
	@Produces(MediaType.TEXT_PLAIN)
	public String holaMundo() {
		
		System.out.println("Entrando al método holaMundo()");
		
		
		return "Hola Servicios REST - XD - :D";
		
	}
	
	//http://localhost:8080/API_CopaAmerica2019/paisEquipo/obtenerSeleccionByNombre/Peru
	@GET
	@Path("/obtenerSeleccionByNombre/{nombrePais}")
	@Produces(MediaType.APPLICATION_JSON)
	public PaisEquipoDTO ObtenerSeleccionByNombre(@PathParam("nombrePais") String nombrePais){
		System.out.println("NombrePais: "+nombrePais);
		
		PaisEquipoDTO paisEquipo = new PaisEquipoDTO();		
		PaisEquipoServicio servicio = new PaisEquipoServicio();
		
		paisEquipo = servicio.obtenerSeleccionByNombre(nombrePais);
		
		return paisEquipo;
	}
	
}

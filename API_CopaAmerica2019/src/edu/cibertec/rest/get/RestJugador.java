package edu.cibertec.rest.get;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.JugadorDTO;
import edu.cibertec.servicio.JugadorServicio;

@Path("/jugador")
public class RestJugador {

	//http://localhost:8080/API_CopaAmerica2019/jugador/listarCapitanes
	@GET
	@Path("/listarCapitanes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<JugadorDTO> ListarCapitanes(){
		System.out.println("Entró al método ListarCapitanes()");
		
		List<JugadorDTO> listaCapitanes = new ArrayList<>();		
		JugadorServicio servicio = new JugadorServicio();
		
		listaCapitanes = servicio.listarCapitanes();
		
		return listaCapitanes;
	}
	
	//http://localhost:8080/API_CopaAmerica2019/jugador/obtenerJugadorByNombreAndNombrePais/José Paolo Guerrero/Peru
	@GET
	@Path("/obtenerJugadorByNombreAndNombrePais/{nombreJugador}/{nombrePais}")
	@Produces(MediaType.APPLICATION_JSON)
	public JugadorDTO ObtenerJugadorByNombreAndNombrePais(@PathParam("nombreJugador") String nombreJugador, @PathParam("nombrePais") String nombrePais){
		System.out.println("NombrePais: "+nombreJugador);
		System.out.println("NombrePais: "+nombrePais);
		
		JugadorDTO jugador = new JugadorDTO();
		JugadorServicio servicio = new JugadorServicio();
		
		jugador = servicio.obtenerJugadorByNombreAndNombrePais(nombreJugador, nombrePais);
		
		return jugador;
	}
}

package edu.cibertec.rest.get;

import java.util.ArrayList;
import java.util.List;

import edu.cibertec.dto.CamisetaDTO;
import edu.cibertec.dto.JugadorDTO;
import edu.cibertec.dto.PaisEquipoDTO;
import edu.cibertec.servicio.CamisetaServicio;
import edu.cibertec.servicio.JugadorServicio;
import edu.cibertec.servicio.PaisEquipoServicio;

public class Prueba {

	public static void main(String[] args) {		
		/*CamisetaDTO camiseta = new CamisetaDTO();
		camiseta.setPais("Perú");
		camiseta.setCantidad(10);
		camiseta.setNumero(9);
		camiseta.setJugador("Paolo Guerrero");
		camiseta.setPrecio(20.32);
		camiseta.setDescripcion("Muy buena camiseta");
		
		registrarCamiseta(camiseta);*/
		
		listarCapitanes();
	}
	
	private static void listarCapitanes() {
		System.out.println("Entró al método ListarCapitanes()");
		
		List<JugadorDTO> listaCapitanes = new ArrayList<>();		
		JugadorServicio servicio = new JugadorServicio();
		
		listaCapitanes = servicio.listarCapitanes();
	}

	private static void registrarCamiseta(CamisetaDTO camiseta) {
		System.out.println("Entró al método registrarCamiseta()");

		boolean ok = false;
		CamisetaServicio servicio = new CamisetaServicio();
		
		ok = servicio.registrarCamiseta(camiseta);
		
		if (ok) {
			System.out.println("Se registró con exito!");
		}
		else {
			System.out.println("No se registró con exito!");
		}				
	}

	public static void ListarSelecciones(){
		List<PaisEquipoDTO> listaSelecciones = new ArrayList<>();		
		PaisEquipoServicio servicio = new PaisEquipoServicio();
		
		listaSelecciones = servicio.listarSelecciones();
	}

}

package edu.cibertec.interfas;

import java.util.List;

import edu.cibertec.dto.JugadorDTO;

public interface JugadorDAO {
	public List<JugadorDTO> listarCapitanes();
	public JugadorDTO obtenerJugadorByNombreAndNombrePais(String nombre, String nombrePais);
}

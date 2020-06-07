package edu.cibertec.interfas;

import java.util.List;

import edu.cibertec.dto.EstadioDTO;

public interface EstadioDAO {
	public List<EstadioDTO> listaEstadios();
	public EstadioDTO obtenerEstadioByNombreAndPais(String nombrePais, String nombreEstadio);
}

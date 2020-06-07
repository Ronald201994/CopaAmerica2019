package edu.cibertec.interfas;

import java.util.List;

import edu.cibertec.dto.PaisEquipoDTO;

public interface PaisEquipoDAO {
	public List<PaisEquipoDTO> listaSeleccionados();
	public PaisEquipoDTO obtenerSeleccionByNombre(String nombrePais);
}

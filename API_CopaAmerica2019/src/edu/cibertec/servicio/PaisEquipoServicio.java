package edu.cibertec.servicio;

import java.util.List;

import edu.cibertec.dao.DAOFactory;
import edu.cibertec.dto.PaisEquipoDTO;
import edu.cibertec.interfas.PaisEquipoDAO;

public class PaisEquipoServicio {
	DAOFactory miFabrica = DAOFactory.getDAOFactory(DAOFactory.SQL);

	public List<PaisEquipoDTO> listarSelecciones() {
		PaisEquipoDAO objPaisEquipoDAO = miFabrica.getPaisEquipoDAO();
		return objPaisEquipoDAO.listaSeleccionados();
	}
	
	public PaisEquipoDTO obtenerSeleccionByNombre(String nombrePais) {
		PaisEquipoDAO objPaisEquipoDAO = miFabrica.getPaisEquipoDAO();
		return objPaisEquipoDAO.obtenerSeleccionByNombre(nombrePais);
	}
	
}

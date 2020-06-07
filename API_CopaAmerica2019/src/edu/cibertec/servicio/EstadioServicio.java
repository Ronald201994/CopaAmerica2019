package edu.cibertec.servicio;

import java.util.List;

import edu.cibertec.dao.DAOFactory;
import edu.cibertec.dto.EstadioDTO;
import edu.cibertec.interfas.EstadioDAO;

public class EstadioServicio {
	DAOFactory miFabrica = DAOFactory.getDAOFactory(DAOFactory.SQL);

	public List<EstadioDTO> listarEstadios() {
		EstadioDAO EstadioDAO = miFabrica.getEstadioDAO();
		return EstadioDAO.listaEstadios();
	}
	
	public EstadioDTO obtenerEstadioByNombreAndPais(String nombrePais, String nombreEstadio) {
		EstadioDAO EstadioDAO = miFabrica.getEstadioDAO();
		return EstadioDAO.obtenerEstadioByNombreAndPais(nombrePais, nombreEstadio);
	}
}

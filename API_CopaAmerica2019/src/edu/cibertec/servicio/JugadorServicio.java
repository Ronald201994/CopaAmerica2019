package edu.cibertec.servicio;

import java.util.List;

import edu.cibertec.dao.DAOFactory;
import edu.cibertec.dto.JugadorDTO;
import edu.cibertec.interfas.JugadorDAO;

public class JugadorServicio {
	DAOFactory miFabrica = DAOFactory.getDAOFactory(DAOFactory.SQL);

	public List<JugadorDTO> listarCapitanes() {
		JugadorDAO objJugadorDAO = miFabrica.getJugadorDAO();
		return objJugadorDAO.listarCapitanes();
	}
	
	public JugadorDTO obtenerJugadorByNombreAndNombrePais(String nombre, String nombrePais) {
		JugadorDAO objJugadorDAO = miFabrica.getJugadorDAO();
		return objJugadorDAO.obtenerJugadorByNombreAndNombrePais(nombre, nombrePais);
	}
}

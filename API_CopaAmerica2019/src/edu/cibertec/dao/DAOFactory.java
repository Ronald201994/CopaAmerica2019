package edu.cibertec.dao;

import edu.cibertec.interfas.CamisetaDAO;
import edu.cibertec.interfas.EstadioDAO;
import edu.cibertec.interfas.JugadorDAO;
import edu.cibertec.interfas.PaisEquipoDAO;

public abstract class DAOFactory {
	public static final int SQL = 1;

	public abstract PaisEquipoDAO getPaisEquipoDAO();
	public abstract CamisetaDAO getCamisetaDAO();
	public abstract EstadioDAO getEstadioDAO();
	public abstract JugadorDAO getJugadorDAO();

	public static DAOFactory getDAOFactory(int qFactory) {
		switch (qFactory) {
		case SQL:
			return new SQLDaoFactory();
		default:
			return null;
		}
	}
}

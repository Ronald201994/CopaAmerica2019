package edu.cibertec.dao;

import edu.cibertec.interfas.CamisetaDAO;
import edu.cibertec.interfas.EstadioDAO;
import edu.cibertec.interfas.JugadorDAO;
import edu.cibertec.interfas.PaisEquipoDAO;

public class SQLDaoFactory extends DAOFactory{

	@Override
	public PaisEquipoDAO getPaisEquipoDAO() {
		// TODO Auto-generated method stub
		return new SQLPaisEquipoDAO();
	}

	@Override
	public CamisetaDAO getCamisetaDAO() {
		// TODO Auto-generated method stub
		return new SQLCamisetaDAO();
	}

	@Override
	public EstadioDAO getEstadioDAO() {
		// TODO Auto-generated method stub
		return new SQLEstadioDAO();
	}

	@Override
	public JugadorDAO getJugadorDAO() {
		// TODO Auto-generated method stub
		return new SQLJugadorDAO();
	}

}

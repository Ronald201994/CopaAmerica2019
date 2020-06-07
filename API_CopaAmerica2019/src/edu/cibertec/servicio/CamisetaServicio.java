package edu.cibertec.servicio;

import edu.cibertec.dao.DAOFactory;
import edu.cibertec.dto.CamisetaDTO;
import edu.cibertec.interfas.CamisetaDAO;

public class CamisetaServicio {
	DAOFactory miFabrica = DAOFactory.getDAOFactory(DAOFactory.SQL);

	public boolean registrarCamiseta(CamisetaDTO camiseta) {
		CamisetaDAO objCamisetaDAO = miFabrica.getCamisetaDAO();
		return objCamisetaDAO.registrarCamiseta(camiseta);
	}
}

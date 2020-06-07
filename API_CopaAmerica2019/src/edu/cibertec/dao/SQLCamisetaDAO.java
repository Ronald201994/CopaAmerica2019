package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import edu.cibertec.bd.util.SQLConexion;
import edu.cibertec.dto.CamisetaDTO;
import edu.cibertec.interfas.CamisetaDAO;

public class SQLCamisetaDAO implements CamisetaDAO {

	@Override
	public boolean registrarCamiseta(CamisetaDTO camiseta) {
		boolean response = false;
		int resultado = 0;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sentenciaSQL = " INSERT INTO Camiseta(Pais, Jugador, Numero, Cantidad, Precio, Descripcion) VALUES(?,?,?,?,?,?) ";
		
		try {
			cn = SQLConexion.getConexion();
			pstm = cn.prepareStatement(sentenciaSQL);
			
			pstm.setString(1, camiseta.getPais());
			pstm.setString(2, camiseta.getJugador());
			pstm.setInt(3, camiseta.getNumero());
			pstm.setInt(4, camiseta.getCantidad());
			pstm.setDouble(5, camiseta.getPrecio());
			pstm.setString(6, camiseta.getDescripcion());
			
			resultado = pstm.executeUpdate();
			if (resultado > 0) {
				response = true;
			}
			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		return response;
	}

}

package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.cibertec.bd.util.SQLConexion;
import edu.cibertec.dto.EstadioDTO;
import edu.cibertec.dto.PartidoFinalDTO;
import edu.cibertec.interfas.EstadioDAO;

public class SQLEstadioDAO implements EstadioDAO{

	@Override
	public List<EstadioDTO> listaEstadios() {
		List<EstadioDTO> listaEstadios = new ArrayList<>();
		List<PartidoFinalDTO> listaPartidosFinales = new ArrayList<>();
		EstadioDTO estadio = null;
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM Estadio ";
		
		try {			
			cn = SQLConexion.getConexion();
			st = cn.createStatement();
			rs = st.executeQuery(sentenciaSQL);
			while (rs.next()) {
				estadio = new EstadioDTO();
				estadio.setId(rs.getString("Id"));
				String idEstadio = estadio.getId();
				
				listaPartidosFinales = ObtenerPartidosFinales(idEstadio);
				
				estadio.setNombre(rs.getString("Nombre"));
				estadio.setApodo(rs.getString("Apodo"));
				estadio.setDescripcion(rs.getString("Descripcion"));
				estadio.setFoto(rs.getString("Foto"));
				
				estadio.setPartidosJugadosActual(rs.getInt("PartidosJugadosActual"));
				estadio.setTotalPartidosCopaAmerica(rs.getInt("TotalPartidosCopaAmerica"));
				estadio.setNumFinales(rs.getInt("NumFinales"));
				estadio.setFundacion(rs.getString("Fundacion"));
				estadio.setCapacidad(rs.getString("Capacidad"));
				estadio.setDimensiones(rs.getString("Dimensiones"));
				estadio.setUbicacion(rs.getString("Ubicacion"));
				estadio.setCoordenadas(rs.getString("Coordenadas"));
				estadio.setPropietario(rs.getString("Propietario"));
				estadio.setFinalesCopaAmerica(listaPartidosFinales);
				listaEstadios.add(estadio);
			}
			
		} catch (SQLException e) {
			System.out.println("Excepcion: " + e.getMessage());
		} finally {
			System.out.println("Win to us!");
		}
		
		return listaEstadios;
	}

	private List<PartidoFinalDTO> ObtenerPartidosFinales(String idEstadio) {
		List<PartidoFinalDTO> listaFinales = new ArrayList<>();
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM PartidoFinal WHERE IdEstadio = ? ";
		
		try {
			PartidoFinalDTO partidoFinal = null;
			cn = SQLConexion.getConexion();
			pst = cn.prepareStatement(sentenciaSQL);
			pst.setString(1, idEstadio);
			rs = pst.executeQuery();
			
			while (rs.next()) {											
				partidoFinal = new PartidoFinalDTO();
				
				partidoFinal.setGolesEquipo1(rs.getInt("GolesEquipoUno"));
				partidoFinal.setGolesEquipo2(rs.getInt("GolesEquipoDos"));
				partidoFinal.setEquipoGanador(rs.getString("Ganador"));
				partidoFinal.setEqupipoPerdedor(rs.getString("Perdedor"));
				partidoFinal.setNombreCopaAmerica(rs.getString("NombreCopaAmerica"));
				partidoFinal.setAsistencia(rs.getInt("Asistencia"));
				partidoFinal.setArbitro(rs.getString("Arbitro"));
				
				listaFinales.add(partidoFinal);
			}
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		return listaFinales;
	}

	@Override
	public EstadioDTO obtenerEstadioByNombreAndPais(String nombrePais, String nombreEstadio) {
		List<PartidoFinalDTO> listaPartidosFinales = new ArrayList<>();
		EstadioDTO estadio = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM Estadio E INNER JOIN PaisEquipo PE ON E.IdPaisEquipo = PE.Id WHERE PE.Nombre = ? AND E.Nombre = ? ";
		
		try {			
			cn = SQLConexion.getConexion();
			pstm = cn.prepareStatement(sentenciaSQL);
			pstm.setString(1, nombrePais);
			pstm.setString(2, nombreEstadio);		
			rs = pstm.executeQuery();

			while (rs.next()) {
				estadio = new EstadioDTO();
				estadio.setId(rs.getString("Id"));
				String idEstadio = estadio.getId();
				
				listaPartidosFinales = ObtenerPartidosFinales(idEstadio);
				
				estadio.setNombre(rs.getString("Nombre"));
				estadio.setApodo(rs.getString("Apodo"));
				estadio.setDescripcion(rs.getString("Descripcion"));
				estadio.setFoto(rs.getString("Foto"));
				
				estadio.setPartidosJugadosActual(rs.getInt("PartidosJugadosActual"));
				estadio.setTotalPartidosCopaAmerica(rs.getInt("TotalPartidosCopaAmerica"));
				estadio.setNumFinales(rs.getInt("NumFinales"));
				estadio.setFundacion(rs.getString("Fundacion"));
				estadio.setCapacidad(rs.getString("Capacidad"));
				estadio.setDimensiones(rs.getString("Dimensiones"));
				estadio.setUbicacion(rs.getString("Ubicacion"));
				estadio.setCoordenadas(rs.getString("Coordenadas"));
				estadio.setPropietario(rs.getString("Propietario"));
				estadio.setFinalesCopaAmerica(listaPartidosFinales);
			}
			
		} catch (SQLException e) {
			System.out.println("Excepcion: " + e.getMessage());
		} finally {
			System.out.println("Win to us!");
		}
		
		return estadio;
	}

}

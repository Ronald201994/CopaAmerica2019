package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.cibertec.bd.util.SQLConexion;
import edu.cibertec.dto.JugadorDTO;
import edu.cibertec.dto.PaisEquipoDTO;
import edu.cibertec.interfas.JugadorDAO;

public class SQLJugadorDAO implements JugadorDAO {

	@Override
	public List<JugadorDTO> listarCapitanes() {
		List<JugadorDTO> listaCapitanes = new ArrayList<>();
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM Jugador WHERE CapitanSeleccion = 'SI' ";
		PaisEquipoDTO objPaisEquipo = null;
		JugadorDTO objJugador = null;
		
		try {			
			cn = SQLConexion.getConexion();
			st = cn.createStatement();
			rs = st.executeQuery(sentenciaSQL);
			
			while (rs.next()) {
				objPaisEquipo = new PaisEquipoDTO();
				objJugador = new JugadorDTO();
				
				objJugador.setId(rs.getString("Id"));
				objJugador.setNombre(rs.getString("Nombre"));
				objJugador.setApePaterno(rs.getString("ApePaterno"));
				objJugador.setApeMaterno(rs.getString("ApeMaterno"));
				objJugador.setEdad(rs.getInt("Edad"));
				objJugador.setApodo(rs.getString("Apodo"));
				objJugador.setParticipacionesCopaAmerica(rs.getInt("Participaciones"));
				objJugador.setTitulos(rs.getInt("Titulos"));
				objJugador.setSubCampeonatos(rs.getInt("SubCampeonatos"));
				objJugador.setMedallasOro(rs.getInt("MedallasOro"));
				objJugador.setMedallasPlata(rs.getInt("MedallasPlata"));
				objJugador.setMedallasBronce(rs.getInt("MedallasBronce"));
				objJugador.setGolesEnCopaAmerica(rs.getInt("GolesEnCopaAmerica"));
				objJugador.setAsistencias(rs.getInt("Asistencias"));
				objJugador.setAutogoles(rs.getInt("Autogoles"));
				objJugador.setClubActual(rs.getString("ClubActual"));
				objJugador.setGolesCarrera(rs.getInt("GolesCarrera"));
				objJugador.setNumCamisetaSeleccion(rs.getInt("NumCamisetaSeleccion"));
				objJugador.setNumLesiones(rs.getInt("NumLesiones"));
				objJugador.setTotalTarjetasRojas(rs.getInt("TotalTarjetasRojas"));
				objJugador.setTotalTarjetasAmarrilla(rs.getInt("TotalTarjetasAmarrilla"));
				objJugador.setTarjetasRojasActual(rs.getInt("TarjetasRojasActual"));
				objJugador.setTarjetasAmarrillasActual(rs.getInt("TarjetasAmarrillasActual"));
				objJugador.setMejorJugador(rs.getInt("MejorJugador"));
				objJugador.setFechaNacimiento(rs.getString("FechaNacimiento"));
				objJugador.setFoto(rs.getString("Foto"));
				
				String idPaisEquipo = rs.getString("IdPaisEquipo");
				
				objPaisEquipo = ObtenerPaisEquipo(idPaisEquipo);
				
				objJugador.setPaisEquipo(objPaisEquipo);
				
				listaCapitanes.add(objJugador);
			
			}
			
		} catch (SQLException e) {
			System.out.println("Excepcion: " + e.getMessage());
		} finally {
			System.out.println("Win to us!");
		}
		return listaCapitanes;
	}

	private PaisEquipoDTO ObtenerPaisEquipo(String idPaisEquipo) {
		PaisEquipoDTO objPaisEquipo = null;
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM PaisEquipo WHERE Id = ? ";
		
		try {
			cn = SQLConexion.getConexion();
			pst = cn.prepareStatement(sentenciaSQL);
			pst.setString(1, idPaisEquipo);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				objPaisEquipo = new PaisEquipoDTO();
				
				objPaisEquipo.setId(rs.getString("Id"));				
				objPaisEquipo.setNombre(rs.getString("Nombre"));
				objPaisEquipo.setApodo(rs.getString("Apodo"));
				objPaisEquipo.setFoto(rs.getString("Foto"));
				objPaisEquipo.setParticipaciones(rs.getInt("Participaciones"));
				objPaisEquipo.setTitulos(rs.getInt("Titulos"));
				objPaisEquipo.setSubcampeonatos(rs.getInt("Subcampeonatos"));
				objPaisEquipo.setMedallasOro(rs.getInt("MedallasOro"));							
				objPaisEquipo.setMedallasPlata(rs.getInt("MedallasPlata"));
				objPaisEquipo.setMedallasBronce(rs.getInt("MedallasBronce"));
				objPaisEquipo.setTitulosMundiales(rs.getInt("TitulosMundiales"));						
			}
			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		return objPaisEquipo;
	}

	@Override
	public JugadorDTO obtenerJugadorByNombreAndNombrePais(String nombre, String nombrePais) {
		JugadorDTO objJugador = null;
		PaisEquipoDTO objPaisEquipo = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM Jugador J INNER JOIN PaisEquipo PE ON J.IdPaisEquipo = PE.Id WHERE J.Nombre +' '+J.ApePaterno = ? AND PE.Nombre = ? ";
		
		try {			
			cn = SQLConexion.getConexion();
			pstm = cn.prepareStatement(sentenciaSQL);
			pstm.setString(1, nombre);
			pstm.setString(2, nombrePais);		
			rs = pstm.executeQuery();

			while (rs.next()) {
				objPaisEquipo = new PaisEquipoDTO();
				objJugador = new JugadorDTO();
				objJugador.setId(rs.getString("Id"));
				objJugador.setNombre(rs.getString("Nombre"));
				objJugador.setApePaterno(rs.getString("ApePaterno"));
				objJugador.setApeMaterno(rs.getString("ApeMaterno"));
				objJugador.setEdad(rs.getInt("Edad"));
				objJugador.setApodo(rs.getString("Apodo"));
				objJugador.setParticipacionesCopaAmerica(rs.getInt("Participaciones"));
				objJugador.setTitulos(rs.getInt("Titulos"));
				objJugador.setSubCampeonatos(rs.getInt("SubCampeonatos"));
				objJugador.setMedallasOro(rs.getInt("MedallasOro"));
				objJugador.setMedallasPlata(rs.getInt("MedallasPlata"));
				objJugador.setMedallasBronce(rs.getInt("MedallasBronce"));
				objJugador.setGolesEnCopaAmerica(rs.getInt("GolesEnCopaAmerica"));
				objJugador.setAsistencias(rs.getInt("Asistencias"));
				objJugador.setAutogoles(rs.getInt("Autogoles"));
				objJugador.setClubActual(rs.getString("ClubActual"));
				objJugador.setGolesCarrera(rs.getInt("GolesCarrera"));
				objJugador.setNumCamisetaSeleccion(rs.getInt("NumCamisetaSeleccion"));
				objJugador.setNumLesiones(rs.getInt("NumLesiones"));
				objJugador.setTotalTarjetasRojas(rs.getInt("TotalTarjetasRojas"));
				objJugador.setTotalTarjetasAmarrilla(rs.getInt("TotalTarjetasAmarrilla"));
				objJugador.setTarjetasRojasActual(rs.getInt("TarjetasRojasActual"));
				objJugador.setTarjetasAmarrillasActual(rs.getInt("TarjetasAmarrillasActual"));
				objJugador.setMejorJugador(rs.getInt("MejorJugador"));
				objJugador.setFechaNacimiento(rs.getString("FechaNacimiento"));
				objJugador.setFoto(rs.getString("Foto"));
				
				String idPaisEquipo = rs.getString("IdPaisEquipo");
				
				objPaisEquipo = ObtenerPaisEquipo(idPaisEquipo);
				
				objJugador.setPaisEquipo(objPaisEquipo);
			}
			
		} catch (SQLException e) {
			System.out.println("Excepcion: " + e.getMessage());
		} finally {
			System.out.println("Win to us!");
		}
		
		return objJugador;
	}

}

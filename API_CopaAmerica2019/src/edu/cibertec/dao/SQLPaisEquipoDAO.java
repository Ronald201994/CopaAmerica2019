package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.cibertec.bd.util.SQLConexion;
import edu.cibertec.dto.EntrenadorDTO;
import edu.cibertec.dto.EquiposEntrenadorDTO;
import edu.cibertec.dto.EstadioDTO;
import edu.cibertec.dto.JugadorDTO;
import edu.cibertec.dto.PaisEquipoDTO;
import edu.cibertec.interfas.PaisEquipoDAO;

public class SQLPaisEquipoDAO implements PaisEquipoDAO{

	@Override
	public List<PaisEquipoDTO> listaSeleccionados() {
		List<PaisEquipoDTO> listaSeleccionados = new ArrayList<>();
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM PaisEquipo ";
		PaisEquipoDTO objPaisEquipo = null;
		EntrenadorDTO objEntrenador = null;
		List<JugadorDTO> listaCombocados = null;
		List<EstadioDTO> listaEstadios = null;
		
		try {			
			cn = SQLConexion.getConexion();
			st = cn.createStatement();
			rs = st.executeQuery(sentenciaSQL);
			while (rs.next()) {
				objPaisEquipo = new PaisEquipoDTO();
				objEntrenador = new EntrenadorDTO();
				listaCombocados = new ArrayList<>();
				listaEstadios = new ArrayList<>();
				
				objPaisEquipo.setId(rs.getString("Id"));
				String Id = objPaisEquipo.getId();	
				objEntrenador = ObtenerEntrenadorBySeleccion(Id);
				listaCombocados = ObtenerListaCombocados(Id);
				listaEstadios = ObtenerListaEstadios(Id);
				
				objPaisEquipo.setNombre(rs.getString("Nombre"));
				objPaisEquipo.setApodo(rs.getString("Apodo"));
				objPaisEquipo.setFoto(rs.getString("Foto"));
				objPaisEquipo.setDescripcion(rs.getString("Descripcion"));
				objPaisEquipo.setParticipaciones(rs.getInt("Participaciones"));
				objPaisEquipo.setTitulos(rs.getInt("Titulos"));
				objPaisEquipo.setSubcampeonatos(rs.getInt("Subcampeonatos"));
				objPaisEquipo.setMedallasOro(rs.getInt("MedallasOro"));							
				objPaisEquipo.setMedallasPlata(rs.getInt("MedallasPlata"));
				objPaisEquipo.setMedallasBronce(rs.getInt("MedallasBronce"));
				objPaisEquipo.setTitulosMundiales(rs.getInt("TitulosMundiales"));				
				objPaisEquipo.setEntrenador(objEntrenador);
				objPaisEquipo.setListaCombocados(listaCombocados);
				objPaisEquipo.setListaEstadios(listaEstadios);
				
				listaSeleccionados.add(objPaisEquipo);
			}
			
		} catch (SQLException e) {
			System.out.println("Excepcion: " + e.getMessage());
		} finally {
			System.out.println("Win to us!");
		}
		return listaSeleccionados;
	}

	private List<EstadioDTO> ObtenerListaEstadios(String idPaisEquipo) {
		List<EstadioDTO> listaEstadios = new ArrayList<>();
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM Estadio WHERE IdPaisEquipo = ? ";
		
		try {
			EstadioDTO estadio = null;
			cn = SQLConexion.getConexion();
			pst = cn.prepareStatement(sentenciaSQL);
			pst.setString(1, idPaisEquipo);
			rs = pst.executeQuery();
			
			while (rs.next()) {							
				String nombre = rs.getString("Nombre");
				String apodo = rs.getString("Apodo");
				String capacidad = rs.getString("Capacidad");
				
				estadio = new EstadioDTO(nombre, apodo, capacidad);
				
				listaEstadios.add(estadio);
			}
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		return listaEstadios;
	}

	private List<JugadorDTO> ObtenerListaCombocados(String idPaisEquipo) {
		List<JugadorDTO> listaCombocados = new ArrayList<>();
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT Nombre, ApePaterno, Edad FROM Jugador WHERE IdPaisEquipo = ? ";
		
		try {
			JugadorDTO jugador = null;
			cn = SQLConexion.getConexion();
			pst = cn.prepareStatement(sentenciaSQL);
			pst.setString(1, idPaisEquipo);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				jugador = new JugadorDTO();
				
				jugador.setNombre(rs.getString("Nombre") + " "+rs.getString("ApePaterno"));
				jugador.setEdad(rs.getInt("Edad"));
				
				listaCombocados.add(jugador);
			}
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		return listaCombocados;
	}

	private EntrenadorDTO ObtenerEntrenadorBySeleccion(String idPaisEquipo) {
		EntrenadorDTO entrenador = null;
		List<EquiposEntrenadorDTO> listaEquipos = null;
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM Entrenador WHERE IdPaisEquipo = ? ";
		
		try {
			cn = SQLConexion.getConexion();
			pst = cn.prepareStatement(sentenciaSQL);
			pst.setString(1, idPaisEquipo);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				entrenador = new EntrenadorDTO();
				listaEquipos = new ArrayList<>();
								
				entrenador.setId(rs.getString("Id"));
				String IdEntrenador = entrenador.getId();
				listaEquipos = ObtenerEquiposByEntrenador(IdEntrenador);
				
				entrenador.setNombre(rs.getString("Nombre"));
				entrenador.setApodo(rs.getString("Apodo"));
				entrenador.setNacionalidad(rs.getString("Nacionalidad"));
				entrenador.setTitulos(rs.getInt("Titulos"));
				entrenador.setEdad(rs.getInt("Edad"));
				entrenador.setEquipos(listaEquipos);
			}
			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		return entrenador;
	}

	private List<EquiposEntrenadorDTO> ObtenerEquiposByEntrenador(String idEntrenador) {
		List<EquiposEntrenadorDTO> listaEquipos = null;
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM EquiposEntrenador WHERE IdEntrenador = ? ";
		
		try {
			EquiposEntrenadorDTO equipo = null;
			listaEquipos = new ArrayList<>();
			cn = SQLConexion.getConexion();
			pst = cn.prepareStatement(sentenciaSQL);
			pst.setString(1, idEntrenador);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				equipo = new EquiposEntrenadorDTO();
				
				equipo.setNombre(rs.getString("Nombre"));
				equipo.setPais(rs.getString("Pais"));
				equipo.setTitulos(rs.getInt("Titulos"));
				
				listaEquipos.add(equipo);
			}
			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		return listaEquipos;
	}

	@Override
	public PaisEquipoDTO obtenerSeleccionByNombre(String nombrePais) {
		PaisEquipoDTO objPaisEquipo = null;
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sentenciaSQL = " SELECT * FROM PaisEquipo WHERE Nombre = ? ";
		EntrenadorDTO objEntrenador = null;
		List<JugadorDTO> listaCombocados = null;
		List<EstadioDTO> listaEstadios = null;
		
		try {
			cn = SQLConexion.getConexion();
			pst = cn.prepareStatement(sentenciaSQL);
			pst.setString(1, nombrePais);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				objPaisEquipo = new PaisEquipoDTO();
				objEntrenador = new EntrenadorDTO();
				listaCombocados = new ArrayList<>();
				listaEstadios = new ArrayList<>();
				
				objPaisEquipo.setId(rs.getString("Id"));
				String Id = objPaisEquipo.getId();	
				objEntrenador = ObtenerEntrenadorBySeleccion(Id);
				listaCombocados = ObtenerListaCombocados(Id);
				listaEstadios = ObtenerListaEstadios(Id);
				
				objPaisEquipo.setNombre(rs.getString("Nombre"));
				objPaisEquipo.setApodo(rs.getString("Apodo"));
				objPaisEquipo.setFoto(rs.getString("Foto"));
				objPaisEquipo.setDescripcion(rs.getString("Descripcion"));
				objPaisEquipo.setParticipaciones(rs.getInt("Participaciones"));
				objPaisEquipo.setTitulos(rs.getInt("Titulos"));
				objPaisEquipo.setSubcampeonatos(rs.getInt("Subcampeonatos"));
				objPaisEquipo.setMedallasOro(rs.getInt("MedallasOro"));							
				objPaisEquipo.setMedallasPlata(rs.getInt("MedallasPlata"));
				objPaisEquipo.setMedallasBronce(rs.getInt("MedallasBronce"));
				objPaisEquipo.setTitulosMundiales(rs.getInt("TitulosMundiales"));				
				objPaisEquipo.setEntrenador(objEntrenador);
				objPaisEquipo.setListaCombocados(listaCombocados);
				objPaisEquipo.setListaEstadios(listaEstadios);
				
			}
			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		return objPaisEquipo;
	}

}

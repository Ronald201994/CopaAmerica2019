package edu.cibertec.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class EstadioDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public EstadioDTO(){
		
	}
	private String Id;
	private String nombre;
	private String apodo;
	private String descripcion;
	private String foto;
	private int PartidosJugadosActual;
	private int TotalPartidosCopaAmerica;
	private int NumFinales;
	private String fundacion;
	private String capacidad;
	private String dimensiones;
	private String ubicacion;
	private String coordenadas;
	private String propietario;
	private List<PartidoFinalDTO> finalesCopaAmerica;
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getPartidosJugadosActual() {
		return PartidosJugadosActual;
	}

	public void setPartidosJugadosActual(int partidosJugadosActual) {
		PartidosJugadosActual = partidosJugadosActual;
	}

	public int getTotalPartidosCopaAmerica() {
		return TotalPartidosCopaAmerica;
	}

	public void setTotalPartidosCopaAmerica(int totalPartidosCopaAmerica) {
		TotalPartidosCopaAmerica = totalPartidosCopaAmerica;
	}

	public int getNumFinales() {
		return NumFinales;
	}

	public void setNumFinales(int numFinales) {
		NumFinales = numFinales;
	}

	public String getFundacion() {
		return fundacion;
	}

	public void setFundacion(String fundacion) {
		this.fundacion = fundacion;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public List<PartidoFinalDTO> getFinalesCopaAmerica() {
		return finalesCopaAmerica;
	}

	public void setFinalesCopaAmerica(List<PartidoFinalDTO> finalesCopaAmerica) {
		this.finalesCopaAmerica = finalesCopaAmerica;
	}

	public EstadioDTO(String nombre, String apodo, String capacidad) {
		super();
		this.nombre = nombre;
		this.apodo = apodo;
		this.capacidad = capacidad;
	}
	
	

}

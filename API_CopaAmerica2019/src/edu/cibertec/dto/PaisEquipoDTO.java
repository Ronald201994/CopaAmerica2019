package edu.cibertec.dto;

import java.io.Serializable;
import java.util.List;

public class PaisEquipoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	public PaisEquipoDTO(){
		
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApodo() {
		return Apodo;
	}
	public void setApodo(String apodo) {
		Apodo = apodo;
	}
	public String getFoto() {
		return Foto;
	}
	public void setFoto(String foto) {
		Foto = foto;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getParticipaciones() {
		return Participaciones;
	}
	public void setParticipaciones(int participaciones) {
		Participaciones = participaciones;
	}
	public int getTitulos() {
		return Titulos;
	}
	public void setTitulos(int titulos) {
		Titulos = titulos;
	}
	public int getSubcampeonatos() {
		return Subcampeonatos;
	}
	public void setSubcampeonatos(int subcampeonatos) {
		Subcampeonatos = subcampeonatos;
	}
	public int getMedallasBronce() {
		return MedallasBronce;
	}
	public void setMedallasBronce(int medallasBronce) {
		MedallasBronce = medallasBronce;
	}
	public int getMedallasOro() {
		return MedallasOro;
	}
	public void setMedallasOro(int medallasOro) {
		MedallasOro = medallasOro;
	}
	public int getMedallasPlata() {
		return MedallasPlata;
	}
	public void setMedallasPlata(int medallasPlata) {
		MedallasPlata = medallasPlata;
	}
	public int getTitulosMundiales() {
		return TitulosMundiales;
	}
	public void setTitulosMundiales(int titulosMundiales) {
		TitulosMundiales = titulosMundiales;
	}
	public EntrenadorDTO getEntrenador() {
		return Entrenador;
	}
	public void setEntrenador(EntrenadorDTO entrenador) {
		Entrenador = entrenador;
	}
	public List<JugadorDTO> getListaCombocados() {
		return listaCombocados;
	}
	public void setListaCombocados(List<JugadorDTO> listaCombocados) {
		this.listaCombocados = listaCombocados;
	}
	public List<EstadioDTO> getListaEstadios() {
		return listaEstadios;
	}
	public void setListaEstadios(List<EstadioDTO> listaEstadios) {
		this.listaEstadios = listaEstadios;
	}

	private String Id;
	private String Nombre;
	private String Apodo;
	private String Foto;
	private String Descripcion;
	private int Participaciones;
	private int Titulos;
	private int Subcampeonatos;
	private int MedallasBronce;
	private int MedallasOro;
	private int MedallasPlata;
	private int TitulosMundiales;
	private EntrenadorDTO Entrenador;
	private List<JugadorDTO> listaCombocados;
	private List<EstadioDTO> listaEstadios;
	
}

package edu.cibertec.dto;

import java.io.Serializable;

public class EquiposEntrenadorDTO implements Serializable{
	private static final long serialVersionUID = 1L;
		
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
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public int getTitulos() {
		return Titulos;
	}
	public void setTitulos(int titulos) {
		Titulos = titulos;
	}
	
	private String Id;
	private String Nombre;
	private String Pais;
	private int Titulos;
	
	
	

}

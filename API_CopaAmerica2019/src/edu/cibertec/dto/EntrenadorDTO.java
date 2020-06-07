package edu.cibertec.dto;

import java.io.Serializable;
import java.util.List;

public class EntrenadorDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String Id;
	private String Nombre;
	private String Apodo;
	private String Nacionalidad;
	private int Titulos;
	private int Edad;	
	private List<EquiposEntrenadorDTO> Equipos;
	
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

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public int getTitulos() {
		return Titulos;
	}

	public void setTitulos(int titulos) {
		Titulos = titulos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public List<EquiposEntrenadorDTO> getEquipos() {
		return Equipos;
	}

	public void setEquipos(List<EquiposEntrenadorDTO> equipos) {
		Equipos = equipos;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public EntrenadorDTO() {
		
	}
	
}

package edu.cibertec.dto;

import java.io.Serializable;

public class CamisetaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String Pais;
	private String Jugador;
	private int Numero;
	private int Cantidad;
	private double Precio;
	private String Descripcion;
	
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public String getJugador() {
		return Jugador;
	}
	public void setJugador(String jugador) {
		Jugador = jugador;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
}

package edu.cibertec.dto;

import java.io.Serializable;

public class PartidoFinalDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int golesEquipo1;
	private int golesEquipo2;
	private String equipoGanador;
	private String equpipoPerdedor;
	private String NombreCopaAmerica;
	private int Asistencia;
	private String arbitro;
	
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	public String getEquipoGanador() {
		return equipoGanador;
	}
	public void setEquipoGanador(String equipoGanador) {
		this.equipoGanador = equipoGanador;
	}
	public String getEqupipoPerdedor() {
		return equpipoPerdedor;
	}
	public void setEqupipoPerdedor(String equpipoPerdedor) {
		this.equpipoPerdedor = equpipoPerdedor;
	}
	public String getNombreCopaAmerica() {
		return NombreCopaAmerica;
	}
	public void setNombreCopaAmerica(String nombreCopaAmerica) {
		NombreCopaAmerica = nombreCopaAmerica;
	}
	public int getAsistencia() {
		return Asistencia;
	}
	public void setAsistencia(int asistencia) {
		Asistencia = asistencia;
	}
	public String getArbitro() {
		return arbitro;
	}
	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}

}

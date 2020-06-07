package edu.cibertec.dto;

import java.io.Serializable;

public class JugadorDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String Id;
	private String Nombre;
	private String ApePaterno;
	private String ApeMaterno;
	private int Edad;
	private String Apodo;
	private int ParticipacionesCopaAmerica;
	private int Titulos;
	private int SubCampeonatos;
	private int MedallasOro;
	private int MedallasPlata;
	private int MedallasBronce;
	private int GolesEnCopaAmerica;
	private int Asistencias;
	private int Autogoles;
	private String ClubActual;
	private int GolesCarrera;
	private int NumCamisetaSeleccion;
	private int NumLesiones;
	private int TotalTarjetasRojas;
	private int TotalTarjetasAmarrilla;
	private int TarjetasRojasActual;
	private int TarjetasAmarrillasActual;
	private int MejorJugador;
	private String FechaNacimiento;
	private String Foto;
	private PaisEquipoDTO PaisEquipo;
	
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
	public String getApePaterno() {
		return ApePaterno;
	}
	public void setApePaterno(String apePaterno) {
		ApePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return ApeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		ApeMaterno = apeMaterno;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getApodo() {
		return Apodo;
	}
	public void setApodo(String apodo) {
		Apodo = apodo;
	}
	public int getParticipacionesCopaAmerica() {
		return ParticipacionesCopaAmerica;
	}
	public void setParticipacionesCopaAmerica(int participacionesCopaAmerica) {
		ParticipacionesCopaAmerica = participacionesCopaAmerica;
	}
	public int getTitulos() {
		return Titulos;
	}
	public void setTitulos(int titulos) {
		Titulos = titulos;
	}
	public int getSubCampeonatos() {
		return SubCampeonatos;
	}
	public void setSubCampeonatos(int subCampeonatos) {
		SubCampeonatos = subCampeonatos;
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
	public int getMedallasBronce() {
		return MedallasBronce;
	}
	public void setMedallasBronce(int medallasBronce) {
		MedallasBronce = medallasBronce;
	}
	public int getGolesEnCopaAmerica() {
		return GolesEnCopaAmerica;
	}
	public void setGolesEnCopaAmerica(int golesEnCopaAmerica) {
		GolesEnCopaAmerica = golesEnCopaAmerica;
	}
	public int getAsistencias() {
		return Asistencias;
	}
	public void setAsistencias(int asistencias) {
		Asistencias = asistencias;
	}
	public int getAutogoles() {
		return Autogoles;
	}
	public void setAutogoles(int autogoles) {
		Autogoles = autogoles;
	}
	public String getClubActual() {
		return ClubActual;
	}
	public void setClubActual(String clubActual) {
		ClubActual = clubActual;
	}
	public int getGolesCarrera() {
		return GolesCarrera;
	}
	public void setGolesCarrera(int golesCarrera) {
		GolesCarrera = golesCarrera;
	}
	public int getNumCamisetaSeleccion() {
		return NumCamisetaSeleccion;
	}
	public void setNumCamisetaSeleccion(int numCamisetaSeleccion) {
		NumCamisetaSeleccion = numCamisetaSeleccion;
	}
	public int getNumLesiones() {
		return NumLesiones;
	}
	public void setNumLesiones(int numLesiones) {
		NumLesiones = numLesiones;
	}
	public int getTotalTarjetasRojas() {
		return TotalTarjetasRojas;
	}
	public void setTotalTarjetasRojas(int totalTarjetasRojas) {
		TotalTarjetasRojas = totalTarjetasRojas;
	}
	public int getTotalTarjetasAmarrilla() {
		return TotalTarjetasAmarrilla;
	}
	public void setTotalTarjetasAmarrilla(int totalTarjetasAmarrilla) {
		TotalTarjetasAmarrilla = totalTarjetasAmarrilla;
	}
	public int getTarjetasRojasActual() {
		return TarjetasRojasActual;
	}
	public void setTarjetasRojasActual(int tarjetasRojasActual) {
		TarjetasRojasActual = tarjetasRojasActual;
	}
	public int getTarjetasAmarrillasActual() {
		return TarjetasAmarrillasActual;
	}
	public void setTarjetasAmarrillasActual(int tarjetasAmarrillasActual) {
		TarjetasAmarrillasActual = tarjetasAmarrillasActual;
	}
	public int getMejorJugador() {
		return MejorJugador;
	}
	public void setMejorJugador(int mejorJugador) {
		MejorJugador = mejorJugador;
	}
	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getFoto() {
		return Foto;
	}
	public void setFoto(String foto) {
		Foto = foto;
	}
	public PaisEquipoDTO getPaisEquipo() {
		return PaisEquipo;
	}
	public void setPaisEquipo(PaisEquipoDTO paisEquipo) {
		PaisEquipo = paisEquipo;
	}
	
	
	
}

package edu.cibertec.bd.util;

import java.sql.Connection;

public class prueba {

	
	
	
public static void main(String[] x){
	
	Connection c = SQLConexion.getConexion();
		System.out.println(c);
		//Connection cn =SQLConexion.getConexion();
	}
}

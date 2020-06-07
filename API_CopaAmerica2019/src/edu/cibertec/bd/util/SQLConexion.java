package edu.cibertec.bd.util;

import java.sql.*;

public class SQLConexion {

	private SQLConexion() {

	}

	/*private static final String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	//Connection with user and password
	//private static final String URL_CONNECTION = "jdbc:sqlserver://localhost;database=BD_CopaAmerica2019";
	
	//Connection without user and password
	private static final String URL_CONNECTION = "jdbc:sqlserver://localhost;database=BD_CopaAmerica2019;integratedSecurity=true";
	private static final String USER = "";
	private static final String PASSWORD = "";

	public static Connection getConexion() {
		Connection connection = null;
		try {
			Class.forName(DRIVER_CLASS);
			if (connection == null) {
				connection = DriverManager.getConnection(URL_CONNECTION, USER, PASSWORD);
				//connection = DriverManager.getConnection(URL_CONNECTION);
				System.out.println("Correcta conexión con la base de datos.");
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("No se ha encontrado el driver.");
		} catch (SQLException ex) {
			System.out.println("Error con la base de datos.");
		}
		return connection;
	}*/
	
	public static Connection getConexion(){ 
		Connection con = null;  
		try { 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=BD_CopaAmerica2019"; 
			/*DESKTOP-VAG0NSF*/
			//"jdbc:sqlserver://;database=DB_Name;integratedSecurity=true;"
			con = DriverManager.getConnection(url,"sa","123"); 
			} 
		catch (ClassNotFoundException e) { 
			System.out.println(e.getMessage()); 
			} 
		catch (SQLException e) { System.out.println(e); 
		} 
		return con;  }
}
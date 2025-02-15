package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ej1 {
	
	private static final String URL = "jdbc:mysql://localhost:3306/mibasededatos?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "110805";

	public static void main(String[] args) {
		try {
			// Creacion de tabla
			Connection c = DriverManager.getConnection(URL, USER, PASS);
			Statement s = c.createStatement();
				s.execute("CREATE TABLE CLIENTES (DNI CHAR(9) NOT NULL, APELLIDOS VARCHAR (32) NOT NULL,"
						+ "CP CHAR(5), PRIMARY KEY (DNI);");
			
			System.out.println("Tabla clientes creada correctamente");
			
			// Inserción de datos 
			Statement s1 = c.createStatement();
				int nFil = s1.executeUpdate("INSERT INTO CLIENTES (DNI, APELLIDOS, CP) VALUES "
						+ "('78901234X', 'NADALES', '44126'), "
						+ "('89012345E', 'HOJAS', null), "
						+ "('56789012B', 'SAMPER', '29730'), "
						+ "('09876543K', 'LAMIQUIZ', null);");
			
			System.out.println(nFil + " Filas insertadas en la tabla clientes");
			
			// Ejercicio 1
			Statement s2 = c.createStatement();
			s2.executeUpdate(")
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ha ocurrido un error en la base de datos");
		}

	}
	

}

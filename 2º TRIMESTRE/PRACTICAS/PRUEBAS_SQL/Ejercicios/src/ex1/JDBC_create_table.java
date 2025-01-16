package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_create_table {

	// Constantes de conexión
	private static final String URL = "jdbc:mysql://localhost:3306/mibasededatos?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "110805";

	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection(URL, USER, PASS);
			Statement s = c.createStatement();
			s.execute("CREATE TABLE CLIENTES (DNI CHAR(9) NOT NULL, APELLIDOS VARCHAR(32) NOT NULL, CP CHAR(5), PRIMARY KEY(DNI))");
			System.out.println("Tabla clientes creada correctamente");
			c.close();
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

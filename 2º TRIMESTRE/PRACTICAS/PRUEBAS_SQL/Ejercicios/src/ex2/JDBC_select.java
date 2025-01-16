package ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Ejercicio 3.2
 * Si se pone getString(..) cuando el no hay CP en la base de datos aparece null en la consola. En cambio, si se pone getInt() si no hay CP aparece un 0
 */
public class JDBC_select {

	// Constantes de conexión
	private static final String URL = "jdbc:mysql://localhost:3306/mibasededatos?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "110805";

	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection(URL, USER, PASS);
			Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = s.executeQuery("SELECT * FROM CLIENTES");
			{
				if (rs.last()) {
					int i = rs.getRow();

					do {
						System.out.println("[" + (i--) + "]");
						System.out.println("DNI: " + rs.getString("DNI"));
						System.out.println("Apellidos: " + rs.getString("APELLIDOS"));
						System.out.println("CP: " + rs.getInt("CP"));
					} while (rs.previous());
				}

			}
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

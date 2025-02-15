package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBC_insert {

	// Constantes de conexión
	private static final String URL = "jdbc:mysql://localhost:3306/mibasededatos?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "110805";

	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection(URL, USER, PASS);
			/*
			Statement s = c.createStatement();{
				int nFil = s.executeUpdate(
						"INSERT INTO CLIENTES (DNI,APELLIDOS,CP) VALUES"
						+ "('78901234X', 'NADALES', '44126'),"
						+ "('89012345E', 'HOJAS', null),"
						+ "('56789012B', 'SAMPER', '29730'),"
						+ "('09876543K', 'LAMIQUIZ', null);");
				System.out.println(nFil + " Filas insertadas");
			}
			
			update(c);
			*/
			
			delete(c);
			c.close();
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void update(Connection conexion) throws SQLException{
		Statement stmt = conexion.createStatement();
		
		// String para hacer el update
		String updateSQL = "UPDATE CLIENTES SET APELLIDOS = 'ROJAS' WHERE DNI = '89012345E';";
		
		stmt.executeUpdate(updateSQL);
		System.out.println("Campos actualizados");
		
		stmt.close();
	}
	
	public static void delete(Connection conexion) throws SQLException{
		Statement stmt = conexion.createStatement();
		
		// String para hacer el delete
		String deleteSQL = "DELETE FROM CLIENTES WHERE DNI = '09876543K';";
		
		stmt.executeUpdate(deleteSQL);
		System.out.println("Campo borrado correctamente");
		
		stmt.close();
	}

}

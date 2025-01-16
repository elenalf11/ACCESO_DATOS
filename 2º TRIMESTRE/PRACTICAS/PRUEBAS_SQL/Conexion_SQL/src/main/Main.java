package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	// Constantes de conexión
	private static final String URL = "jdbc:mysql://localhost:3306/mibasededatos?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "110805";

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Connection conexion = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conexión establecida con éxito");

			// Primero creamos e insertamos datos
			crearTablaEInsertarDatos(conexion);

			// Luego consultamos los datos
			consultarDepartamentos(conexion);

			// Eliminamos los datos de la tabla
			eliminarTodosDepartamentos(conexion);

			// Cerrar conexión
			conexion.close();
			System.out.println("Conexión cerrada");

		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static void crearTablaEInsertarDatos(Connection conexion) throws SQLException {
		Statement stmt = conexion.createStatement();

		// SQL para crear la tabla departamento
		String createTableSQL = "CREATE TABLE IF NOT EXISTS departamento ("
				+ "id_departamento INT AUTO_INCREMENT PRIMARY KEY," + "nombre VARCHAR(50) NOT NULL,"
				+ "ubicacion VARCHAR(100)," + "presupuesto DECIMAL(10,2)," + "jefe_departamento VARCHAR(50),"
				+ "fecha_creacion DATE" + ")";

		stmt.executeUpdate(createTableSQL);
		System.out.println("Tabla departamento creada correctamente");

		// Insertar departamentos de ejemplo
		String[] insertDepartamentos = {
				"INSERT INTO departamento (nombre, ubicacion, presupuesto, jefe_departamento, fecha_creacion) "
						+ "VALUES ('Recursos Humanos', 'Planta 1', 50000.00, 'María García', '2024-01-14')",

				"INSERT INTO departamento (nombre, ubicacion, presupuesto, jefe_departamento, fecha_creacion) "
						+ "VALUES ('Desarrollo', 'Planta 2', 75000.00, 'Juan Pérez', '2024-01-14')",

				"INSERT INTO departamento (nombre, ubicacion, presupuesto, jefe_departamento, fecha_creacion) "
						+ "VALUES ('Marketing', 'Planta 1', 45000.00, 'Ana López', '2024-01-14')" };

		for (String insert : insertDepartamentos) {
			try {
				stmt.executeUpdate(insert);
				System.out.println("Departamento insertado correctamente");
			} catch (SQLException e) {
				System.out.println("Error al insertar departamento: " + e.getMessage());
			}
		}

		stmt.close();
	}

	private static void consultarDepartamentos(Connection conexion) throws SQLException {
		Statement stmt = conexion.createStatement();
		String query = "SELECT * FROM departamento";
		ResultSet rs = stmt.executeQuery(query);

		System.out.println("\n=== LISTADO DE DEPARTAMENTOS ===");
		System.out.println("ID | Nombre | Ubicación | Presupuesto | Jefe | Fecha Creación");
		System.out.println("------------------------------------------------------------");

		while (rs.next()) {
			System.out.printf("%d | %s | %s | %.2f | %s | %s%n", rs.getInt("id_departamento"), rs.getString("nombre"),
					rs.getString("ubicacion"), rs.getDouble("presupuesto"), rs.getString("jefe_departamento"),
					rs.getDate("fecha_creacion"));
		}

		System.out.println("------------------------------------------------------------");

		rs.close();
		stmt.close();
	}

	// Método para eliminar todos los departamentos
	private static void eliminarTodosDepartamentos(Connection conexion) throws SQLException {
		Statement stmt = conexion.createStatement();

		try {
			String query = "DELETE FROM departamento";
			int filasAfectadas = stmt.executeUpdate(query);

			System.out.println("Se han eliminado " + filasAfectadas + " departamentos");

		} catch (SQLException e) {
			System.out.println("Error al eliminar todos los departamentos: " + e.getMessage());
			throw e;
		} finally {
			stmt.close();
		}
	}

}

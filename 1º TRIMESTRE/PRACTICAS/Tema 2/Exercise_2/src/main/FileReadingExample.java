package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadingExample {
	public static void main(String[] args) {
		// Se inicializa a null la clase BufferedReader (lector de archivos)
		BufferedReader reader = null;
		// Se inicia un try catch
		try {
			// Se imprime un mensaje
			System.out.print("Enter the file name: ");
			// Toma como valor el nombre del archivo que ha instroducido el usuario por
			// consola
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
			// Se declara la variable que va a leer el archivo
			String fileName = inputReader.readLine();
			// Se inicializa la clase BufferedReader con el archivo que se desea leer
			reader = new BufferedReader(new FileReader(fileName));
			// Se declara la variable que va ir leyendo linea a linea el archivo
			String line;
			// Se inicia un bucle que va ir leyendo el archivo hasta que se encuentre una
			// línea vacía
			while ((line = reader.readLine()) != null) {
				// Se imprime las líneas que se van leyendo del archivo
				System.out.println(line);
			}
			// Se pone un catch con la excepción FileNotFoundException, que saltará si el
			// archivo introducido no existe
		} catch (FileNotFoundException e) {
			// Se imprime un mensaje explicando porque ha saltado la excepción
			System.out.println("File not found: " + e.getMessage());
			// Se pone otro catch con la excepción IOException, que saltará si ha ocurrido
			// un error de entrada y salida del archivo
		} catch (IOException e) {
			// Se imprime un mensaje explicando porque ha saltado la excepción
			System.out.println("An I/O error occurred: " + e.getMessage());
			// Se pone un bloque finally, que siempre se ejecutará
		} finally {
			// Se inicializa un try catch
			try {
				// Se declara un condicional que mientras la varible no sea null se hará algo
				if (reader != null) {
					// Se cierra la variable que lee el archivo
					reader.close();
				}
				// Se pone un catch con la excepción IOException, que saltará si ha ocurrido un
				// error de entrada y salida del archivo
			} catch (IOException e) {
				// Se imprime un mensaje explicando porque ha saltado la excepción
				System.out.println("Error closing the file: " + e.getMessage());
			}
		}
	}
}

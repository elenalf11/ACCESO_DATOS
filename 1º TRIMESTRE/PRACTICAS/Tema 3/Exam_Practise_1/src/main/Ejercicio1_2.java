package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
 * Crea un programa que escriba el siguiente texto en un archivo llamado "output.txt". 
 */

public class Ejercicio1_2 {

	public static void main(String[] args) {
		String nombreArchivo = "output.txt";
		String contenido = "Esto es un ejemplo de texto escrito a un archivo usando BufferedWriter \n";
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));
			escritor.write(contenido);
			System.out.println("Se ha escrito correctamente en el archivo");
			String contenidoAdicional = "Esta es una línea adicional en el archivo";
			escritor.write(contenidoAdicional);
			System.out.println("Se ha escrito correctamente en el archivo");
			escritor.close();
			
			BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
			String line;
			while((line = lector.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("Se ha leído en su totalidad el archivo");
			lector.close();
			
			
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
		}
		
	}

}

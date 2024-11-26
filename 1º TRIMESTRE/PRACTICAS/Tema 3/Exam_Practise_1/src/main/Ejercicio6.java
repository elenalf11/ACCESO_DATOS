package main;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {
		String nombreArchivo = "pruebaBufferededOuputStream.txt";
		String contenido = "Esto es una prueba de escritura con BufferedOutputStream";
		
		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nombreArchivo));
			try {
				bos.write(contenido.getBytes());
				System.out.println("Se ha escrito correctamente en el archivo");
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
			String line;
			try {
				while((line = lector.readLine()) != null) {
					System.out.println(line);
				}
				System.out.println("Ha terminado de leer el archivo completamente");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

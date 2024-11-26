package main;

import java.io.FileWriter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Datos archivo
		String nombreArchivo = "ejemploWriter.txt";
		Path path = Path.of("ejemploWriter.txt");
		String contenido = "Escribiendo en un archivo con la clase FileWriter";
		
		try {
			//
			FileWriter escritor = new FileWriter(nombreArchivo);
			escritor.write(contenido);
			System.out.println("Se ha escrito correctamente");
			escritor.close();
			
			Scanner lector = new Scanner(path);
			while(lector.hasNextLine()) {
				String line = lector.nextLine();
				System.out.println(line);
			}
			System.out.println("Archivo leído en su totalidad");
			lector.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

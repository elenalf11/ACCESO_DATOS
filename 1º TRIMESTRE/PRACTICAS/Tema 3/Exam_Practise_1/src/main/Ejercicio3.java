package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) {
		Path archivo = Path.of("ejemplo.txt");
		try {
			//Creación de archivo
			if(Files.notExists(archivo)) {
				Files.createFile(archivo);
				System.out.println("---------- Archivo creado correctamente. Nombre del archivo: " + archivo.getFileName() + " -----------");
			}else {
				System.out.println("---------- El archivo ya existe -----------------------------------");
			}
			
			//Escribir en el archivo
			String contenido = "Hola que tal esto es un poco de texto de prueba \n";
			Files.write(archivo, contenido.getBytes(), StandardOpenOption.APPEND);
			System.out.println("-------------- Se ha escrito correctamente en el archivo -------------");
			String contenidoAdicional = "Esta es la segunda parte del archivo \n";
			Files.write(archivo, contenidoAdicional.getBytes(), StandardOpenOption.APPEND);
			System.out.println("-------------- Se ha escritor correctamente en el archivo ------------");
			
			//Leer el archivo
			List<String> lines = Files.readAllLines(archivo, StandardCharsets.UTF_8);
			System.out.println("--------------- Contenido del archivo: -------------------------------");
			for(String line : lines) {
				System.out.println(line);
			}
			System.out.println("-------------- Se ha leído en su totalidad el archivo ----------------");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}

	}

}

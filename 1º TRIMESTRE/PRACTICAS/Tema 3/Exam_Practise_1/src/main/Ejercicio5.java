package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String [] player = {"pepe", "elena", "juan", "david", "ana"};
		Integer[] points = {200, 400, 100, 20, 50};
		String nombreArchivo = "jugadores.txt";
		Path path = Path.of("jugadores.txt");
		
		for(int i = 0; i < player.length; i++) {
			for(int j = 0; j < player.length - i - 1; j++) {
				if(points[j] < points[j + 1]) {
					
					//Ordenar puntuación
					int temp = points[j];
					points[j] = points[j + 1];
					points[j + 1] = temp;
					
					//Ordenar palabras
					String tempS = player[j];
					player[j] = player[j + 1];
					player[j + 1] = tempS;
				}
			}
		}
		
		try {
			String contenido = "";
			Files.write(path, contenido.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			for(int i = 0; i < 3; i++) {
				contenido = "Jugador: " + player[i].toUpperCase() + " -- Puntuación: " + points[i] + "\n";
				Files.write(path, contenido.getBytes() ,StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			}
			
			
			System.out.println("Se ha escrito correctamente el archivo");
			
			List<String> jugadores = Files.readAllLines(path);
			
			for(String line : jugadores) {
				System.out.println(line);
			}
			
			System.out.println("Se ha leído completamente el archivo");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}

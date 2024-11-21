package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.next();
		System.out.println("Dime tu edad: ");
		String edad = sc.next();
		
		String nombreArchivo = "datos.txt";
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));
			escritor.write(nombre + " : ");
			System.out.println("Se ha escrito el nombre correctamente");
			escritor.write(edad);
			System.out.println("Se ha escrito la edad correctamente");
			escritor.close();
			
			BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
			String line;
			while((line = lector.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("Se ha leído en su totalidad el archivo");
			lector.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

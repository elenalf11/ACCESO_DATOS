package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadingExample {
	public static void main(String[] args) {
		//Se inicializa a null la clase BufferedReader (lector de archivos)
		BufferedReader reader = null;
		//Se inicia un try catch
		try {
			System.out.print("Enter the file name: ");
			//
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
			String fileName = inputReader.readLine();
			reader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("An I/O error occurred: " + e.getMessage());
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing the file: " + e.getMessage());
			}
		}
	}
}

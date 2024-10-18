package main;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// Matrix
		int[][] matrix = new int[4][4];
		// Scanner Object
		Scanner sc = new Scanner(System.in);
		int pi;
		int pj;
		int element;

		// Refill Matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println("Escribe el valor en la posición [" + i + "] [" + j + "]: ");
				matrix[i][j] = sc.nextInt();
			}
		}

		// Print Matrix
		System.out.println("La matriz es: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		
		try {
			// User position
			System.out.println("Dime la posición i que quieras cambiar: ");
			pi = sc.nextInt();
			System.out.println("Dime la posición j que quieras cambiar: ");
			pj = sc.nextInt();
			System.out.println("Dime el elemento que quieres añadir: ");
			element = sc.nextInt();

			// Replace the item with the new user item
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					if (pi == i && pj == j) {
						matrix[pi][pj] = element;
					}
				}
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Invalid position: " + e.getMessage());
		}finally {
			System.out.println("Posición actualizada");
			sc.close();
			System.out.println("La nueva matriz es: ");
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix.length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println(" ");
			}
		}
	}
}

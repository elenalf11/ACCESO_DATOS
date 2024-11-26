package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operacion cuenta = new Operacion();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero1 = sc.nextInt();
		System.out.println("Dime otro número: ");
		int numero2 = sc.nextInt();
		
		try {
			cuenta.suma(numero1, numero2);
		} catch (ExceptionNumberSeven e) {
			System.out.println("He encontrado un número 7, lo siento no se sumarlo :(");
		}
		
		Queue <String> cola = new LinkedList<>();

	}

}

package main;

import java.util.Scanner;

/**
 * Age Validation class
 * 
 * @author elena
 */

public class AgeValidation {

	/**
	 * Check if the user age is bigger than 18 and lower than 100
	 * 
	 * @param age its the user age
	 * @throws InvalidAgeException its the exception (lower than 18 and bigger than
	 *                             100)
	 */
	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 18 || age > 100) {
			throw new InvalidAgeException("La edad debe estar entre 18 y 100 años");
		} else {
			System.out.println("La edad es válida");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad para entrar al sistema: ");
		int edad = sc.nextInt();
		try {
			checkAge(edad);
		} catch (InvalidAgeException e) {
			System.out.println("Invalid age: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}

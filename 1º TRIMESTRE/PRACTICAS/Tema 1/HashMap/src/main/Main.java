package main;

import java.util.Scanner;

/**
 * @author elena Clase Main
 */

public class Main {
	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PhoneBook agenda = new PhoneBook();
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("\n --- Menú Agenda Telefónica --- \n"
					+ " 1. Añadir/Actualizar Contacto \n 2. Eliminar Contacto \n 3. Buscar Contacto \n 4. Listar todos los contactos \n 5. Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Nombre del contacto: ");
				String name_1 = sc.next();
				System.out.print("Número telefónico: ");
				int number_1 = sc.nextInt();
				agenda.add(name_1, number_1);
				break;
			case 2:
				System.out.print("Nombre del contacto que quieres eliminar: ");
				String name_2 = sc.next();
				agenda.delete(name_2);
				break;
			case 3:
				System.out.print("Nombre del contacto que quieres buscar: ");
				String name_3 = sc.next();
				agenda.search(name_3);
				break;
			case 4:
				agenda.viewContacts();
				break;
			}
		} while (opcion != 5);
		sc.close();
	}
}

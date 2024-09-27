package main;

import java.util.Scanner;

/**
 * @author elena Clase Main
 */

public class Main {
	/**
	 * Metodo Main
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
				agenda.add();
				break;
			case 2:
				agenda.delete();
				break;
			case 3:
				agenda.search();
				break;
			case 4:
				agenda.viewContacts();
				break;
			}
		} while (opcion != 5);
	}
}

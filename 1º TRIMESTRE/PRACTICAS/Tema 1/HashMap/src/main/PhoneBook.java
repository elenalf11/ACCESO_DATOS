package main;

import java.util.HashMap;

/**
 * @author elena Crea una agenda telefonica con HashMap
 */

public class PhoneBook {
	/**
	 * Atributos
	 */

	private HashMap<String, Integer> contact;

	/**
	 * Constructora
	 */

	public PhoneBook() {
		this.contact = new HashMap<>();
	}

	/**
	 * Metodo aniadir o actualizar un contacto
	 * 
	 * @param name   el nombre que se quiere aniadir o actualizar
	 * @param number el numero que se quiere aniadir o actualizar
	 * @return devuelve true si se ha podido aniadir o actualizar correctamente
	 */
	public void add(String name, int number) {
		this.contact.put(name, number);
		System.out.println("El contacto ha sido añadido/actualizado correctamente");
	}

	/**
	 * Metodo eliminar un contacto
	 * 
	 * @param name el nombre del contacto que se quiere eliminar
	 * @return devuelve true si se ha podido eliminar, sino, devuelve false
	 */
	public void delete(String name) {
		if (this.contact.containsKey(name)) {
			this.contact.remove(name);
			System.out.println("El contacto ha sido eliminado con éxito");
		} else {
			System.out.println("El contacto no se ha encontrado en la agenda telefónica");
		}
	}

	/**
	 * Metodo para buscar un contacto
	 * 
	 * @param name el nombre del contacto que se quiere buscar
	 * @return devuelve true si se ha encontrado, sino, devuelve false
	 */
	public void search(String name) {
		if (this.contact.containsKey(name)) {
			System.out.println("El número de teléfono de " + name + " es " + this.contact.get(name));
		} else {
			System.out.println("El contacto no se ha encontrado en la agenda telefónica");
		}
	}

	/**
	 * Metodo para listar todos los contactos de la agenda telefonica
	 * 
	 * @return devuelve true si se han podido listar todos los elementos, sino,
	 *         devuelve false
	 */
	public void viewContacts() {
		if (this.contact.isEmpty()) {
			System.out.println("La agenda telefónica está vacía");
		} else {
			System.out.println("Contactos en la agenda telefónica: ");
			for (String name : this.contact.keySet()) {
				System.out.println("Nombre: " + name + " , Número telefónico: " + this.contact.get(name));
			}
		}
	}
}

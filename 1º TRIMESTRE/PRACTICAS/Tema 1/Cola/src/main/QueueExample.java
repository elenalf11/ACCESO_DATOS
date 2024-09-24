package main;

import java.util.LinkedList;

public class QueueExample<T> {
	/**
	 * Atributos
	 */
	private final int MAX_SIZE;
	private LinkedList<T> cola;

	/**
	 * Constructora
	 */
	public QueueExample() {
		this.cola = new LinkedList<T>();
		this.MAX_SIZE = 5;
	}

	/**
	 * Comprueba si la cola esta vacia
	 * 
	 * @return devuelve true si esta vacia y sino devuelve false
	 */
	public boolean isEmpty() {
		if (this.cola.size() <= 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Elimina y devuelve el elemento que esta en la cima de la cola
	 * 
	 * @return devuelve el elemento de la cima de la cola, sino devuelve null
	 */
	public T remove() {
		if (isEmpty()) {
			return null;
		} else {
			T element = this.cola.getFirst();
			this.cola.removeFirst();
			return element;
		}
	}

	/**
	 * Devuelve el elemento que esta en la cima de la cola
	 * 
	 * @return devuelve el elemento de la cima de la cola, sino devuelve null
	 */
	public T peek() {
		if (isEmpty()) {
			return null;
		} else {
			return this.cola.getFirst();
		}
	}

	/**
	 * Aniade elementos a la cola si supera el tamanio de la cola lanza una
	 * excepcion
	 * 
	 * @param element es el elemento que se desea aniadir a la cola
	 * @return devuelve true si se ha podido aniadir, sino devuelve false
	 */
	public boolean add(T element) {
		try {
			if (this.cola.size() >= this.MAX_SIZE) {
				throw new IllegalStateException("La cola está llena");
			} else {
				this.cola.add(element);
				return true;
			}
		} catch (Exception e) {
			System.err.println("La cola está llena");
			return false;
		}

	}

	/**
	 * Crea una cadena de texto
	 * 
	 * @return devuelve la cola en forma de una cadena de texto
	 */
	public String toString() {
		return "Cola: " + this.cola.toString();
	}

}

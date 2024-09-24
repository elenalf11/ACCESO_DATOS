package main;

/**
 * @author elena
 * Crea una clase pila con un ArrayList implementando todos los métodos de la pila y que el ArrayList actue igual que esta.
 */

import java.util.ArrayList;

public class Stack<T> {
	/**
	 * Atributos
	 */
	private ArrayList<T> stack;

	/**
	 * Constructora
	 */
	public Stack() {
		this.stack = new ArrayList<T>();
	}

	/**
	 * Metodo isEmpty Comprueba si el ArrayList esta vacio
	 * 
	 * @return true si esta vacia, sino retorna false
	 */
	public boolean isEmpty() {
		return this.stack.isEmpty();
	}

	/**
	 * Metodo peek Devuelve el elemento que esta en la cima de la pila
	 * 
	 * @return devuelve el elemento que esta en la cima de la pila
	 */
	public T peek() {
		if (!isEmpty()) {
			return this.stack.get(this.stack.size() - 1);
		} else {
			System.out.println("Lo siento no hay elementos en la pila");
			return null;
		}

	}

	/**
	 * Metodo pop Devuelve y elimina el elemento que esta en la cima de la pila
	 * 
	 * @return devuelve el elemento que esta en la cima de la pila
	 */
	public T pop() {
		if (!isEmpty()) {
			T element = this.stack.get(this.stack.size() - 1);
			this.stack.remove(this.stack.size() - 1);
			return element;
		} else {
			System.out.println("Lo siento no hay elementos en la pila");
			return null;
		}
	}

	/**
	 * Metodo push Introduce los elementos al ArrayList
	 * 
	 * @param element es el elemento que se desea introducir
	 */
	public void push(T element) {
		this.stack.add(element);
	}

	/**
	 * Metodo toString que convierte el ArrayList en una cadena de texto
	 */
	public String toString() {
		return "Pila: " + this.stack.toString();
	}

	/**
	 * Metodo remove Elimina el elemento del indice que se desee
	 * 
	 * @param index es el indice que se desea eliminar
	 */
	public void remove() {
		if (!isEmpty() ) {
			this.stack.remove(this.stack.get(this.stack.size() - 1));
		} else {
			System.out.println("Lo siento no hay elementos en la pila");
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("El elemento que está en la cima es " + stack.peek());
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.push(5);
		stack.push(10);
		System.out.println(stack.toString());
		stack.remove();
		System.out.println(stack.toString());
	}

}

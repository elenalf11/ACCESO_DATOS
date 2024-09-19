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

	public void push(T element) {
		this.stack.add(element);
	}

	public String toString() {
		return this.stack.toString();
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("El elemento que está en la cima es " + stack.peek());
		System.out.println("Pila original: " + stack.toString());
		stack.pop();
		System.out.println("Pila actualizada: " + stack.toString());
	}

}

package main;

public class Main {

	public static void main(String[] args) {
		QueueExample <Integer> cola = new QueueExample <Integer>();
		
		cola.add(5);
		cola.add(1);
		cola.add(4);
		cola.add(3);
		cola.add(6);
		cola.add(7);
		
		System.out.println(cola.toString());
		
		System.out.println("El elemento de la cima es " + cola.peek());
		
		cola.remove();
		
		System.out.println(cola.toString());

	}

}

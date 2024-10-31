package main;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<>();
		Queue<String> q2 = new LinkedList<>();
		
		q1.add("Negro");
		q1.add("Rojo");
		q1.add("Rojo");
		q1.add("Blanco");
		
		q2.add("Negro");
		q2.add("Naranja");
		q2.add("Rojo");
		q2.add("Rojo");
		
		System.out.println("Primera queue: " + q1.toString());
		System.out.println("Segunda queue: " + q2.toString());
		
		while(!q1.isEmpty()) {
			if(q2.contains(q1.poll())) {
				System.out.println("Sí");
			}else {
				System.out.println("No");
			}
		}
		
		
		/**
		 * for (int i = 0; i < q1.size(); i++) {
		 
			String element = q1.poll();
			for(int j = 0; j < q1.size() ; j++) {
				if(element.equals(q2.peek())) {
					System.out.println("Sí");
					q2.poll();
				}else {
					System.out.println("No");
					q2.poll();
				}
			}
			
			
		}
		*/
		
		
		
	

	}

}

package main;

import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {
	private Queue <Client> queue;
	
	public BankQueue() {
		this.queue = new LinkedList<>();
	}
	
	public void addClient(Client client) {
		this.queue.add(client);
	}
	
	public Client serveClient() {
		return this.queue.poll();
	}
	
	public boolean isQueueEmpty() {
		return this.queue.isEmpty();
	}
	
	public Client nextClient() {
		return this.queue.peek();
	}
}

package main;

public class Main {

	public static void main(String[] args) {
		BankQueue queue = new BankQueue();
		
		queue.addClient(new Client("Ana", "12345"));
		queue.addClient(new Client("Luis", "67890"));
		System.out.println(queue.nextClient());
		queue.serveClient();
		System.out.println(queue.nextClient());
		System.out.println(queue.isQueueEmpty());
	}

}

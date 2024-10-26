package main;

public class Client {
	
	private String name;
	private String id;
	
	public Client(String _name, String _id) {
		this.name = _name;
		this.id = _id;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Id: " + this.id;
	}
}

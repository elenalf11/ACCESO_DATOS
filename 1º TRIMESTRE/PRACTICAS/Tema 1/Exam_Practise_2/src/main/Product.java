package main;

public class Product {
	
	private String name;
	private String category;
	private String expirationDate;
	
	public Product(String _name, String _category, String _expirationDate) {
		this.name = _name;
		this.category = _category;
		this.expirationDate = _expirationDate;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Category: " + this.category + ", Expiration Date: " + this.expirationDate;
	}
}

package main;

public class Main {

	public static void main(String[] args) {
		InventoryStack inventory = new InventoryStack();
		
		inventory.addProduct(new Product("Leche", "Lácteos", "2023-11-01"));
		inventory.addProduct(new Product("Queso", "Lácteos", "2023-11-05"));
		
		System.out.println(inventory.viewLastProduct());
		inventory.sellProduct();
		System.out.println(inventory.viewLastProduct());
	}

}

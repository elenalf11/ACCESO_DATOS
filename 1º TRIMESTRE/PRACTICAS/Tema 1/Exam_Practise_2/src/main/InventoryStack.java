package main;

import java.util.Stack;

public class InventoryStack {
	private Stack <Product> stack;
	
	public InventoryStack() {
		this.stack = new Stack <Product>();
	}
	
	public void addProduct(Product product) {
		this.stack.add(product);
		
	}
	
	public void sellProduct() {
		this.stack.pop();
	}
	
	public Product viewLastProduct() {
		return this.stack.peek();
	}
	
	public boolean isInventoryEmpty() {
		return this.stack.isEmpty();
	}
}

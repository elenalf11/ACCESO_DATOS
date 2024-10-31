package main;

public class Pedido <T>{
	
	private T product;
	private String id;
	
	public Pedido(T _product, String _id) {
		this.product = _product;
		this.id = _id;
	}
	
	public String mostrarPedido() {
		return "Producto: " + this.product + ", id: " + this.id;
	}

}

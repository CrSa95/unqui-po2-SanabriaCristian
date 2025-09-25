package ar.edu.unq.po2.tp4;

public class Producto {
	
	private double precio;
	private int stock;
	
	Producto(double precio, int stock){
		this.precio = precio;
		this.stock = stock;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void modificarPrecio(double precio) {
		this.precio = precio;
	}
	
	public void decrementarStock(int cantidad) {
		this.stock -= cantidad;
	}
	
	public int getStock() {
		return this.stock;
	}
}

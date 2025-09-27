package ar.edu.unq.po2.tp4;

public class Producto implements Facturable{
	
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
	
	public void decrementarStock() {
		this.stock -= 1;
	}
	
	public int getStock() {
		return this.stock;
	}

	@Override
	public double getMontoAPagar() {
		// TODO Auto-generated method stub
		return this.getPrecio();
	}

	@Override
	public void quitarStock() {
		this.decrementarStock();	
	}
}

package ar.edu.unq.po2.Supermercado;

public class Producto {
	
	private String nombre; 
	private double precio;
	private boolean precioCuidado;
	private int descuento;
	
	Producto(String nombre, double precio, boolean precioCuidado, int descuento){
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
		this.descuento = descuento;
	}
	
	Producto(String nombre, double precio){
		this(nombre,precio,false,0);
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	public void aumentarPrecio(double d) {
		// TODO Auto-generated method stub
		this.precio += d;
	}
	
	public boolean esPrecioCuidado() {
		// TODO Auto-generated method stub
		return this.precioCuidado;
	}
	
	public int getDescuento() {
		return this.descuento;
	}
	
}

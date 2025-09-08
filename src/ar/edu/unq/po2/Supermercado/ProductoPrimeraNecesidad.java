package ar.edu.unq.po2.Supermercado;

public class ProductoPrimeraNecesidad extends Producto {

	ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, int descuento) {
		super(nombre, precio, precioCuidado, descuento);
		// TODO Auto-generated constructor stub
	}
	/*
	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
	*/
	public double getPrecio() {
		return super.getPrecio() - ((super.getPrecio() * super.getDescuento()) / 100) ;
	}

}

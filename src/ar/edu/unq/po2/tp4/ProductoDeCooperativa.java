package ar.edu.unq.po2.tp4;

public class ProductoDeCooperativa extends Producto {

	ProductoDeCooperativa(double precio, int stock) {
		super(precio, stock);
		// TODO Auto-generated constructor stub
	}

	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
	
	@Override
	public double getMontoAPagar() {
		// TODO Auto-generated method stub
		return this.getPrecio();
	}
}

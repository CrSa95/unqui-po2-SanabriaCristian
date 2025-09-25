package ar.edu.unq.po2.tp4;

public class Caja implements Agencia {

	private double montoTotal;
	
	Caja(){
		
	}
	
	public void registrarProducto(Producto producto, int cantidad) {
		this.montoTotal += producto.getPrecio()*cantidad;
		producto.decrementarStock(cantidad);
	}
	
	public void registrarProducto(Factura factura) {
		this.montoTotal += factura.montoTotal();
		this.registrarPago(factura);
	}
	
	public double getMontoTotal() {
		return this.montoTotal;
	}

	@Override
	public void registrarPago(Factura factura) {

	}
}

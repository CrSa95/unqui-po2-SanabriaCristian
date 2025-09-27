package ar.edu.unq.po2.tp4;

public class Caja implements Agencia {

	private double montoTotal;
	
	Caja(){
		
	}
	
	public void registrarProducto(Facturable producto) {
		this.montoTotal += producto.getMontoAPagar();
		producto.quitarStock();
	}
	
	public double getMontoTotal() {
		return this.montoTotal;
	}

	@Override
	public void registrarPago(Factura factura) {

	}
}

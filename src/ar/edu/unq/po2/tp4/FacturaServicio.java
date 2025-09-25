package ar.edu.unq.po2.tp4;

public class FacturaServicio extends Factura{

	FacturaServicio(double tasaDelServicio) {
		super(tasaDelServicio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double montoTotal() {
		// TODO Auto-generated method stub
		return super.getTasaDelServicio();
	}
	
}

package ar.edu.unq.po2.tp4;

public class FacturaImpuesto extends Factura{

	FacturaImpuesto(double costoPorUnidadConsumida, int unidadesConsumidas) {
		super(costoPorUnidadConsumida, unidadesConsumidas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double montoTotal() {
		// TODO Auto-generated method stub
		return super.getCostoPorUnidadConsumida() * super.getUnidadesConsumidas();
	}
	
}

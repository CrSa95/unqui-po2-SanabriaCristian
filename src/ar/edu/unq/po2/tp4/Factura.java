package ar.edu.unq.po2.tp4;

abstract class Factura implements Facturable {
	
	private double costoPorUnidadConsumida;
	private int unidadesConsumidas;
	private double tasaDelServicio;
	
	Factura(double tasaDelServicio){
		this.tasaDelServicio = tasaDelServicio;
	}
	
	Factura(double costoPorUnidadConsumida, int unidadesConsumidas){
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	public double getCostoPorUnidadConsumida() {
		return this.costoPorUnidadConsumida;
	}
	
	public double getUnidadesConsumidas() {
		return this.unidadesConsumidas;
	}

	public double getTasaDelServicio() {
		return this.tasaDelServicio;
	}
	
	public abstract double montoTotal();
}

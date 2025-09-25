package ar.edu.unq.po2.tp5.BancoYPrestamos;

public abstract class Credito {
	
	private Cliente cliente; 
	private int cantCuotas;
	private double montoTotal; 
	
	Credito(int cantCuotas, double montoTotal){
		this.cantCuotas = cantCuotas;
		this.montoTotal = montoTotal;
	}
	
	protected abstract boolean evaluarCredito();
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public double getMontoTotal() {
		// TODO Auto-generated method stub
		return this.montoTotal;
	}

	public int getCantidadCuotas() {
		// TODO Auto-generated method stub
		return this.cantCuotas;
	}
	
}

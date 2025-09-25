package ar.edu.unq.po2.tp5.BancoYPrestamos;

public class CreditoPersonal extends Credito {

	CreditoPersonal(int cantCuotas, double montoTotal) {
		super(cantCuotas, montoTotal);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean evaluarCredito() {
		// TODO Auto-generated method stub
		return this.getCliente().sueldoNetoAnual() >= 15000 && 
				this.calcularMontoCuota() < this.getCliente().getSueldoNetoMensual() * 0.7;
	}

	private double calcularMontoCuota() {
		// TODO Auto-generated method stub
		return this.getMontoTotal() / this.getCantidadCuotas();
	}

}

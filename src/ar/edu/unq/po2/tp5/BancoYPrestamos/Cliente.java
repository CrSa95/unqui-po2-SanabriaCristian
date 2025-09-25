package ar.edu.unq.po2.tp5.BancoYPrestamos;

public class Cliente {

	private double sueldoNetoMensual;
	private double dinero;
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	
	public Cliente(String nombre, String apellido, String direccion, int edad) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
	}

	public double sueldoNetoAnual() {
		// TODO Auto-generated method stub
		return this.getSueldoNetoMensual() * 12;
	}
	
	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		// TODO Auto-generated method stub
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public double getSueldoNetoMensual() {
		// TODO Auto-generated method stub
		return this.sueldoNetoMensual;
	}

	public void recibirMonto(double montoTotal) {
		// TODO Auto-generated method stub
		this.dinero = montoTotal;
	}
	
	public double getDinero() {
		// TODO Auto-generated method stub
		return this.dinero;
	}

	public void solicitarCredito(Banco banco, Credito credito) {
		// TODO Auto-generated method stub
		credito.setCliente(this);
		banco.registrarSolicitudDeCredito(credito);
	}

}

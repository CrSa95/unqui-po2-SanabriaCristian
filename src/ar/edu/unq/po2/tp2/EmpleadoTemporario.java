package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {

	LocalDate fechaFinContrato;
	int cantidadDeHoras;
	
	EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	public void setFechaFinContrato(LocalDate fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	public int getCantidadDeHoras() {
		return cantidadDeHoras;
	}

	public void setCantidadDeHoras(int cantidadDeHoras) {
		this.cantidadDeHoras = cantidadDeHoras;
	} 
	
	public double sueldoBruto() {
		return this.sueldoBasico + (this.cantidadDeHoras * 40);
	}
	
	public double retencionObraSocial() {
		return this.sueldoBruto() * 0.1 + this.descuentoPorMayor(); 
	}
	
	public int descuentoPorMayor() {
		if(this.edad() > 50) {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	public double retencionJubilacion() {
		return (this.sueldoBruto() * 0.10) + (this.cantidadDeHoras * 5);
	}
	
}
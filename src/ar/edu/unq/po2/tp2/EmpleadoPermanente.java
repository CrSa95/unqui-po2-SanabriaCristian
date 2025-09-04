package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {

	int cantidadDeHijos;
	int antiguedad;
	boolean conyuge;
	
	EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}
	
	public void setConyuge(boolean conyuge) {
		this.conyuge = conyuge;
	}
	
	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public double sueldoBruto() {
		
		return this.sueldoBasico + (this.cantidadDeHijos*150) + this.asignacionConyuge() + (this.antiguedad * 50);
	}
	
	public int asignacionConyuge() {
		if(conyuge) {
			return 100;
		}
		else {
			return 0;
		}
	}
	
	public double retencionObraSocial() {
		return this.sueldoBruto() * 0.1 + (this.cantidadDeHijos*20); 
	}
	
	public double retencionJubilacion() {
		return this.sueldoBruto() * 0.15;
	}
	
}

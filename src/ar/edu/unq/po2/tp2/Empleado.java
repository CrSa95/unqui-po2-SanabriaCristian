package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public abstract class Empleado {
	
	String nombre;
	String direccion;
	String estadoCivil;
	LocalDate fechaNacimiento; 
	double sueldoBasico;
	
	Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento){
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int edad() {
		return 0;
	} 
	
	public void setDireccion(String direccion) {
		
	}
	
	public void setEstadoCivil(String estadoCivil) {
		
	}
	
	public void setSueldoBasico(double sueldo) {
		
	}
	
	public double getSueldoBasico() {
	
		return 0;
	}
	
	public double sueldoBruto() {
		return 0;
	}
	
	public double retenciones() {
		return 0;
	}
	
	public double sueldoNeto() {
		return 0;
	}
}

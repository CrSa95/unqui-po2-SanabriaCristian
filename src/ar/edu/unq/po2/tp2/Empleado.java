package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

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
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int edad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	} 
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public void setSueldoBasico(double sueldo) {
		this.sueldoBasico = sueldo;
	}
	
	public double getSueldoBasico() {
	
		return this.sueldoBasico;
	}
	
	abstract double sueldoBruto();
	
	abstract double retencionObraSocial();
	
	abstract double retencionJubilacion();
	
	public double retencionTotal() {
		return this.retencionObraSocial() + this.retencionJubilacion();
	}
	
	public double sueldoNeto() {
		return this.sueldoNeto();
	}
}

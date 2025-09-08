package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
		return this.edad() > 50 ? 25 : 0;
	}
	
	public double retencionJubilacion() {
		return (this.sueldoBruto() * 0.10) + (this.cantidadDeHoras * 5);
	}

	public List<Concepto> generarConceptos() {
	    List<Concepto> conceptos = new ArrayList<>();

	    conceptos.add(new Concepto("Sueldo Básico", this.getSueldoBasico()));

	    if (this.getCantidadDeHoras() > 0) {
	        conceptos.add(new Concepto("Horas extras", 40 * this.cantidadDeHoras));
	    }

	    conceptos.add(new Concepto("Obra Social", -this.retencionObraSocial()));
	    conceptos.add(new Concepto("Aportes Jubilatorios", -this.retencionJubilacion()));

	    return conceptos;
	}

	@Override
	int retencionConstante() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
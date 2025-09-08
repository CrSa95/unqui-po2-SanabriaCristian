package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoContratado extends Empleado {

	String medioDePago;
	int numeroContrato;
	
	EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	
	public double sueldoBruto() {
		return this.sueldoBasico;
	}
	
	public double sueldoNeto() {
		return this.sueldoBruto() - this.retencionConstante();
	}
	
	public int retencionConstante() {
		return 50; 
	}

	public List<Concepto> generarConceptos() {
	    List<Concepto> conceptos = new ArrayList<>();

	    conceptos.add(new Concepto("Sueldo Básico", this.getSueldoBasico()));

	    conceptos.add(new Concepto("Retencion Constante", -this.retencionConstante()));

	    return conceptos;
	}


	@Override
	double retencionObraSocial() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	double retencionJubilacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
		return this.conyuge ? 100 : 0;
	}
	
	public double retencionObraSocial() {
		return this.sueldoBruto() * 0.1 + (this.cantidadDeHijos*20); 
	}
	
	public double retencionJubilacion() {
		return this.sueldoBruto() * 0.15;
	}

	public List<Concepto> generarConceptos() {
	    List<Concepto> conceptos = new ArrayList<>();

	    conceptos.add(new Concepto("Sueldo Básico", this.getSueldoBasico()));

	    if (this.cantidadDeHijos > 0) {
	        conceptos.add(new Concepto("Asignación por Hijo", 150 * this.cantidadDeHijos));
	    }

	    if (this.estadoCivil.equalsIgnoreCase("casado")) {
	        conceptos.add(new Concepto("Asignación por Cónyuge", 100));
	    }

	    if (this.getAntiguedad() > 0) {
	        conceptos.add(new Concepto("Antigüedad", 50 * this.getAntiguedad()));
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

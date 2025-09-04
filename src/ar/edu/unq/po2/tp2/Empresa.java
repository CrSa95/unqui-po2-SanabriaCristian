package ar.edu.unq.po2.tp2;

import java.util.ArrayList;

import java.util.List;

public class Empresa {
	
	String nombre;
	int cuit;
	List<Empleado> empleados = new ArrayList<Empleado>();
	List<Recibo> recibos = new ArrayList<Recibo>();
	
	Empresa(String nombre, int cuit){
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	public double liquidarSueldos() {
		return 0;
	}
	
	public double montoTotalNeto() {
		return 0;
	}
	
	public double montoTotalBruto() {
		return 0;
	}
	
	public double montoTotalRetenciones() {
		return 0;
	}
}

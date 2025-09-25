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
	
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public void liquidarSueldos() {
		for (Empleado current : this.empleados) {
			this.recibos.add(new Recibo(current));		
		}
	}
	
	public double montoTotalNeto() {
		/*
		double totalNeto = 0;
		for (Empleado current : this.empleados) {
			totalNeto += current.sueldoNeto();		
		}
		return totalNeto;
		*/
		return this.empleados
			    .stream()
			    .mapToDouble(Empleado::sueldoNeto)
			    .sum();
	}
	
	public double montoTotalBruto() {
		/*
		double totalBruto = 0;
		for (Empleado current : this.empleados) {
			totalBruto += current.sueldoBruto();		
		}
		return totalBruto;
		*/
		return this.empleados
			    .stream()
			    .mapToDouble(Empleado::sueldoBruto)
			    .sum();
	}
	
	public double montoTotalRetenciones() {
		/*
		double totalRetencion = 0;
		for (Empleado current : this.empleados) {
			totalRetencion += current.retencionTotal();		
		}
		return totalRetencion;
		*/
		return this.empleados
			    .stream()
			    .mapToDouble(Empleado::retencionTotal)
			    .sum();
	}
}

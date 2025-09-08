package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.List;

public class Recibo {
	
	String nombre;
	String direccion;
	LocalDate fechaEmision;
	double sueldoBruto;
	double sueldoNeto;
	List<Concepto> conceptos;
	
	Recibo(Empleado empleado){
		this.nombre = empleado.getNombre();
		this.direccion = empleado.getDireccion();
		this.fechaEmision = LocalDate.now();
		this.sueldoBruto = empleado.sueldoBruto();
		this.sueldoNeto = empleado.sueldoNeto();
		this.conceptos = empleado.generarConceptos();
	}
	
}

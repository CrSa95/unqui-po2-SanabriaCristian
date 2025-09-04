package ar.edu.unq.po2.tp2;

public class Concepto {
	
	String descripcion;
	double monto;
	
	Concepto(Empleado empleado){
		if(empleado.obtenerTipo() == "Temporario") {
			this.descripcion = "Obra Social: 10% de su sueldo bruto + $25 si supera los 50 años";
			this.monto = empleado.retencionObraSocial();
		}
		else {
			
		}
	}
	
}

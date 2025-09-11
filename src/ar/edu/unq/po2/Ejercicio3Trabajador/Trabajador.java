package ar.edu.unq.po2.Ejercicio3Trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresosAnuales = new ArrayList<Ingreso>();
	
	Trabajador(){
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		this.ingresosAnuales.add(ingreso);
	}
	
	public double getTotalPercibido() {
		double totalPercibido = 0;
		for (Ingreso current : this.ingresosAnuales) {
			totalPercibido += current.getMontoPercibido();		
		}
		return totalPercibido;
	}
	
	public double getMontoImponible() {
		double totalMontoImponible = 0;
		for (Ingreso current : this.ingresosAnuales) {
			totalMontoImponible += current.getMontoImponible();		
		}
		return totalMontoImponible;
	}
	
	public double getImpuestoAPagar() {
		return (this.getMontoImponible()*2)/100;
	}
}

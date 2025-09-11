package ar.edu.unq.po2.Ejercicio3Trabajador;

public class Ingreso {
	private int mesDePercepcion;
	private String concepto;
	private double montoPercibido;

	Ingreso(int mesDePercepcion,String concepto,double montoPercibido){
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public int getMesDePercepcion() {
		return this.mesDePercepcion;
	}
	
	public String getConcepto() {
		return this.concepto;
	}
	
	public double getMontoPercibido() {
		return this.montoPercibido;
	}
	
    public double getMontoImponible() {
        return this.montoPercibido;
    }
}

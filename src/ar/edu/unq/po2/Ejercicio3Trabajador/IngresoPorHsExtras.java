package ar.edu.unq.po2.Ejercicio3Trabajador;

public class IngresoPorHsExtras extends Ingreso {

	private int cantidadHsExtras;
	
	IngresoPorHsExtras(int mesDePercepcion, String concepto, double montoPercibido, int cantidadHsExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		// TODO Auto-generated constructor stub
		this.cantidadHsExtras = cantidadHsExtras;
	}
	
	public int getCantidadHsExtras() {
		return this.cantidadHsExtras;
	}
	
    public double getMontoImponible() {
        return 0;
    }

}

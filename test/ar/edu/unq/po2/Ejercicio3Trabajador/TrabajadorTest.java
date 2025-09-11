package ar.edu.unq.po2.Ejercicio3Trabajador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {
	
	private Trabajador unTrabajador;
	private Ingreso unIngreso;
	private IngresoPorHsExtras otroIngreso;
	
	@BeforeEach
	public void setUp() {
		unTrabajador = new Trabajador();
		unIngreso = new Ingreso(2, "Vacaciones", 110d);
		otroIngreso = new IngresoPorHsExtras(2, "Vacaciones", 110d,20);
	}
	
	@Test
	public void testTotalPercibido() {
		assertEquals(0, unTrabajador.getTotalPercibido());
		unTrabajador.agregarIngreso(unIngreso);
		unTrabajador.agregarIngreso(otroIngreso);
		assertEquals(220d, unTrabajador.getTotalPercibido());
	}
	
	@Test
	public void testMontoImponible() {
		assertEquals(0, unTrabajador.getMontoImponible());
		unTrabajador.agregarIngreso(unIngreso);
		unTrabajador.agregarIngreso(otroIngreso);
		assertEquals(110d, unTrabajador.getMontoImponible());
	}

	@Test
	public void testImpuestoAPagar() {
		assertEquals(0, unTrabajador.getImpuestoAPagar());
		unTrabajador.agregarIngreso(unIngreso);
		unTrabajador.agregarIngreso(otroIngreso);
		assertEquals(2.2d, unTrabajador.getImpuestoAPagar());
	}
	
}

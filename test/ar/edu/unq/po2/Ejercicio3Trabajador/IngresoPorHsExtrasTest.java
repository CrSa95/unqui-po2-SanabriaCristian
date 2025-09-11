package ar.edu.unq.po2.Ejercicio3Trabajador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoPorHsExtrasTest {

	private IngresoPorHsExtras unIngreso;
	
	@BeforeEach
	public void setUp() {
		unIngreso = new IngresoPorHsExtras(2, "Vacaciones", 110d,2);
	}
	
	@Test
	public void testMesDePercepcion() {
		assertEquals(2, unIngreso.getMesDePercepcion());
	}
	
	@Test
	public void testConcepto() {
		assertEquals("Vacaciones", unIngreso.getConcepto());
	}
	
	@Test
	public void testMontoPercibido() {
		assertEquals(110d, unIngreso.getMontoPercibido());
	}
	
	@Test
	public void testMontoImponible() {
		assertEquals(0, unIngreso.getMontoImponible());
	}
	
	@Test
	public void testCantidadDeHsExtras() {
		assertEquals(2, unIngreso.getCantidadHsExtras());
	}
}

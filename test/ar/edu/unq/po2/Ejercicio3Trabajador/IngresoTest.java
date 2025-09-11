package ar.edu.unq.po2.Ejercicio3Trabajador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoTest {

	private Ingreso unIngreso;
	
	@BeforeEach
	public void setUp() {
		unIngreso = new Ingreso(2, "Vacaciones", 110d);
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
		assertEquals(110d, unIngreso.getMontoImponible());
	}
}

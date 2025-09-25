package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaImpuestoTest {
	
	private FacturaImpuesto impuesto;
	
	@BeforeEach
	public void setUp() {
		impuesto = new FacturaImpuesto(10,100);
	}
	
	@Test
	public void testObtenerMontoTotal() {
		assertEquals(1000d, impuesto.montoTotal());
	}
}

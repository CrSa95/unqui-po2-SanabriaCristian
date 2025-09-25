package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaServicioTest {
	
	private FacturaServicio servicio;
	
	@BeforeEach
	public void setUp() {
		servicio = new FacturaServicio(200);
	}
	
	@Test
	public void testObtenerMontoTotal() {
		assertEquals(200d, servicio.montoTotal());
	}
}

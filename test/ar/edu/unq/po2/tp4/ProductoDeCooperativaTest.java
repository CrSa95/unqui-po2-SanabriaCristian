package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoDeCooperativaTest {
	
	private ProductoDeCooperativa arroz;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoDeCooperativa(10d, 2);
	}
	
	@Test
	public void testObtenerPrecio() {
		assertEquals(9d, arroz.getPrecio());
	}
	
}

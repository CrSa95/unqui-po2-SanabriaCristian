package ar.edu.unq.po2.Supermercado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2d, leche.getPrecio());
	}
}

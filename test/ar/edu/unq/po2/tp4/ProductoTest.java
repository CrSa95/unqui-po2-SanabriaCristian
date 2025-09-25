package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
	
	private ProductoDeCooperativa arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoDeCooperativa(10d, 2);
		vino = new Producto(60d, 2);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(9d, arroz.getPrecio());
		assertEquals(2, arroz.getStock());
		
		assertEquals(60d, vino.getPrecio());
		assertEquals(2, vino.getStock());
	}
	
	@Test
	public void testModificarPrecio() {
		arroz.modificarPrecio(15d);
		assertEquals(13.5d, arroz.getPrecio());
		
		vino.modificarPrecio(50d);
		assertEquals(50d, vino.getPrecio());
	}
	
	@Test
	public void testDecrementarStock() {
		arroz.decrementarStock(2);;
		assertEquals(0, arroz.getStock());
		
		vino.decrementarStock(1);;
		assertEquals(1, vino.getStock());
	}
}

package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaTest {
	
	private FacturaImpuesto impuesto;
	private FacturaServicio servicio;
	private ProductoDeCooperativa arroz;
	private Producto vino;
	private Caja caja;
	
	@BeforeEach
	public void setUp() {
		impuesto = new FacturaImpuesto(10,100);
		servicio = new FacturaServicio(200);
		arroz = new ProductoDeCooperativa(10d, 2);
		vino = new Producto(60d, 2);
		caja = new Caja();
	}
	
	@Test
	public void testRegistrarProducto() {
		assertEquals(0, caja.getMontoTotal());
		caja.registrarProducto(arroz);
		caja.registrarProducto(vino);
		caja.registrarProducto(impuesto);
		caja.registrarProducto(servicio);
		assertEquals(1269d, caja.getMontoTotal());
		assertEquals(1, arroz.getStock());
		assertEquals(1, vino.getStock());
	}
	
	@Test
	public void testObtenerElTotal() {
		assertEquals(0, caja.getMontoTotal());
		caja.registrarProducto(arroz);
		caja.registrarProducto(vino);
		caja.registrarProducto(impuesto);
		caja.registrarProducto(servicio);
		assertEquals(1269d, caja.getMontoTotal());
	}
}

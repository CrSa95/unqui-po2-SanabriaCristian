package ar.edu.unq.po2.tp5.BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {

	private Banco banco;
	private Cliente cliente;
	private Credito creditoPersonal;
	
	@BeforeEach
	public void setUp() {
		banco = new Banco();
		cliente = new Cliente("Cristian","Sanabria","Calle 43",30);
		creditoPersonal = new CreditoPersonal(12,2000000d);
		creditoPersonal.setCliente(cliente);
		cliente.setSueldoNetoMensual(1000000d);
	}
	
	@Test
	public void testAgregarCliente() {
		assertEquals(0, banco.getClientes().size());
		banco.agregarCliente(cliente);
		assertEquals(1, banco.getClientes().size());
	}
	
	@Test
	public void testRegistrarSolicitudDeCredito() {
		assertEquals(0, banco.getCreditos().size());
		banco.registrarSolicitudDeCredito(creditoPersonal);
		assertEquals(1, banco.getCreditos().size());
	}
	
	@Test
	public void testEvaluarCredito() {
		assertEquals(0, banco.getCreditosAprobados().size());
		banco.registrarSolicitudDeCredito(creditoPersonal);
		banco.evaluarCreditos();
		assertEquals(1, banco.getCreditosAprobados().size());
	}

	@Test
	public void testMontoTotalDeCreditos() {
		banco.registrarSolicitudDeCredito(creditoPersonal);
		banco.evaluarCreditos();
		assertEquals(2000000d, banco.montoTotalDeCreditos());
	}
	
	@Test
	public void testTransferirACliente() {
		banco.registrarSolicitudDeCredito(creditoPersonal);
		banco.evaluarCreditos();
		banco.transferirCreditosAprobados();
		assertEquals(2000000d, cliente.getDinero());
	}
}

package ar.edu.unq.po2.tp5.BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
	
	private Banco banco;
	private Cliente cliente;
	private Credito creditoPersonal;
	
	@BeforeEach
	public void setUp() {
		cliente = new Cliente("Cristian","Sanabria","Calle 43",30);
		cliente.setSueldoNetoMensual(1000000);
		banco = new Banco();
		creditoPersonal = new CreditoPersonal(12,2000000d);
	}
	
	@Test
	public void testCalcularSueldoNetoAnual() {
		assertEquals(12000000, cliente.sueldoNetoAnual());
	}
	
	@Test
	public void testRecibirMonto() {
		cliente.recibirMonto(2000000);
		assertEquals(2000000, cliente.getDinero());
	}
	
	@Test
	public void testSolicitarCredito() {
		cliente.solicitarCredito(banco,creditoPersonal);
		banco.evaluarCreditos();
		banco.transferirCreditosAprobados();
		assertEquals(2000000d, cliente.getDinero());
	}
	
}

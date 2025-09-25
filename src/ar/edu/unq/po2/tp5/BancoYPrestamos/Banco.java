package ar.edu.unq.po2.tp5.BancoYPrestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Credito> creditos = new ArrayList<Credito>();
	private List<Credito> creditosAprobados = new ArrayList<Credito>();
	
	public void agregarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clientes.add(cliente);
	}
	
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return this.clientes;
	}

	public List<Credito> getCreditos() {
		// TODO Auto-generated method stub
		return this.creditos;
	}

	public void registrarSolicitudDeCredito(Credito credito) {
		// TODO Auto-generated method stub
		this.creditos.add(credito);
	}

	public List<Credito> getCreditosAprobados() {
		// TODO Auto-generated method stub
		return this.creditosAprobados;
	}

	public void evaluarCreditos() {
		// TODO Auto-generated method stub
		this.creditos.stream()
					 .filter(Credito::evaluarCredito)
					 .forEach(this.creditosAprobados::add);
	}
	
	public void transferirCreditosAprobados() {
		// TODO Auto-generated method stub
		this.creditosAprobados
		.stream()
		.forEach(credito -> {
							 credito.getCliente().recibirMonto(credito.getMontoTotal());
							}
				);
	}

	public Double montoTotalDeCreditos() {
		// TODO Auto-generated method stub
		return this.creditosAprobados
			    .stream()
			    .mapToDouble(Credito::getMontoTotal)
			    .sum();
	}
}

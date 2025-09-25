package ar.edu.unq.po2.tp5.openClosedPrinciple.caso1Arreglado;

import java.util.List;

public interface ProtocoloServidorMail {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);

}

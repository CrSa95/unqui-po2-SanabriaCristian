package ar.edu.unq.po2.Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	String nombre;
	String direccion;
	List<Producto> productos = new ArrayList<Producto>();

	public Supermercado(String nombre, String direccion) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Integer getCantidadDeProductos() {
		// TODO Auto-generated method stub
		return this.productos.size();
	}

	public void agregarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productos.add(producto);
	}

	public Double getPrecioTotal() {
		// TODO Auto-generated method stub
		double total = 0;
		for (Producto current : this.productos) {
			total += current.getPrecio();		
		}
		return total;
	}

}

package domain;

import java.util.List;

public abstract class Consumible {

	private String nombre;
	private Double precio;
	public Consumible(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	

	
	
}

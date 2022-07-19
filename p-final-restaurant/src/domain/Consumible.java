package domain;

import java.util.List;

public abstract class Consumible extends Menu {

	private String nombre;
	private Double precio;
	
	public Consumible(List<Consumible> consumibles, String tipoMenu, String nombre, Double precio) {
		super(consumibles, tipoMenu);
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

package domain;

import java.util.List;

public class Plato extends Consumible{
	

	private String descripcion;
	private static Boolean aptoVegano;
	private static Boolean aptoCeliaco;
	

	public Plato(String nombre, Double precio, String descripcion, Boolean aptoVegano, Boolean aptoCeliaco) {
		super(nombre, precio);
		this.descripcion = descripcion;
		this.aptoVegano = aptoVegano;
		this.aptoCeliaco = aptoCeliaco;
	

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static Boolean getAptoVegano() {
		return aptoVegano;
	}

	public void setAptoVegano(Boolean aptoVegano) {
		this.aptoVegano = aptoVegano;
	}

	public static Boolean getAptoCeliaco() {
		return aptoCeliaco;
	}

	public void setAptoCeliaco(Boolean aptoCeliaco) {
		this.aptoCeliaco = aptoCeliaco;
	}

	public void setPlato(String nombre, Double precio, String descripcion, Boolean aptoVegano, Boolean aptoCeliaco) {
		nombre=nombre;
		precio=precio;
		this.descripcion=descripcion;
		this.aptoVegano=aptoVegano;
		this.aptoCeliaco=aptoCeliaco;
	}

	
}

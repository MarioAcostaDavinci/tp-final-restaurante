package domain;

import java.util.List;

public class Plato extends Consumible{
	

	private String descripcion;
	private Boolean aptoVegano;
	private Boolean aptoCeliaco;
	public Plato(List<Consumible> consumibles, String tipoMenu, String nombre, Double precio, String descripcion,
			Boolean aptoVegano, Boolean aptoCeliaco) {
		super(consumibles, tipoMenu, nombre, precio);
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
	public Boolean getAptoVegano() {
		return aptoVegano;
	}
	public void setAptoVegano(Boolean aptoVegano) {
		this.aptoVegano = aptoVegano;
	}
	public Boolean getAptoCeliaco() {
		return aptoCeliaco;
	}
	public void setAptoCeliaco(Boolean aptoCeliaco) {
		this.aptoCeliaco = aptoCeliaco;
	}
	


}

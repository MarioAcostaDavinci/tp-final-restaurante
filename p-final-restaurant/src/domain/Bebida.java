package domain;

import java.util.List;

public class Bebida extends Consumible{
	
	
	private Double tamanioCc;
	private Boolean alcohol;
	
	public Bebida(String nombre, Double precio, Double tamanioCc, Boolean alcohol) {
		super(nombre, precio);
		this.tamanioCc = tamanioCc;
		this.alcohol = alcohol;
	}

	public Double getTamanioCc() {
		return tamanioCc;
	}

	public void setTamanioCc(Double tamanioCc) {
		this.tamanioCc = tamanioCc;
	}

	public Boolean getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(Boolean alcohol) {
		this.alcohol = alcohol;
	}
	



}

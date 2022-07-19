package domain;

import java.util.List;

public class Bebida extends Consumible{
	
	
	private Double tamanioCc;
	private Boolean alcohol;
	
	public Bebida(List<Consumible> consumibles, String tipoMenu, String nombre, Double precio, Double tamanioCc,
			Boolean alcohol) {
		super(consumibles, tipoMenu, nombre, precio);
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

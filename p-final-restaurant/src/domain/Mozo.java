package domain;

import java.util.ArrayList;
import java.util.List;

public class Mozo extends Empleado{
	

	protected String tipoDeMozo;
	
	List <Mesa> mesas = new ArrayList<Mesa>();

	public Mozo(String nombre, Integer legajo, String fechaDeIngreso, String tipoDeMozo, List<Mesa> mesas) {
		super(nombre, legajo, fechaDeIngreso);
		this.tipoDeMozo = tipoDeMozo;
		this.mesas = mesas;
	}

	public String getTipoDeMozo() {
		return tipoDeMozo;
	}

	public void setTipoDeMozo(String tipoDeMozo) {
		this.tipoDeMozo = tipoDeMozo;
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}
	
	
	
}

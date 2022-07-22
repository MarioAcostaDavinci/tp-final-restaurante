package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class salon {
	
	static List<Menu> menues = new ArrayList<Menu>();
	List<Mesa> mesas = new ArrayList<Mesa>();
	List<Empleado> empleados = new ArrayList<Empleado>();
	List<Comanda> comandas = new ArrayList<Comanda>();

	public salon(List<Menu> menues, List<Mesa> mesas, List<Empleado> empleados, List<Comanda> comandas) {
		super();
		this.menues = menues;
		this.mesas = mesas;
		this.empleados = empleados;
		this.comandas = comandas;
	}

	public static List<Menu> getMenues() {
		return menues;
	}

	public void setMenues(List<Menu> menues) {
		this.menues = menues;
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}



}

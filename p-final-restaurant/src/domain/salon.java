package domain;

import java.util.ArrayList;
import java.util.List;


public class Salon {
	
	static List<Menu> menues = new ArrayList<Menu>();
	static List<Mesa> mesas = new ArrayList<Mesa>();
	static List<Empleado> empleados = new ArrayList<Empleado>();
	static List<Comanda> comandas = new ArrayList<Comanda>();

	public Salon(List<Menu> menues, List<Mesa> mesas, List<Empleado> empleados, List<Comanda> comandas) {
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

	public static List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}

	public static List<Empleado> getEmpleados() {
		return empleados;
	}

	public static void setEmpleados(List<Empleado> empleados) {
		Salon.empleados = empleados;
	}

	public static List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}



}

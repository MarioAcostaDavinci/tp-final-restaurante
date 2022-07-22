package domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private static List<Consumible> consumibles = new ArrayList<Consumible>();
	
	private String tipoMenu;

	public Menu(List<Consumible> consumibles, String tipoMenu) {
		super();
		this.consumibles = consumibles;
		this.tipoMenu = tipoMenu;
	}

	public static List<Consumible> getConsumibles() {
		return consumibles;
	}

	public void setConsumibles(List<Consumible> consumibles) {
		this.consumibles = consumibles;
	}

	public String getTipoMenu() {
		return tipoMenu;
	}

	public void setTipoMenu(String tipoMenu) {
		this.tipoMenu = tipoMenu;
	}
	
	
	

	
	
	
	
}

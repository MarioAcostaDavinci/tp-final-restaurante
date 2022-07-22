package service;

import domain.Menu;
import domain.salon;
import domain.Consumible;
import domain.Plato;
import java.util.ArrayList;
import java.util.List;



public class MenuService {

	
	public ConsumibleService menuService(ConsumibleService consumibleService) {
		return new ConsumibleService();
	}
	
	public List<Menu> crear(List<Menu> menues) {
		return  menues=new ArrayList<Menu>(menues);
		
	}
	
	public void agregarConsumible(List<Menu> menues,List<Consumible> consumibles) {
		menues.add((Menu) consumibles);
	}
	
	public void borrarConsumible(List<Menu> menues,List<Consumible> consumibles) {
		menues.remove((Menu) consumibles);
	}
	public Menu obtenerBebidas(List<Menu> menues) {
		for(Menu bebidas:salon.getMenues()) {
			if(bebidas!=null) {
				return bebidas;
			}
		}
		return null;
		
	}
	public Menu obtenerPlatos(List<Menu> menues) {
		for(Menu platos:salon.getMenues()) {
			if(platos!=null) {
				return platos;
			}
		}
		return null;
		
	}
	public void obtenerTipoMenu(String nombre,String tipoMenu,List<Menu> menues ) {
			obtenerPlatos(menues);
				if(Plato.getAptoVegano()==true){
					tipoMenu="vegano";
						System.out.println("el menu es del tipo: "+tipoMenu);
				} else if (Plato.getAptoCeliaco()==true) {
						tipoMenu="celiaco";
						System.out.println("el menu es del tipo: "+tipoMenu);
				}else {tipoMenu="tradicional";	
						System.out.println("el menu es del tipo: "+tipoMenu);
		}
	}
}

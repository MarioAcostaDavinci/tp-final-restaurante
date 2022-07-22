package service;
import domain.Consumible;
import domain.Plato;
import java.util.List;
import domain.Bebida;
import domain.Menu;


public class ConsumibleService {
	
	
	public Plato buscarPlatoXnombre(String nombre) {
		
		for(Consumible plato:Menu.getConsumibles()) {
		if(plato!=null && plato.getNombre().equalsIgnoreCase(nombre)) {
			return (Plato) plato ;
		}
		}
		return null;
	}

	public Bebida buscarBebidaXnombre(String nombre) {
		
		for(Consumible bebida:Menu.getConsumibles()) {
		if(bebida!=null && bebida.getNombre().equalsIgnoreCase(nombre)) {
			return (Bebida) bebida ;
		}
		}
		return null;
	}
	public void crearPlato(String nombre,Double precio,String descripcion,Boolean aptoVegano,Boolean aptoCeliaco,List<Consumible> consumibles) {
		for(Consumible plato:Menu.getConsumibles()) {
			if(plato!=null) {
			plato= new Plato(nombre,precio, descripcion, aptoVegano,aptoCeliaco);
			consumibles.add(plato);
			}
		}
		}
	
	public void crearBebida(String nombre,Double precio,Double tamanioCc,Boolean alcohol,List<Consumible> consumibles) {
		for(Consumible bebida:Menu.getConsumibles()) {
			if(bebida!=null) {
			bebida= new Bebida(nombre,precio,tamanioCc,alcohol);
			consumibles.add(bebida);
			}
	}
	}
	public void modificarPlato(String nombre,Double precio,String descripcion,Boolean aptoVegano,Boolean aptoCeliaco) {
			buscarPlatoXnombre(nombre).setPlato(nombre, precio, descripcion, aptoVegano, aptoCeliaco);
		}
	

	public void borrarPlato(String nombre,Double precio,String descripcion,Boolean aptoVegano,Boolean aptoCeliaco,List<Consumible> consumibles) {
		consumibles.remove(buscarPlatoXnombre(nombre));
	}
	public void borrarBebida(String nombre,Double precio,Double tamanioCc,Boolean alcohol,List<Consumible> consumibles) {
		consumibles.remove(buscarBebidaXnombre(nombre));
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	

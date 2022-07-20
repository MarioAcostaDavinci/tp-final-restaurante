package service;
import domain.Consumible;
import domain.Plato;
import domain.Bebida;



public class ConsumibleService {
	
	
	public Plato crearPlato(String nombre,Double precio,String descripcion,Boolean aptoVegano,Boolean aptoCeliaco) {
		return new Plato(nombre,precio, descripcion, aptoVegano,aptoCeliaco);
	}
	
	public Bebida crearBebida(String nombre,Double precio,Double tamanioCc,Boolean alcohol) {
		return new Bebida(nombre,precio,tamanioCc,alcohol);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

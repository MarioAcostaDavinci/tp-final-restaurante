package service;
import domain.Mesa;

public class MesaService {

	public Mesa crear(Integer numero, Integer cantidadDeComensales) {
		return new Mesa(numero, cantidadDeComensales);
	}

	public void ocupar(Mesa mesa) {
		mesa.setOcupado(true);
	}

	public void liberar(Mesa mesa) {
		mesa.setOcupado(false);
	}

	public boolean estado(Mesa mesa) {
		return mesa.isOcupado();
	}

	public void mostrar(Mesa mesa) {
		StringBuilder str = new StringBuilder();
		str.append("Mesa");
		str.append("\n");
		str.append("número : ");
		str.append(mesa.getNumero());
		str.append("\n");
		str.append("cantidad comensales: ");
		str.append(mesa.getCantidadDeComensales());
		str.append("\n");
		str.append("ocupada: ");
		str.append(mesa.isOcupado());
		str.append("\n");
		System.out.println(str.toString());
	}	
	
	
	
	
}

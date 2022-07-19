package domain;

public class Cheff extends Empleado{

	private Boolean titulo;

	public Cheff(String nombre, Integer legajo, String fechaDeIngreso, Boolean titulo) {
		super(nombre, legajo, fechaDeIngreso);
		this.titulo = titulo;
	}

	public Boolean getTitulo() {
		return titulo;
	}

	public void setTitulo(Boolean titulo) {
		this.titulo = titulo;
	}


	
	
}

package domain;

public class Mesa {
	
	private Integer numero;
	private Integer cantidadDeComensales;
	private Boolean estado;
	
	public Mesa(Integer numero, Integer cantidadDeComensales, Boolean estado){
		
		this.numero = numero;
		this.cantidadDeComensales = cantidadDeComensales;
		this.estado = estado;
		
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getCantidadDeComensales() {
		return cantidadDeComensales;
	}
	public void setCantidadDeComensales(Integer cantidadDeComensales) {
		this.cantidadDeComensales = cantidadDeComensales;
	}
	public Boolean getEstado() {
		return estado;
	}
	
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	
	
	

}

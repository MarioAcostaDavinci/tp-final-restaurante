package domain;

public class Cocinero extends Empleado{
	
	
	private Integer yearsDeExperiencia;

	public Cocinero(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia) {
		super(nombre, legajo, fechaDeIngreso);
		this.yearsDeExperiencia = yearsDeExperiencia;
	}

	public Integer getYearsDeExperiencia() {
		return yearsDeExperiencia;
	}

	public void setYearsDeExperiencia(Integer yearsDeExperiencia) {
		this.yearsDeExperiencia = yearsDeExperiencia;
	}


}

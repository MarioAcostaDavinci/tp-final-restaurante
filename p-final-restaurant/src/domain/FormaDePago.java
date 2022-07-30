package domain;

public enum FormadePago {

	EFECTIVO("efectivo"),TARJETA("tarjeta"),DEBITO("debito");
	
	private String formaDePago;

	private FormadePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	
	
	
}

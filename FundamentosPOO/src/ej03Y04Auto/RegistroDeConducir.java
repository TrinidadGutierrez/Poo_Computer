package ej03Y04Auto;

public class RegistroDeConducir {
	private String nroRegistro;

	public RegistroDeConducir(String nroRegistro) {
		this.setNroRegistro(nroRegistro);
	}

	public String getNroRegistro() {
		return nroRegistro;
	}

	private void setNroRegistro(String nroRegistro) {
		this.nroRegistro = nroRegistro;
	}

	@Override
	public String toString() {
		return "RegistroDeConducir [nroRegistro=" + nroRegistro + "]";
	}

}


package ej01_TelefonoMovil;

public class TelefonoMovil {
	private String marca;
	private boolean encendido;

	public TelefonoMovil(String Marca) {
		setMarca(marca);
		this.encendido = false;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	private void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public boolean getEncendido() {
		return encendido;
	}

	public void llamar(int numero) {
		if (encendido) {
			System.out.println(" Estoy llamando a " +numero );
			
		}else {
			System.out.println(" Esta apagado");
		}

	}
	public void prender() {
		
	
	if(!encendido) {
		setEncendido(true);
	}
	}
	@Override 
	public String toString() {
		return marca + " " +encendido;
	}
}

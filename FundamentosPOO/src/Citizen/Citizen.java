package Citizen;

public class Citizen {
	/**
	* Representa a una persona con solo lo necesario para poder ubicarla por nombre
	* completo.
	*/

	private String nombre;
	private String apellido;
	public Citizen() { 
	nombre = "";
	apellido = "";
	}
	public void ponerNombre(String valor) {
	nombre = valor;
	}
	public void ponerApellido(String valor) {
	apellido = valor;
	}
	public String obtenerNombreCompleto() {
	return nombre + " " + apellido;
	}
	}


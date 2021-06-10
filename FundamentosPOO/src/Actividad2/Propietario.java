package Actividad2;

import ej02_Compumundo.Computadora;

public class Propietario {
	private String nombre;
	private String apellido;
	private String dni;
	private Computadora computadora;


	public Propietario(String nombre,String apellido,String dni,Computadora computadora ) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
		setComputadora(computadora);
	}

	
	public void trabajar() {
		
	}
	public void descansar() {
		
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDNI() {
		return dni;
	}
	private void setDNI(String dNI) {
		dni = dNI;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + dni + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getdni()=" + getDNI();
	
	}	
}

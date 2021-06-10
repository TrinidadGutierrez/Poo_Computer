package ej02_Compumundo;

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

	public String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	public Computadora getComputadora() {
		return computadora;
	}

	private void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}

	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", computadora="
				+ computadora + "]";
	}

}

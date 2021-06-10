package Persona;

public class Persona {
	
	//ATRIBUTOS 
	private String nombre;
	private String apellido;
	
	//CONSTRUCTOR
	public Persona(String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
		
	}
	
	/**
	 * Retorna el nombre de la Persona
	 * @return
	 * 		String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Asigna un texto al nombre de la Persona, mientras no este vacio
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		if(!nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Retorna el apellido de la Persona
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Asigna un texto al apellido de la Persona, mientras no este vacío
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		if(!apellido.isEmpty()) {
			this.apellido = apellido;
		}
	}
	
	/**
	 * Devuelve el nombre completo de la Persona
	 * @return
	 * 		String
	 */
	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}
}




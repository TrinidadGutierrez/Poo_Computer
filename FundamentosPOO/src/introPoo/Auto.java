package introPoo;

public class Auto {
	public String patente;
	public String color;
	public Double velMaxima;
	public Double velActual;
	
	void mostrarDatos() {//metodo
		System.out.println(patente);
		System.out.println(color);
		System.out.println(velMaxima);
		System.out.println(velActual);
	}
	String dameTuColor() {//Metodo 
		return color;
	}
	void cambiarColor (String nuevoColor) {
		color= nuevoColor;
	}
}

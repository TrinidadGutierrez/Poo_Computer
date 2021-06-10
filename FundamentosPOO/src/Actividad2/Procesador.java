package Actividad2;

public class Procesador {
	
	final static double TEMP_MAXIMA=100;
	
	
	public Procesador(String marca, String modelo, double tempActual) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tempActual = tempActual;
	}
	private String marca, modelo;
	private double tempActual;
	public String getMarca() {
		return marca;
	}
	private void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", tempActual=" + tempActual + "]";
		
	}

}

package ej02_Compumundo;

public class Procesador {
	private final int NIVEL_MINIMO =30;
	private final int NIVEL_CRITICO=120;
	
	private String marca;
	private String modelo;
	private int nivelTemperatura;
	
	
	//Defino constructor
	public  Procesador(String marca,String modelo, int nivelTemperatura) {
		setMarca(marca);
		setModelo(modelo);
		setNivelTemperatura(nivelTemperatura);
		
	}
	
	public String getMarca() {
		return marca;
	} 
	private void setMarca (String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	private void setModelo(String modelo) {
		this.modelo=modelo;
		
	}
	public int getNivelTemperatura() {
		return nivelTemperatura;
	}

	private void setNivelTemperatura(int nivelTemperatura) {
		// Defino nivel minimo para la temperartura
		if (nivelTemperatura < NIVEL_MINIMO) {
			this.nivelTemperatura = NIVEL_MINIMO;
		} else {
			this.nivelTemperatura = nivelTemperatura;
			verificarNivel();
		}
	}
	// metodo del procesador para verificar el nivel  de temperatura 
	// No recibe parametros porque lo conozco ya que esta dentro de la clase procesador
	private void verificarNivel() {
		if (nivelTemperatura >= NIVEL_CRITICO) {
			System.out.println(" ALERTA, TEMPERATURA CRITICA");
		
		}
	}
	@Override
	public String toString() {
		return "procesador [NIVEL_MINIMO=" + NIVEL_MINIMO + ", NIVEL_CRITICO=" + NIVEL_CRITICO + ", marca=" + marca
				+ ", modelo=" + modelo + ", nivelTemperatura=" + nivelTemperatura + "]";
	}
}
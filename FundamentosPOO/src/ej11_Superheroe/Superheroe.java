package ej11_Superheroe;

public class Superheroe {
	private final int VALOR_MINIMO = 0;
	private final int VALOR_MAXIMO = 100;
	
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	//COPNSTRUCTOR DE LOS SETTERS
	
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		// LLAMO A LOS SETTERS
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}
	// GETTERS Y SETTERS DE TODOS LOS ATRIBUTOS
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getFuerza() {
		return fuerza;
	}
	
	private void setFuerza(int fuerza) {
		if(fuerza < VALOR_MINIMO) {
			this.fuerza = VALOR_MINIMO;
		}
		else if (fuerza > VALOR_MAXIMO) {
			this.fuerza = VALOR_MAXIMO;
		}
		else {
			this.fuerza = fuerza;
		}
	}
	
	public int getResistencia() {
		return resistencia;
	}
	
	private void setResistencia(int resistencia) {
		if(resistencia < VALOR_MINIMO) {
			this.resistencia = VALOR_MINIMO;
		}
		else if (resistencia > VALOR_MAXIMO) {
			this.resistencia = VALOR_MAXIMO;
		}
		else {
			this.resistencia = resistencia;
		}
	}
	
	public int getSuperpoderes() {
		return superpoderes;
	}
	
	private void setSuperpoderes(int superpoderes) {
		if(superpoderes < VALOR_MINIMO) {
			this.superpoderes = VALOR_MINIMO;
		}
		else if (superpoderes > VALOR_MAXIMO) {
			this.superpoderes = VALOR_MAXIMO;
		}
		else {
			this.superpoderes = superpoderes;
		}
	}
	
	private int procesarRonda(int poderPropio, int poderRival) {
		int resultado;
		
		if(poderPropio > poderRival) {
			resultado = 1;
		}
		else if(poderPropio < poderRival) {
			resultado = -1;
		}
		else {
			resultado = 0;
		}
		return resultado;
	}
	// METODO PRINCIPAL				recibo otro superHeroe
	public ResultadoCompetir competir(Superheroe rival) {
		ResultadoCompetir resultado;
		
		int contador = 0;
		contador += procesarRonda(this.fuerza, rival.fuerza);
		contador += procesarRonda(this.resistencia, rival.resistencia);
		contador += procesarRonda(this.superpoderes, rival.superpoderes);
		
		if(contador > 0) {
			resultado = ResultadoCompetir.TRIUNFO;
		}
		else if (contador == 0) {
			resultado = ResultadoCompetir.EMPATE;
		}
		else {
			resultado = ResultadoCompetir.DERROTA;
		}
		
		return resultado;
	}
	
	
	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
	
}




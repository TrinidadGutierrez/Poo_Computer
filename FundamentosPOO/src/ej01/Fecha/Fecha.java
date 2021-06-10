package ej01.Fecha;

public class Fecha {

	private final int DIA_MINIMO = 1;
	private final int DIA_MAXIMO = 31;
	private final int MES_MINIMO = 1;
	private final int MES_MAXIMO = 12;
	private final int ANIO_MINIMO = 1900;
	private final int ANIO_MAXIMO = 2100;
	
	// constructor
	private int dia;
	private int mes; 
	private int anio;
	
	/**
	 * Constructor de Fecha
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	public Fecha(int dia, int mes, int anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}
	
	/**
	 * Obtiene el dia de la Fecha
	 * @return
	 */
	public int getDia() {
		return dia;
	}
	
	/**
	 * Setea el dia de la fecha
	 * @param dia
	 */
	private void setDia(int dia) {
		if(dia < DIA_MINIMO) { // Lo obligo a que 
			this.dia = DIA_MINIMO; //el dia sea 1
		}else if(dia > DIA_MAXIMO) {
			this.dia = DIA_MAXIMO;
		}else { //Sino seteo el dia como lo venia haciendo
			this.dia = dia;
		}
	}
	
	/**
	 * Obtiene el mes de la Fecha
	 * @return
	 */
	public int getMes() {
		return mes;
	}
	
	/**
	 * Setea el mes de la Fecha
	 * @param mes
	 */
	private void setMes(int mes) {
		if(mes < MES_MINIMO) {
			this.mes = MES_MINIMO;
		}else if (mes > MES_MAXIMO) {
			this.mes = MES_MAXIMO;
		}else {
			this.mes = mes;
		}
	}
	
	/**
	 * Obtiene el anio de la Fecha
	 * @return
	 */
	public int getAnio() {
		return anio;
	}
	
	private void setAnio(int anio) {
		if(anio < ANIO_MINIMO) {
			this.anio = ANIO_MINIMO;
		}else if (anio > ANIO_MAXIMO) {
			this.anio = ANIO_MAXIMO;
		}else {
			this.anio = anio;
		}
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}
	

}

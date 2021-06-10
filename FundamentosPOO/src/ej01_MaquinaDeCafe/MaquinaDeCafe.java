package ej01_MaquinaDeCafe;

public class MaquinaDeCafe {
	
	private int nivelAgua;
	private int cantidadVasos;
	private boolean prendida;
	
	public  MaquinaDeCafe(int cantidadVasos,int nivelAgua)
	{
		setCantidadVasos(cantidadVasos);
		setNivelAgua(nivelAgua);
		setPrendida(false);
	}

	public void setPrendida(boolean prendida) {
		this.prendida=prendida;
	}
	public int getCantidadVasos() {
		return cantidadVasos;
	}
	public int getNivelAgua() {
		return nivelAgua;
	}

	public void setNivelAgua(int nivelAgua) {
		this.nivelAgua = nivelAgua;
	}

	public boolean isPrendida() {
		return prendida;
	}

	public void setCantidadVasos(int cantidadVasos) {
		//validar cantidad de vasos >0;
		this.cantidadVasos = cantidadVasos;
	}

	public int getNivelDeAgua() {
		return  nivelAgua;
	}
	private void setNivelDeAgua (int nivelAgua) {
		
	
		if( nivelAgua<0)
		{
			this.nivelAgua=0;	
		}
		if(nivelAgua>100)
		{
			 nivelAgua =100;
		}
		else this.nivelAgua = nivelAgua;
	}
	public boolean prepararInfusion() {
		boolean sePudoPreparar=false;
		if(prendida) {
			if(nivelAgua >0 && cantidadVasos >0)
			{
				nivelAgua--;
				cantidadVasos--;
				System.out.println( " infusion lista");
				sePudoPreparar = true;
			}else
				System.out.println( " Registrar si falta cafe, agua o vasos");
			
			}
		return sePudoPreparar;
		}
		public void prender() {
			if(!prendida)
				prendida = true;
		}
		public void  apagar() {
			if(prendida)
				prendida = false;
		}
	}



package Actividad2;

public class LectoraDVD {

	private String marca;
	private boolean puedeGrabar = false;
	
	public LectoraDVD(String marca, boolean puedeGrabar) {
	
		setMarca(marca);
		setPuedeGrabar (puedeGrabar);
	}
	
	public String getMarca() {
		return marca;
	}
	private void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isPuedeGrabar() {
		return puedeGrabar;
	}
	
	
	private void setPuedeGrabar(boolean puedeGrabar) {
		this.puedeGrabar = puedeGrabar;
	}
	@Override
	public String toString() {
		return "LectoraDVD [marca=" + marca + ", puedeGrabar=" + puedeGrabar + "]";
	} 
}

package ej02_Compumundo;

public class LectoraDVD {
	
	public LectoraDVD(String marca, boolean puedeGrabar) {
		setMarca(marca);
		setPuedeGrabar(puedeGrabar);
	}
	
	private String marca;
	private boolean puedeGrabar;
	
	//GETTER
	public String getMarca() {
		return marca;
	}
	//SETTER (Puede tener logica adentro)
	private void setMarca(String marca) {
		this.marca =marca;
	}
	
	public boolean getPuedeGrabar() {
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

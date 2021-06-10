package ej02_Compumundo;

public class Computadora {
	private String marca;
	private TipoComputadora tipo;
	private Procesador procesador;// La computadora tiene un atributo de tipo procesador (Que adento tiene , marca// modelo y nivel de temperatura)
	private LectoraDVD lectoraDVD;
	
	public Computadora(String marca,TipoComputadora tipo,Procesador procesador) {
	setMarca(marca);
	setTipo(tipo);
	setProcesador(procesador);
	
	}
	//constructor de la lectora de DVD porque una computadora puede o NO tener una grabadora de DVD
	public Computadora(String marca,TipoComputadora tipo,Procesador procesador,LectoraDVD lectoraDVD) {
		this(marca,tipo,procesador);//Seteo a las clases marca, tipoComputadora y procesador 
		// Es lo mismo que hacer ESTO
		/*setMarca(marca);
		setTipo(tipo);
		setProcesador(procesador);*/
		setLectoraDVD (lectoraDVD);
	}
	
	public String getMarca(){
		return marca;
		
	}
	private void setMarca(String marca) {
	this.marca =marca;
	}
	
	public TipoComputadora getTipo() {
		return tipo;
	}
	private void setTipo(TipoComputadora  tipo) {
		this.tipo =tipo;
		
	}
	public Procesador getProcesador () {
		return procesador;
	}
	private  void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	
	public LectoraDVD getLectoraDVD() {
		return lectoraDVD;
	}
	private  void setLectoraDVD(LectoraDVD lectoraDVD) {
		this.lectoraDVD = lectoraDVD;
	}
	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", tipo=" + tipo + ", procesador=" + procesador + ", lectoraDVD="
				+ lectoraDVD + "]";
	}
	
}


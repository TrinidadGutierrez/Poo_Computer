package introPoo;

public class Principal {

	public static void main(String[] args) {
		Auto a = new Auto ();
		Auto b= new Auto();
	
	
		a.cambiarColor("Azul");
		b.cambiarColor("Blanco");
		System.out.println(a);
		System.out.println(b);
		a.mostrarDatos();
		b.mostrarDatos();
		
	}

}

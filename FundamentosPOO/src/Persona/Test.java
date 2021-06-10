package Persona;

public class Test {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Ezequiel","Binker");
		Persona p2 = new Persona("Luciano","Gobo");
		
		System.out.println(p1.getNombreCompleto());
		System.out.println(p2.getNombreCompleto());
	
		//System.out.println(p1);
		//System.out.println(p2);
	}

}


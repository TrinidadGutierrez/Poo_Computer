package Citizen;

public class Test {

		public static void main(String[] args) {
			Citizen unaPersona = new Citizen();
			System.out.println("El nombre de la persona es " + unaPersona.obtenerNombreCompleto());
			unaPersona.ponerNombre("Hortencio");
			unaPersona.ponerApellido("Ortega");
	}

}

package Ej08_DandoTurnos;

public class Turnera {

	private static int turno = 0;

	public static int otorgarProximoNumero() {
		return ++turno;
	}

	public static void verUltimoNumeroOtorgado() {
		System.out.println("Ultimo turno otorgado: " + turno);
	}

	public static void resetearContador() {
		resetearContador(0);
	}

	public static void resetearContador(int i) {
		if (i>=0) turno = i;
	}
	
}
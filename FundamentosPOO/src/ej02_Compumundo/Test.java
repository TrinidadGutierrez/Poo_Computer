package ej02_Compumundo;

public class Test {

	public static void main(String[] args) {
		
		Procesador miProcesador= new Procesador( "hynthel", "Y7",150);
		LectoraDVD miLectoraDVD= new LectoraDVD(" Pionner",true);
		LectoraDVD miLectoraDVD2=new LectoraDVD(" Kingston",true);
		
		Computadora compu1= new Computadora(" Hibeeme ",TipoComputadora.DESKTOP,miProcesador);
		Computadora compu2= new Computadora("Azuz",TipoComputadora.LAPTOP,miProcesador,miLectoraDVD);// Invoca al constructor que tiene grabadora de DVD
		
		Propietario prop1 =new Propietario(" Helon", "Mask", "12345678",compu1);
		Propietario prop2 =new Propietario(" Shef", "Vezoz", "12311111",compu2);
		

		System.out.println(prop1);
		System.out.println(prop2);
	}

}

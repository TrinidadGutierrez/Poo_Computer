import java.util.ArrayList;

public class Teoria {
	
	//Primitivos --> int, boolean char, double, float
	//NO son primitivos --> String Integer Boolean, double
	//Declaracion de variables u Objetos
	//TipoDeDato nombre;
	
	ArrayList<Integer>lista;
	lista = new Arraylist<>();
	
	lista.add(10);
	lista.add(50);
	lista.add(100);
	lista.add(400);
	
	lista.add(0,100);
	
	palabras.add(" Hola");
	palabras.add(" Como ");
	palabras.add(" Estas");
	
	//----GET (Obtengo el valor de un elemento de la lista), siempre devuelve el tipo de dato de la lista----//
	//System.out.println(lista.get(0);
	
	//----REMOVE (Borra un nodo de la lista)----------//
	//Puedo borrar por posicion
	
	int eliminado = lista.remove(0);
	
	// Puedo borrar un elemnto, pero en lista lista de tipo Integer NO se puede
	//lista.remove (400);
	
	palabras.remove(" Hola");
	palabras.remove(1);
	
	System.out.println(eliminado);
	
	//SIZE -INT- Obtiene la cantida de elementos que tiene la lista
	
	System.out.println(palabras.size);
	
	//-----SET Modifica un elemnto completo de la lista)-----//
	
	System.out.println(lista);
	lista.set(2,3000);
	System.out.println(lista);
	
	
	//----RECORRER FORMA COMPLETA DE UN ARRAYLIST ---
	//1. FOR--- Usa indice si necesito ver las posiciones de cada uno de sus elementos
	
	for(int i=0; i< numeros.size();i++) {
		System.out.println(numero.get(i));
	}
	
	//2. FOR EACH ---NO SE PUEDE USAR EL INDICE
	
	for (Integer num: numeros) {
		System.out.println(num);
	}
		
}
}
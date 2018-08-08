package co.edu.udem;

public class Main {

	public static void main(String[] args) throws NoExisteException {
		
		//Crear una nueva lista enlazada. 
		Lista lista = new Lista();
		
		//Insertar varios nodos al comienzo de la lista
		lista.insertarAlComienzo(new Nodo(15));
		lista.insertarAlComienzo(new Nodo(20));
		lista.insertarAlComienzo(new Nodo(30));
		lista.insertarAlComienzo(new Nodo(40));
		
		//Mostrar los elementos de la lista
		lista.mostrarLista();
		System.out.println("-------------");
		
		//Buscar el nodo con el número 80 en su contenido
		Nodo n =lista.buscarNodo(100);
		if(n!=null)
			System.out.println("Nodo " + n.getContenido() + " encontrado");
		else
			System.out.println("Nodo no encontrado");
		System.out.println("-------------");
		
		
		//Mostrar la longitud de la lista
		System.out.println("La longitud de la lista es: " + lista.longitud());
		System.out.println("-------------");
		
		//Mostrar el último nodo de la lista
		Nodo ultimo = lista.localizarUltimo();
		System.out.println("El último elemento de la lista es: " + ultimo.getContenido());
		System.out.println("-------------");
		
		//Localizar el elemento antes de un nodo dado
		Nodo anterior = lista.localizarAnterior(30);
		System.out.println("El nodo anterior al número 30 es: " + anterior.getContenido());
		System.out.println("-------------");
		
		//Insertar despues del nodo con el número 20
		lista.insertarDespuesDe(20, new Nodo(155));
				
		//Mostrar los elementos de la lista
		lista.mostrarLista();
		System.out.println("-------------");
		
		//Insertar al final de la lista
		lista.insertarAlFinal(new Nodo (245));
		
		//Mostrar los elementos de la lista
		lista.mostrarLista();
	}
}

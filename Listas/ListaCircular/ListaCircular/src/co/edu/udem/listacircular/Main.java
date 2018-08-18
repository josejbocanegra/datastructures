package co.edu.udem.listacircular;

import co.edu.udem.listacircular.exceptions.NodoNoExisteException;

public class Main {
	public static void main(String[] args ) throws NodoNoExisteException {
		ListaCircular listaCircular = new ListaCircular();
		listaCircular.insertar(new Nodo(50));
		listaCircular.insertar(new Nodo(150));
		listaCircular.insertar(new Nodo(550));
		listaCircular.insertar(new Nodo(750));
		
		System.out.println("Lista inicial");
		listaCircular.mostrarLista();
	
		
		System.out.println("Después de borrar 50");
		try {
			listaCircular.borrar(50);
		} catch (NodoNoExisteException e) {
			e.printStackTrace();
		}
		listaCircular.mostrarLista();
	}
}

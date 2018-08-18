package co.edu.udem.listacircular;

import co.edu.udem.listacircular.exceptions.NodoNoExisteException;

public class Main {
	public static void main(String[] args ) throws NodoNoExisteException {
		ListaCircular listaCircular = new ListaCircular();
		listaCircular.insertar(new Nodo(50));
		listaCircular.insertar(new Nodo(150));
		listaCircular.insertar(new Nodo(550));
		listaCircular.insertar(new Nodo(750));
		
		listaCircular.mostrarLista();
	
		
		System.out.println("despues de borrar");
		try {
			listaCircular.borrar(50);
			listaCircular.borrar(60);
		} catch (NodoNoExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listaCircular.mostrarLista();
		
	}
}

package co.edu.udem.listadoble;

import co.edu.udem.listadoble.exceptions.NoExisteException;

public class Main {

	public static void main(String[] args) throws NoExisteException {
		// TODO Auto-generated method stub
		ListaDoble listaDoble = new ListaDoble();
		listaDoble.insertarAlComienzo(new Nodo (80));
		listaDoble.insertarAlComienzo(new Nodo (20));
		listaDoble.insertarAlComienzo(new Nodo (30));
		listaDoble.insertarAlComienzo(new Nodo (40));
		
		System.out.println("-Lista incial-");
		listaDoble.mostrarLista();
		
		listaDoble.ordenar();
		//listaDoble.desconectar(20);
		
		System.out.println("------");
		listaDoble.mostrarLista();
	}
}

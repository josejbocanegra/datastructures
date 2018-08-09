package co.edu.udem.listadoble;

public class Main {

	public static void main(String[] args) throws NoExisteException {
		// TODO Auto-generated method stub
		ListaDoble listaDoble = new ListaDoble();
		listaDoble.insertarAlComienzo(new Nodo (10));
		listaDoble.insertarAlComienzo(new Nodo (20));
		listaDoble.insertarAlComienzo(new Nodo (30));
		listaDoble.insertarAlComienzo(new Nodo (40));
		
		System.out.println("-Lista incial-");
		listaDoble.mostrarLista();
		
		
		listaDoble.insertarDespuesDe(20, new Nodo (589));
		
		System.out.println("-Lista después de insertar el nodo 589 después del nodo 20-");
		listaDoble.mostrarLista();
	}
}

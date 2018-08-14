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
		
		
		listaDoble.insertarDespuesDe(10, new Nodo (589));
		
		System.out.println("------");
		listaDoble.mostrarLista();
	}
}

package co.edu.udem.listacircular;

public class Main {
	public static void main(String[] args ) throws InterruptedException {
		ListaCircular listaCircular = new ListaCircular();
		listaCircular.insertar(new Nodo(50));
		listaCircular.insertar(new Nodo(150));
		listaCircular.insertar(new Nodo(550));
		listaCircular.insertar(new Nodo(750));
		
		listaCircular.mostrarLista();
		
		System.out.println("----> "+listaCircular.buscar(150) == null ? "no": "si");
	}
}

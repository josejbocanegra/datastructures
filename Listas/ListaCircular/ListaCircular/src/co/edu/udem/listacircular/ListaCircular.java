package co.edu.udem.listacircular;

public class ListaCircular {
	
	Nodo cabeza = null;

	public Nodo buscar(int contenido) {

		Nodo actual = cabeza;
		
		if (actual != null && actual.getContenido() != contenido) {
			do {
				actual = actual.getSiguiente();
			} while (actual.getContenido() != contenido && actual != cabeza);
			
			return actual == cabeza ? null : actual;
		} 
		else {
			return actual;
		}
	}
	
	public void insertar(Nodo n) {
		if (cabeza != null) {
			n.setSiguiente(cabeza.getSiguiente());
			cabeza.setSiguiente(n);
		}
		else {
			n.setSiguiente(n);
			cabeza=n;
		}
	}
	
	public void mostrarLista() throws InterruptedException {

		Nodo actual = cabeza;
		if (actual != null) {
			do {
				System.out.println(actual.getContenido());
				actual = actual.getSiguiente();
			} while (actual != cabeza);
		}
	}
}

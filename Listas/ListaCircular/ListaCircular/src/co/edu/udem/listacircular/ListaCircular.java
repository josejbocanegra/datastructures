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
	
	public Nodo buscarAnterior(int contenido) {

		Nodo actual = cabeza;
		
		if (actual != null && actual.getSiguiente().getContenido() != contenido) {
			do {
				actual = actual.getSiguiente();
			} while (actual.getSiguiente().getContenido() != contenido && actual != cabeza);
			
			return actual == cabeza ? null : actual;
		} 
		else {
			return actual;
		}
	}
	
	public void borrar(int contenido) {
		
		Nodo actual = buscarAnterior(contenido);
		//Eliminar un nodo cualquiera, que no sea el apuntado por lista.
		
		actual.setSiguiente(actual.getSiguiente().getSiguiente());
		// Eliminar el nodo apuntado por lista, y que no sea el único nodo.
		
		// Eliminar el único nodo de la lista.
		
	}
	public void insertar(Nodo n) {
		
		if (cabeza == null) {
			n.setSiguiente(n);
			cabeza=n;
		}
		else {
			n.setSiguiente(cabeza.getSiguiente());
			cabeza.setSiguiente(n);
		}
	}
	
	public int longitud(){

		Nodo actual = cabeza;
		
		int longitud = 0;
		
		if (actual != null) {
			do {
				longitud++;
				actual = actual.getSiguiente();
			} while (actual != cabeza);
		}
		
		return longitud;
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

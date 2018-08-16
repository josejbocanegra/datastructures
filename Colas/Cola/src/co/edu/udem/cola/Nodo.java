package co.edu.udem.cola;

public class Nodo {
	
	int contenido;
	Nodo siguiente;
	
	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	
	
	public Nodo(int contenido) {
		this.contenido = contenido;
	}
	
}

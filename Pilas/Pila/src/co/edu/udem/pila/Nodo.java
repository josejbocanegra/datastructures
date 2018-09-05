package co.edu.udem.pila;

public class Nodo {
	
	char contenido;
	Nodo siguiente;
	
	public char getContenido() {
		return contenido;
	}

	public void setContenido(char contenido) {
		this.contenido = contenido;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo(char contenido) {
		this.contenido = contenido;
	}
	
}

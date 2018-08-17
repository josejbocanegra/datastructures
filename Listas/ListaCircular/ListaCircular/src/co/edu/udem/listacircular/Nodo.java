package co.edu.udem.listacircular;

public class Nodo {
	
	int contenido;
	Nodo siguiente;
	
	public Nodo(int contenido) {
		this.contenido=contenido;
	}
	
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
	
}

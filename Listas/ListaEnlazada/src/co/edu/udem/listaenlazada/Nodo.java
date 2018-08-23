package co.edu.udem.listaenlazada;

public class Nodo {
	
	int contenido;
	Nodo siguiente;
	
	public Nodo () {
		
	}
	public Nodo (int contenido) {
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
	
	public void insertarDespues(Nodo n) {
		n.siguiente=siguiente;
		siguiente=n;
	}
}

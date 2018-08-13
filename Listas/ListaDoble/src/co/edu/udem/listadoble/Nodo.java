package co.edu.udem.listadoble;

public class Nodo {
	
	int contenido;
	Nodo siguiente;
	Nodo anterior;
	
	
	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
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
}

package co.edu.udem.arboles;

public class Nodo {
	int contenido;
	Nodo izq;
	Nodo der;
	
	public Nodo(int contenido) {
		this.contenido = contenido;
	}

	public int getContenido() {
		return contenido;
	}
	
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
	public Nodo getIzq() {
		return izq;
	}
	
	public void setIzq(Nodo izq) {
		this.izq = izq;
	}
	
	public Nodo getDer() {
		return der;
	}
	
	public void setDer(Nodo der) {
		this.der = der;
	}
}

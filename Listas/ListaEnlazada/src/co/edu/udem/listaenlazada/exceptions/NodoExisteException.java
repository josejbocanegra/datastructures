package co.edu.udem.listaenlazada.exceptions;

public class NodoExisteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8271448289277350184L;

	public NodoExisteException(int contenido) {
		super ("El nodo " + contenido + " ya existe en la lista");
	}
}

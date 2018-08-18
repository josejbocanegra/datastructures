package co.edu.udem.listacircular.exceptions;

public class NodoNoExisteException extends Exception {

	public NodoNoExisteException(int contenido) {
		super("Nodo " + contenido + " no existe");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 8738608792541915996L;

}

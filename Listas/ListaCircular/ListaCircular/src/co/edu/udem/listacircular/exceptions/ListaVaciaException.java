package co.edu.udem.listacircular.exceptions;

public class ListaVaciaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1563235972214681992L;
	
	public ListaVaciaException() {
		super("La lista está vacía");
	}

}

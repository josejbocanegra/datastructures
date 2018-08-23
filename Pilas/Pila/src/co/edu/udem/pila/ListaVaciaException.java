package co.edu.udem.pila;

public class ListaVaciaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5969819049515268849L;

	public ListaVaciaException() {
		System.out.println("La lista está vacía");
	}
}

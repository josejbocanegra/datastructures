package co.edu.udem.cola.exceptions;

public class ColaVaciaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6842667087047832344L;

	public ColaVaciaException() {
		super("la cola esta vacia");
	}
}

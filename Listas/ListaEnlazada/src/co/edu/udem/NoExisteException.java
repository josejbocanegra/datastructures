package co.edu.udem;

public class NoExisteException extends Exception {

	public NoExisteException(int contenido) {
		super ("El elemento con el código " + contenido + "no existe");
	}
}

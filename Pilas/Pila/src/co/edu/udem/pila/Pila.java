package co.edu.udem.pila;

import co.edu.udem.pila.exceptions.ListaVaciaException;

public class Pila {
	Nodo primero;

	public void push(Nodo n) {

		if (isEmpty()) {
			n.setSiguiente(null);
		} else {
			n.setSiguiente(primero);
		}
		primero = n;
	}

	public Nodo peek() throws ListaVaciaException {
		if(!isEmpty())
			return primero;
		else
			throw new ListaVaciaException();
	}

	public Nodo pop() throws ListaVaciaException {
		if (!isEmpty()) {
			Nodo actual = primero;
			primero = primero.getSiguiente();
			return actual;
		}
		else {
			throw new ListaVaciaException();
		}
	}

	public boolean isEmpty() {
		return primero != null ? false : true;
	}
}

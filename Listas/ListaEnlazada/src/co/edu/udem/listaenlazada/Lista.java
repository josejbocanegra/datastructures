package co.edu.udem.listaenlazada;

import co.edu.udem.listaenlazada.exceptions.NoExisteException;
import co.edu.udem.listaenlazada.exceptions.NodoExisteException;

public class Lista {

	Nodo primero;

	public Nodo getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	public Lista intersectar(Lista a, Lista b) {
		Nodo x = a.primero;

		Nodo y = b.primero;
		Lista c = new Lista();
		while (x != null && y != null) {
			if (x.getSiguiente() == null) {
				if (x.getContenido() == y.getContenido()) {
					c.insertarAlComienzo(new Nodo(y.getContenido()));
					x = a.primero;
					y = y.getSiguiente();
				} else if (x.getSiguiente() == null) {
					x = a.primero;

					y = y.getSiguiente();
				}
			} else if (x.getContenido() == y.getContenido()) {
				c.insertarAlComienzo(new Nodo(y.getContenido()));
				x = x.getSiguiente();

			} else {
				x = x.getSiguiente();

			}

		}

		return c;

	}

	public void insertarEnOrden(Nodo n) throws NoExisteException, NodoExisteException {
		if (primero != null) {
			if (buscarNodo(n.getContenido()) == null) {
				if (n.getContenido() < primero.getContenido()) {
					insertarAlComienzo(n);
				} else {
					Nodo actual = primero;
					Nodo siguiente = primero.getSiguiente();
					while (siguiente != null) {
						if (n.getContenido() > actual.getContenido() && n.getContenido() < siguiente.getContenido()) {
							insertarDespuesDe(actual.getContenido(), n);
							break;
						} else {
							actual = siguiente;
							siguiente = siguiente.getSiguiente();
						}
					}
					if (siguiente == null) {
						insertarDespuesDe(actual.getContenido(), n);
					}
				}
			} else {
				throw new NodoExisteException(n.getContenido());
			}
		} else {
			insertarAlComienzo(n);
		}
	}

	// Buscar un elemento
	public Nodo buscarNodo(int contenido) {

		Nodo actual = primero;

		while (actual != null && actual.getContenido() != contenido) {
			actual = actual.getSiguiente();
		}

		return actual;
	}

	// Localizar el último elemento
	public Nodo localizarUltimo() {

		Nodo actual = primero;

		if (actual != null) {
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
		}

		return actual;
	}

	// Localizar anterior
	public Nodo localizarAnterior(int contenido) {

		Nodo anterior = null;
		Nodo actual = primero;

		while (actual != null && actual.getContenido() != contenido) {
			anterior = actual;
			actual = actual.getSiguiente();

		}

		return actual != null ? anterior : null;
	}

	// Calcular el número de los elementos de una lista
	public int longitud() {

		Nodo actual = primero;
		int longitud = 0;

		while (actual != null) {
			longitud++;
			actual = actual.getSiguiente();
		}

		return longitud;
	}

	// Insertar un elemento después de uno del que se tiene la referencia
	public void insertarDespuesDe(int contenido, Nodo n) throws NoExisteException {
		Nodo anterior = buscarNodo(contenido);
		if (anterior == null)
			throw new NoExisteException(contenido);
		else
			anterior.insertarDespues(n);
	}

	// Insertar un elemento como el primero de la secuencia
	public void insertarAlComienzo(Nodo n) {
		n.setSiguiente(primero);
		primero = n;
	}

	// Mostar toda la lista
	public void mostrarLista() {

		Nodo actual = primero;

		while (actual != null) {
			System.out.println(actual.getContenido());
			actual = actual.getSiguiente();
		}
	}
	
	public void imprimir(Nodo n) {
		if(n != null) {
			System.out.println(n.getContenido());
			imprimir(n.getSiguiente());
		}
	}

	public void insertarAlFinal(Nodo n) {

		Nodo ultimo = localizarUltimo();
		n.setSiguiente(null);
		ultimo.setSiguiente(n);
	}

	// Insertar un elemento antes de uno del que se tiene la referencia
	public void insertarAntesDe(int contenido, Nodo n) throws NoExisteException {
		Nodo anterior = localizarAnterior(contenido);
		if (anterior == null)
			throw new NoExisteException(contenido);
		else
			anterior.insertarDespues(n);
	}

	public void invertirLista() {
		Nodo cabeza = primero;
		int i = longitud() - 1;
		while (i > 0) {
			Nodo cola = localizarUltimo();
			Nodo anteriorCabeza = localizarAnterior(cabeza.getContenido());
			Nodo anteriorCola = localizarAnterior(cola.getContenido());

			cola.setSiguiente(cabeza);

			if (anteriorCabeza != null) {
				anteriorCabeza.setSiguiente(cola);
			} else {
				cola.setSiguiente(cabeza);
				primero = cola;
			}
			anteriorCola.setSiguiente(null);
			i--;
		}

	}
}

package co.edu.udem.listadoble;

public class ListaDoble {

	Nodo primero;

	// Buscar un elemento ->
	public Nodo buscarNodo(int contenido) {

		Nodo actual = primero;

		while (actual != null && actual.getContenido() != contenido) {
			actual = actual.getSiguiente();
		}

		return actual;
	}

	// Localizar el último elemento ->
	public Nodo localizarUltimo() {

		Nodo actual = primero;

		if (actual != null) {
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
		}

		return actual;
	}

	// Localizar anterior ->
	public Nodo localizarAnterior(int contenido) {

		Nodo actual = buscarNodo(contenido);

		return actual != null ? actual.getAnterior() : actual;
	}

	// Calcular el número de los elementos de una lista ->
	public int longitud() {

		Nodo actual = primero;
		int longitud = 0;

		while (actual != null) {
			longitud++;
			actual = actual.getSiguiente();
		}

		return longitud;
	}

	// Insertar un elemento después de uno del que se tiene la referencia ->
	public void insertarDespuesDe(int contenido, Nodo n) throws NoExisteException {
		
		Nodo actual = buscarNodo(contenido);
		
		if (actual == null)
			throw new NoExisteException(contenido);
		else {
			n.setSiguiente(actual.getSiguiente());
			n.setAnterior(actual);
			if(actual.getSiguiente() != null) {
				actual.getSiguiente().setAnterior(n);
			}
			actual.setSiguiente(n);
		}
	}

	// Insertar un elemento como el primero de la secuencia
	public void insertarAlComienzo(Nodo n) {

		n.setAnterior(null);

		if (primero != null) {
			n.setSiguiente(primero);
			primero.setAnterior(n);
		} else {
			n.setSiguiente(null);
		}
		primero = n;
	}

	// Insertar un elemento antes de uno del que se tiene la referencia
	public void insertarAntesDe(int contenido, Nodo n) throws NoExisteException {
		
		Nodo actual = buscarNodo(contenido);
		
		if (actual == null)
			throw new NoExisteException(contenido);
		else {
			n.setSiguiente(actual);
			n.setAnterior(actual.getAnterior());
			if(actual.getAnterior() != null) {
				actual.getAnterior().setSiguiente(n);
			}
			actual.setAnterior(n);
			primero=n;
		}
	}
	
	//Mostrar lista
	public void mostrarLista() {
		
		Nodo actual = primero;
		
		while(actual != null) {
			System.out.println(actual.getContenido());
			actual=actual.siguiente;
		}
	}

	// TODO: Implementar los siguientes algoritmos
	/*
	 * Insertar un elemento al final
	 * Mostrar la lista en orden inverso 
	 * Ordenar la lista 
	 * Mover un elemento al comienzo
	 * Mover un elemento al final 
	 * Eliminar un elemento
	 */
}

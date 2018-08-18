package co.edu.udem.listacircular;

import co.edu.udem.listacircular.exceptions.ListaVaciaException;
import co.edu.udem.listacircular.exceptions.NodoNoExisteException;

public class ListaCircular {
	
	Nodo cabeza = null;

	public Nodo buscar(int contenido) {

		Nodo actual = cabeza;
		
		if (actual != null && actual.getContenido() != contenido) {
			do {
				actual = actual.getSiguiente();
			} while (actual.getContenido() != contenido && actual != cabeza);
			
			return actual == cabeza ? null : actual;
		} 
		else {
			return actual;
		}
	}
	
	public Nodo buscarAnterior(int contenido){

		Nodo actual = cabeza;
		//Que la lista esté vacía
		if(actual == null) {
			return actual;
		}
		//Que el anterior sea la cabeza de la lista - >retornar ése de una vez
		else if (actual.getSiguiente().getContenido() == contenido) {
			return actual;
		} 
		//Que esté en otro lugar que no es la cabeza
		else {
			do {
				actual = actual.getSiguiente();
			} while (actual.getSiguiente().getContenido() != contenido && actual != cabeza);
			
			return actual == cabeza ? null : actual;
		} 
	}
	
	public void borrar(int contenido) throws NodoNoExisteException {
		
		if (cabeza != null) {

			Nodo anterior = buscarAnterior(contenido);

			if (anterior == null) {
				throw new NodoNoExisteException(contenido);
			}
			// Eliminar el único nodo de la lista
			else if (anterior == cabeza && cabeza.getSiguiente() == cabeza) {
				cabeza = null;
			}
			// Eliminar el nodo apuntado por la lista, y que no es el único nodo
			else if (anterior.getSiguiente() == cabeza && cabeza != anterior) {
				anterior.setSiguiente(cabeza.getSiguiente());
				cabeza = anterior;
			}
			// Eliminar un nodo cualquiera, que no es el apuntado por lista
			else {
				anterior.setSiguiente(anterior.getSiguiente().getSiguiente());
			}
		}
	}
	
	public void insertar(Nodo n) {
		
		if (cabeza == null) {
			n.setSiguiente(n);
			cabeza=n;
		}
		else {
			n.setSiguiente(cabeza.getSiguiente());
			cabeza.setSiguiente(n);
		}
	}
	
	public int longitud(){

		Nodo actual = cabeza;
		
		int longitud = 0;
		
		if (actual != null) {
			do {
				longitud++;
				actual = actual.getSiguiente();
			} while (actual != cabeza);
		}
		
		return longitud;
	}
	
	public void mostrarLista(){

		Nodo actual = cabeza;
		if (actual != null) {
			do {
				System.out.println(actual.getContenido());
				actual = actual.getSiguiente();
			} while (actual != cabeza);
		}
	}
}

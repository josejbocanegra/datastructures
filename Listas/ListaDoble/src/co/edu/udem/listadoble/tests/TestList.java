package co.edu.udem.listadoble.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.udem.listadoble.ListaDoble;
import co.edu.udem.listadoble.Nodo;

class TestList {

	@Test
	void testNull() {
		ListaDoble listaDoble = new ListaDoble();
		assertEquals(null, listaDoble.buscarNodo(30));
		assertNull(listaDoble.buscarNodo(30));
	}
	
	@Test
	void testNotNull() {
		ListaDoble listaDoble = new ListaDoble();
		listaDoble.insertarAlComienzo(new Nodo (30));
		assertNotNull(listaDoble.buscarNodo(30));
		
	}
}

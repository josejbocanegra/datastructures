package co.edu.udem.pila;

import co.edu.udem.pila.exceptions.ListaVaciaException;

public class Main {

	public static void main(String[] args) throws ListaVaciaException {
		
		Pila pila = new Pila();
		
		//pila.push(new Nodo (50));
		//pila.push(new Nodo (70));
		/*pila.push(new Nodo (90));
		pila.push(new Nodo (120));*/
		
		
		//System.out.println(pila.pop().getContenido());
		//System.out.println(pila.pop().getContenido());
		//System.out.println(pila.pop().getContenido());
		System.out.println(pila.peek().getContenido());
	}

}

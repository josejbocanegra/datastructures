package co.edu.udem.listaenlazada;

import co.edu.udem.listaenlazada.exceptions.NoExisteException;
import co.edu.udem.listaenlazada.exceptions.NodoExisteException;

public class Main {

	public static void main(String[] args) throws NoExisteException, NodoExisteException {
		String cadena= "anita lava la tina";
		cadena = cadena.replace(" ", "");
		for (char s : cadena.toCharArray()) {
			System.out.println(s);
		}
		//Crear una nueva lista enlazada. 
		Lista listaA = new Lista();
		listaA.insertarAlComienzo(new Nodo(400));
		listaA.insertarAlComienzo(new Nodo(300));
		listaA.insertarAlComienzo(new Nodo(200));
		listaA.insertarAlComienzo(new Nodo(100));
		
		System.out.println("--Mostar los elementos de la lista--");
		listaA.imprimir(listaA.primero);
		//listaA.mostrarLista();
		

	
		Lista listaB = new Lista();
		listaB.insertarAlComienzo(new Nodo(70));
		listaB.insertarAlComienzo(new Nodo(30));
		listaB.insertarAlComienzo(new Nodo(20));
		listaB.insertarAlComienzo(new Nodo(100));
		
		Lista listaC = new Lista();
		listaC = listaC.intersectar(listaA, listaB);
		
		//Mostrar los elementos de la lista
		System.out.println("--Mostar los elementos de la lista--");
		listaC.mostrarLista();
		
		
		
		
		/*
		//Buscar un nodo 
		System.out.println("--Buscar un nodo--");
		Nodo n =lista.buscarNodo(100);
		if(n!=null)
			System.out.println("Nodo " + n.getContenido() + " encontrado");
		else
			System.out.println("Nodo no encontrado");
		
		//Mostrar la longitud de la lista
		System.out.println("--Mostar la longitud de la lista--");
		System.out.println("La longitud de la lista es: " + lista.longitud());
		
		
		//Mostrar el último nodo de la lista
		System.out.println("--Mostar el último elemento de la lista--");
		Nodo ultimo = lista.localizarUltimo();
		System.out.println("El último elemento de la lista es: " + ultimo.getContenido());
		
		
		//Localizar el elemento antes de un nodo dado
		System.out.println("--Localizar un elemento antes de un nodo dado--");
		Nodo anterior = lista.localizarAnterior(30);
		System.out.println("El nodo anterior al número 30 es: " + anterior.getContenido());
		
		
		//Insertar despues del nodo con el número 20
		System.out.println("--Insertar un nodo después de un nodo dado--");
		lista.insertarDespuesDe(20, new Nodo(155));
				
		//Mostrar los elementos de la lista
		lista.mostrarLista();
		
		
		//Insertar al final de la lista
		System.out.println("--Insertar un nodo al final de la lista--");
		lista.insertarAlFinal(new Nodo (245));
		
		//Mostrar los elementos de la lista
		lista.mostrarLista();
		System.out.println("-------------");
		
		// Insertar un elemento antes de uno del que se tiene la referencia
		System.out.println("--Insertar un nodo al antes de uno del cual se tiene la referencia--");
		lista.insertarAntesDe(245, new Nodo (785));
		
		lista.mostrarLista();
		System.out.println("-------------");

		System.out.println("--Invertir lista--");
		lista.invertirLista();
		lista.mostrarLista();
		System.out.println("-------------");
		algo();*/
	}
	

}

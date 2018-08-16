package co.edu.udem.pila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila pila = new Pila();
		pila.push(new Nodo (50));
		pila.push(new Nodo (60));
		pila.push(new Nodo (70));
		pila.push(new Nodo (80));
		pila.push(new Nodo (90));
		
		System.out.println(pila.peek().getContenido());
		
		pila.pop();
		
		System.out.println(pila.peek().getContenido());
		
		pila.pop();
		
		System.out.println(pila.peek().getContenido());
	}

}

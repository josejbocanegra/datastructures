package co.edu.udem.pila;

public class Pila {
	Nodo primero;
	
	public void push (Nodo n){
		
		if(isEmpty()){
			n.setSiguiente(null);
		}
		else {
			n.setSiguiente(primero);
		}
		primero=n;
	}
	
	public Nodo peek(){
		return primero;
	}
	
	public Nodo pop(){
		Nodo actual = primero;
		primero = primero.getSiguiente();
		return actual;
	}
	
	public boolean isEmpty(){
		return primero !=null ? false : true;
	}
}

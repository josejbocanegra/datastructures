package co.edu.udem.cola;

public class Cola {
	
	Nodo primero;
	Nodo ultimo;
	
	public void queue (Nodo n){
		
		if(isEmpty()){
			primero = n;
			ultimo = n;
		}
		else {
			ultimo.setSiguiente(n);
		}
		ultimo = n;
	}
	
	public Nodo peek(){
		return primero;
	}
	
	public Nodo dequeue(){
		Nodo actual = primero;
		primero = primero.getSiguiente();
		return actual;
	}
	
	public boolean isEmpty(){
		return ultimo !=null ? false : true;
	}
}

package co.edu.udem.cola;

public class Cola {
	
	Nodo primero;
	Nodo ultimo;
	
	public void queue (Nodo n){
		
		if(isEmpty()){
			primero = n;
		}
		else {
			ultimo.setSiguiente(n);
		}
		ultimo = n;
	}
	
	public Nodo peek() throws ColaVaciaException{
		if(!isEmpty())
			return primero; 
		else
			throw new ColaVaciaException();
	}
	
	public Nodo dequeue() throws ColaVaciaException{
		if(!isEmpty()) {
			Nodo actual = primero;
			primero = primero.getSiguiente();
			if(primero == null) {
				ultimo = primero;
			}
			return actual;
		}
		else {
			throw new ColaVaciaException();
		}
	}
	
	public boolean isEmpty(){
		return primero !=null ? false : true;
	}
}

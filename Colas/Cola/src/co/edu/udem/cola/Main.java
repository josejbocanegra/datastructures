package co.edu.udem.cola;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola cola = new Cola();
		
		cola.queue(new Nodo(20));
		cola.queue(new Nodo(30));
		cola.queue(new Nodo(40));
		
		System.out.println(cola.peek().getContenido());
		
		cola.dequeue();
		System.out.println(cola.peek().getContenido());
	}

}
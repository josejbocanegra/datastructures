package co.edu.udem.recursividad;

public class Recursividad {
	
	public int factorial (int f) {
		
		return f == 0 ? 1 : f * factorial (f -1);
	}
}

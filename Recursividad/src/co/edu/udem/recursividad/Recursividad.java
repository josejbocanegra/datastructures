package co.edu.udem.recursividad;

public class Recursividad {
	
	public int factorial (int f) {
		
		return f == 0 ? 1 : f * factorial (f -1);
	}
	
	public int sumatoria (int s) {
		
		return s == 0 ?  0 : s + sumatoria (s - 1);
	}
	
	public void printNumber (int a, int b) {
		System.out.println(a);
		if(a < b)
			printNumber(a + 1, b);
	}
	
	public int fibonacci (int f) {
		
		return f < 2 ? f : fibonacci(f - 1) + fibonacci(f - 2);
	}
	
	public int mcd (int a, int b) {
		
		return a == b ? a : mcd (a < b ? a : b, a > b ? (a - b) : (b - a) );
		
	}
}


package co.edu.udem.afd;

public class Automata{
	
	boolean aceptacion;
	String word;
	int cont;
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public void q0() {
		cont++;
		aceptacion = false;
		if(cont<word.length())
			if(word.charAt(cont)=='a' || word.charAt(cont)=='b') {
				q1();
			}
	}
	
	public void q1() {
		cont++;
		aceptacion = false;
		if(cont<word.length())
			if(word.charAt(cont)=='a') {
				q1();
			} else {
				q2();
			}
	}
	
	public void q2() {
		aceptacion = true;
		cont++;
		if(cont<word.length())
			if(word.charAt(cont)=='a') {
				q1();
			} else {
				q2();
			}
	}
	
	public void inicio() {
		aceptacion = false;
		cont = -1;
		q0();
	}	
}

package co.edu.udem.afd;

public class Main {

	public static void main(String[] args) {
		Automata automata = new Automata();
		automata.setWord("aaabab");
		automata.inicio();
		System.out.println(automata.aceptacion);
	}

}

package co.edu.udem.arboles;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbol arbol = new Arbol();
		arbol.insertar(arbol.raiz, new Nodo (10));
		arbol.insertar(arbol.raiz, new Nodo (8));
		arbol.insertar(arbol.raiz, new Nodo (30));
		arbol.insertar(arbol.raiz, new Nodo (7));
		arbol.insertar(arbol.raiz, new Nodo (9));
		arbol.insertar(arbol.raiz, new Nodo (27));
		arbol.insertar(arbol.raiz, new Nodo (31));
		
		arbol.inorder(arbol.raiz);
		
		System.out.println(arbol.nivel(arbol.raiz,31));
	}

}

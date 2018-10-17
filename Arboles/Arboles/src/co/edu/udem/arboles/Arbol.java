package co.edu.udem.arboles;

public class Arbol {
	Nodo raiz;
	
	public void insertar (Nodo raiz, Nodo n) {
		if(this.raiz != null) {
			if(n.contenido < raiz.contenido) {
				if(raiz.izq != null) {
					insertar (raiz.izq,n);
				} else {
					raiz.izq = n;
				}
			} else {
				if(raiz.der != null) {
					insertar (raiz.der,n);
				} else {
					raiz.der = n;
				}
			}
		} else {
			this.raiz = n;
		}
	}
	
	public void preorder(Nodo raiz) {
		if (raiz != null) {
			visitar(raiz);
			preorder(raiz.izq);
			preorder(raiz.der);
		}
	}
	
	public void inorder(Nodo raiz) {
		if (raiz != null) {
			inorder(raiz.izq);
			visitar(raiz);
			inorder(raiz.der);
		}
	}
	
	public void postorder(Nodo raiz) {
		if (raiz != null) {
			postorder(raiz.izq);
			postorder(raiz.der);
			visitar(raiz);
		}
	}
	
	public void visitar (Nodo raiz) {
		System.out.println(raiz.contenido);
	}
	
	public Nodo buscar (Nodo raiz, int contenido) {
		if(raiz != null) {
			if(contenido != raiz.contenido) {
				return contenido < raiz.contenido ? buscar(raiz.izq,contenido): buscar(raiz.der,contenido);
			} else {
				return raiz;
			}
		}
		return raiz;
	}
}

package co.edu.udem.arboles;

public class Arbol {
	Nodo raiz;

	public void insertar(Nodo raiz, Nodo n) {
		if (this.raiz != null) {
			if (n.contenido < raiz.contenido) {
				if (raiz.izq != null) {
					insertar(raiz.izq, n);
				} else {
					raiz.izq = n;
				}
			} else {
				if (raiz.der != null) {
					insertar(raiz.der, n);
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

	public void visitar(Nodo raiz) {
		System.out.println(raiz.contenido);
	}

	public Nodo buscar(Nodo raiz, int contenido) {
		if (raiz != null) {
			if (contenido != raiz.contenido) {
				return contenido < raiz.contenido ? buscar(raiz.izq, contenido) : buscar(raiz.der, contenido);
			} else {
				return raiz;
			}
		}
		return raiz;
	}

	public int peso(Nodo raiz) {
		return raiz != null ? 1 + peso(raiz.izq) + peso(raiz.der) : 0;
	}

	public boolean hermanos(Nodo raiz, int a, int b) {
		if (raiz != null) {
			if (padreDe(raiz,a) && padreDe(raiz,b)) {
				return true;
			} else {
				return hermanos(raiz.izq, a, b) || hermanos(raiz.der, a, b);
			}
		}
		return false;
	}
	
	public boolean padreDe(Nodo raiz, int a) {
		return raiz.izq != null && raiz.izq.contenido == a || raiz.der != null && raiz.der.contenido == a ? true : false;
	}

	public int altura(Nodo raiz) {
		return raiz != null ? 1 + Math.max(altura(raiz.izq), altura(raiz.der)) : 0;
	}

	/*public int nivel(Nodo raiz, int contenido) {
		if (raiz != null) {
			if (contenido != raiz.contenido) {
				return contenido < raiz.contenido ? 1 + nivel(raiz.izq, contenido) : 1 + nivel(raiz.der, contenido);
			} else {
				return 1;
			}
		}
		return 0;
	}*/
	
	/*public int sumatoria (Nodo raiz) {
		return raiz != null ? raiz.contenido + sumatoria (raiz.izq) + sumatoria (raiz.der) : 0;
	}*/
	public int nivel (Nodo raiz, int contenido) {
		int contador = 1;
		if(raiz!= null) {
			if(contenido != raiz.contenido) {
				if(contenido < raiz.contenido) {
					contador ++;
					nivel(raiz.izq, contenido);
					}else {
						contador ++;
						nivel(raiz.der, contenido);
					}
				return 0;
			}
			return contador;
		}
		return 0;
	}

	
}
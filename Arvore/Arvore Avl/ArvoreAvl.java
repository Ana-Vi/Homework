/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author avbvi
 */
public class ArvoreAvl {
	private NodoArvoreAvl raiz;

	ArvoreAvl() {
		raiz = null;
	}

	void rotacaoDireita() {
		if (raiz != null) {
			raiz = raiz.rotacaoDireita(raiz);
		}
	}

	void rotacaoEsquerda() {
		if (raiz != null) {
			raiz = raiz.rotacaoEsquerda(raiz);
		}
	}

	void rotacaoEsquerdaDireita() {
		if (raiz != null) {
			raiz = raiz.rotacaoEsquerdaDireita(raiz);
		}
	}

	void rotacaoDireitaEsquerda() {
		if (raiz != null) {
			raiz = raiz.rotacaoDireitaEsquerda(raiz);
		}
	}

	void insereBalanceado(int v){
		if (raiz == null){
			raiz = new NodoArvoreAvl(v, null, null);
		}
		else{
			raiz = raiz.insereBalanceado(raiz, v);
		}
	}

	void imprimePreOrdem() {
		if (raiz != null) {
			raiz.imprimePre(raiz);
			System.out.println();
		}
	}

	// Wrapper over print2DUtil() 
	public void print2D() { 
		// Pass initial space count as 0 
		raiz.print2DUtil(raiz, 0); 
	} 
        
        //puxar interno
        private void copiarInterno(NodoArvoreAvl nodo){
            if(nodo != null){
                this.insereBalanceado(nodo.getValor());
                copiarInterno(nodo.getNodoEsquerda());
                copiarInterno(nodo.getNodoDireita());
            }
        }
        
        //duplicar uma arvore
        public void copiar (ArvoreAvl arvore){
            if(arvore.raiz != null){
                this.insereBalanceado(arvore.raiz.getValor());
                copiarInterno(arvore.raiz.getNodoEsquerda());
                copiarInterno(arvore.raiz.getNodoDireita());
            }
        }
        
        public void removeBalanceado(int valor){
            if(this.raiz != null){
                this.raiz=this.raiz.removerBalanceado(raiz, valor);
            }
        }
}

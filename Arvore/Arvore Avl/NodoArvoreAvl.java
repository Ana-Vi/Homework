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
public class NodoArvoreAvl {

	// Aux para imprimir a árvore graficamente
	static final int COUNT = 10;

	private int valor;
	private NodoArvoreAvl esquerda;
	private NodoArvoreAvl direita;

	NodoArvoreAvl(int v, NodoArvoreAvl esq, NodoArvoreAvl dir) {
		this.valor = v;
		this.esquerda = esq;
		this.direita = dir;
	}

	void imprimeOrdem(NodoArvoreAvl nodo) {
		if (nodo != null) {
			System.out.print("<");
			imprimeOrdem(nodo.esquerda);
			System.out.print(nodo.valor);
			imprimeOrdem(nodo.direita);
			System.out.print(">");
		}
	}

	NodoArvoreAvl rotacaoDireita(NodoArvoreAvl a) {
		NodoArvoreAvl aux = a.esquerda;
		a.esquerda = aux.direita;
		aux.direita = a;
		return aux;
	}

	NodoArvoreAvl rotacaoEsquerda(NodoArvoreAvl a) {
		NodoArvoreAvl aux = a.direita;
		a.direita = aux.esquerda;
		aux.esquerda = a;
		return aux;
	}

	NodoArvoreAvl rotacaoEsquerdaDireita(NodoArvoreAvl a) { //Rotação Dupla Direita
		a.esquerda = a.rotacaoEsquerda(a.esquerda);
		a = a.rotacaoDireita(a);
		return a;
	}

	NodoArvoreAvl rotacaoDireitaEsquerda(NodoArvoreAvl a) { //Rotação Dupla Esquerda
		a.direita = a.rotacaoDireita(a.direita);
		a = a.rotacaoEsquerda(a);
		return a;
	}

	int max(int a, int b) {
		return (a > b? a:b);
	}

	int altura(NodoArvoreAvl nodo) {
		if (nodo == null) return -1;
		else return 1 +
				max(altura(nodo.esquerda), altura(nodo.direita));
	}

	NodoArvoreAvl insereBalanceado(NodoArvoreAvl a, int valor) {
		if (a == null)
			a = new NodoArvoreAvl(valor, null, null);
		else if (valor < a.valor) { // insere na subárvore esquerda
			a.esquerda = insereBalanceado(a.esquerda, valor);
			// Verificar o balanceamento
			if (this.altura(a.esquerda) - this.altura(a.direita) == 2) {
				if (valor < a.esquerda.valor)
					a = a.rotacaoDireita(a);
				else
					a = a.rotacaoEsquerdaDireita(a);
			}

		} else { // insere na subárvore direita
			a.direita = insereBalanceado(a.direita, valor);
			// Verificar o balanceamento
			if (this.altura(a.esquerda) - this.altura(a.direita) == -2) {
				if (valor > a.direita.valor)
					a = a.rotacaoEsquerda(a);
				else
					a = a.rotacaoDireitaEsquerda(a);
			}
		}
		return a;
	}

	void imprimePre(NodoArvoreAvl nodo) {
		if (nodo != null) {
			System.out.print("<");
			System.out.print(nodo.valor);
			imprimePre(nodo.esquerda);
			imprimePre(nodo.direita);
			System.out.print(">");
		}
	}
	
	NodoArvoreAvl balanceamento(NodoArvoreAvl a){
		if (this.altura(a.esquerda) - this.altura(a.direita) == -2) {
			if (this.altura(a.direita.esquerda) - 
					this.altura(a.direita.direita) == 1){ // um sinal negativo e um positivo
				a = rotacaoDireitaEsquerda(a);}
			else {// sinais iguais
				a = a.rotacaoEsquerda(a);}      
		}
		else 
			if (this.altura(a.esquerda) - this.altura(a.direita) == 2) {
				if(this.altura(a.esquerda.esquerda) - 
						this.altura(a.esquerda.direita) == -1){ // um sinal positivo e um negativo
					a = rotacaoEsquerdaDireita(a);}
				else {// sinais iguais
					a = rotacaoDireita(a);}      
			}         
		return a;
	}

	NodoArvoreAvl removerBalanceado(NodoArvoreAvl a , int valor) {
		// Primeira parte de busca do nodo a ser removido
		// Se o nodo não for encontrado
		if (a == null) return null;
		else if (valor < a.valor) // verificar qual subárvore está o nodo (subárvore esquerda)
			a.esquerda = removerBalanceado(a.esquerda, valor);
		else if (valor > a.valor) // verificar qual subárvore está o nodo (subárvore direita)
			a.direita = removerBalanceado(a.direita, valor);
		else { // achou o nodo
			if (a.direita == null && a.esquerda == null)
				return null;
			if (a.direita == null) return a.esquerda;
			if (a.esquerda == null) return a.direita;
			// Buscar pelo menor valor dos maiores filhos do nodo encontrado
			NodoArvoreAvl temp = a.direita;
			while (temp.esquerda != null) temp = temp.esquerda;
			// Trocar os valores do nodo a ser removido com o menor dos maiores nodos à direita
			a.valor = temp.valor;
			temp.valor = valor;
			// Remover o nodo buscado
			a.direita = removerBalanceado(a.direita, valor);
		}
		a = balanceamento(a);
		return a;
	}

	static void print2DUtil(NodoArvoreAvl root, int space) 
	{ 
		// Base case 
		if (root == null) 
			return; 

		// Increase distance between levels 
		space += COUNT; 

		// Process right child first 
		print2DUtil(root.direita, space); 

		// Print current node after space 
		// count 
		System.out.print("\n"); 
		for (int i = COUNT; i < space; i++) 
			System.out.print(" "); 
		System.out.print(root.valor + "\n"); 

		// Process left child 
		print2DUtil(root.esquerda, space); 
	}
        Integer getValor(){
            return this.valor;
        }
        NodoArvoreAvl getNodoEsquerda(){
            return this.esquerda;
        }
        NodoArvoreAvl getNodoDireita(){
            return this.direita;
        }
        

}

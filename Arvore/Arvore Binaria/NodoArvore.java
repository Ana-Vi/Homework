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
public class NodoArvore {
    private NodoArvore nodoEsquerda;
    private Integer valor;
    private NodoArvore nodoDireita;
    NodoArvore(){}
    NodoArvore(int valor, NodoArvore esquerda, NodoArvore direita){
        this.valor=valor;
        this.nodoDireita=direita;
        this.nodoEsquerda=esquerda;
    }
    NodoArvore insere(NodoArvore atual, int v){
        if(atual==null){
            atual=new NodoArvore(v,null,null);
        }else if(v<atual.valor){
            atual.nodoEsquerda=insere(atual.nodoEsquerda, v);
        }else{
            atual.nodoDireita=insere(atual.nodoDireita, v);
        }
        return atual;
    }
    NodoArvore retiraValor(NodoArvore nodo, int numero){
        if(nodo==null){
            return null;
        }else if(numero<nodo.valor){
            nodo.nodoEsquerda=retiraValor(nodo.nodoEsquerda, numero);
        }else if(numero>nodo.valor){
            nodo.nodoDireita=retiraValor(nodo.nodoDireita, numero);
        }else{
            if(nodo.nodoDireita==null && nodo.nodoEsquerda==null){
                return null;
            }if(nodo.nodoDireita==null){
                return nodo.nodoEsquerda;
            }if(nodo.nodoEsquerda==null){
                return nodo.nodoDireita;
            }
            NodoArvore temp=nodo.nodoEsquerda;
            while (temp.nodoDireita!=null){
                temp=temp.nodoDireita;
            }
            nodo.valor=temp.valor;
            temp.valor=numero;
            nodo.nodoEsquerda=retiraValor(nodo.nodoEsquerda,numero);
        }
        return nodo;
    }
    boolean busca(NodoArvore nodo, int v){
        if (nodo==null){
            return false;
        }else{
            if(nodo.valor==v){
                return true;
            }else{
                return busca(nodo.nodoDireita, v)|| busca(nodo.nodoEsquerda, v);
            }
        }
    }
    //preordem
    void imprimePre(NodoArvore nodo){
        if(nodo!=null){
            System.out.print("<");
            System.out.print(nodo.valor);
            imprimePre(nodo.nodoEsquerda);
            imprimePre(nodo.nodoDireita);
            System.out.print(">");
        }    
    }
    //ordemsimetrica
    void imprimeOrdem(NodoArvore nodo){
        if(nodo!=null){
            System.out.print("<");
            imprimeOrdem(nodo.nodoEsquerda);
            System.out.print(nodo.valor);
            imprimeOrdem(nodo.nodoDireita);
            System.out.print(">");
        }
    }
    //pos ordem
    void imprimePosOrdem(NodoArvore nodo){
        if(nodo!=null){
            System.out.print("<");
            imprimePosOrdem(nodo.nodoEsquerda);
            imprimePosOrdem(nodo.nodoDireita);
            System.out.print(nodo.valor);
            System.out.print(">");
        }
    }
    int soma(NodoArvore nodo) {
        int cont=0;
        if(nodo!=null){
            cont= cont + nodo.valor;
            if (!(nodo.nodoDireita == null)){
               cont= cont+soma(nodo.nodoDireita);
            }
            if(!(nodo.nodoEsquerda == null)){
                cont= cont+soma(nodo.nodoEsquerda);
            }
            return cont;
        }else{
            return cont;
        }
    }
    int getImpar(NodoArvore nodo){
        if(!(nodo.valor%2==0)){
            return nodo.valor;
        }else{
            return 0;
        }
    }
    int somaImpares(NodoArvore nodo){
        int cont = 0;
        if(nodo != null){
            cont = cont + getImpar(nodo);
            if(!(nodo.nodoDireita== null)){
                cont= cont + somaImpares(nodo.nodoDireita);
            }
            if(!(nodo.nodoEsquerda == null)){
                cont = cont + somaImpares(nodo.nodoEsquerda);
            }
            return cont;
        }
        else{
            return cont;
        }
    }
}

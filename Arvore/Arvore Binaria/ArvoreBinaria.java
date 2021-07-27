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
public class ArvoreBinaria {
    private NodoArvore raiz;
    ArvoreBinaria(){
        raiz=null;
    }
    boolean arv_vazia(){
        return this==null;
    }
    boolean buscaBinaria(int v){
        if (raiz==null){
            return false;
        }else{
            return raiz.busca(raiz, v);
        }
    }
    void insere(int v){
        if(raiz==null){
            raiz = new NodoArvore(v,null,null);
        }else{
            raiz.insere(raiz, v);
        }
    }
    void imprimePre(){
        if(raiz!=null){
            raiz.imprimePre(raiz);
            System.out.println();
        }
    }
    void imprimeOrdem(){
        if(raiz!=null){
            raiz.imprimeOrdem(raiz);
            System.out.println();
        }
    }
    void imprimePosOrdem(){
        if(raiz!=null){
            raiz.imprimePosOrdem(raiz);
            System.out.println();
        }
    }
    void retiraNodo(int valor){
        if(raiz!=null){
            raiz=raiz.retiraValor(raiz, valor);
        }
    }
    int soma() {
        if(raiz!=null){
            return raiz.soma(raiz);
        }else{
            return 0;
        }
    }
    int somaImpares(){
        if(raiz!=null){
            return raiz.somaImpares(raiz);
        }else{
            return 0;
        }
    }
}

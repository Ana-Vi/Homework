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
public class TestesArvoreAVL {
    public static void main(String[]args){
        ArvoreAvl arvoreAVL = new ArvoreAvl();
        //rotação simples
        arvoreAVL.insereBalanceado(41);
        arvoreAVL.insereBalanceado(29);
        arvoreAVL.insereBalanceado(20);
        arvoreAVL.imprimePreOrdem();
         
        //rotação dupla
        arvoreAVL.insereBalanceado(10);
        arvoreAVL.insereBalanceado(15);
        
        arvoreAVL.imprimePreOrdem();
        arvoreAVL.removeBalanceado(10);
        arvoreAVL.imprimePreOrdem();
    }
}

package arvore;

/**
 *
 * @author avbvi
 */
public class TestesArvoreBinaria {
    public static void main(String[]args){
        ArvoreBinaria a = new ArvoreBinaria();
        a.insere(11);a.insere(12);a.insere(13);a.insere(15);a.insere(20);a.insere(10);
        System.out.println(a.somaImpares());System.out.println(a.soma());
        a.imprimeOrdem();
    }
}

package preprova;

/**
 *
 * @author avbvi
 */
public class testaQt2 {
    public static void main(String[]args){
        qt2 n=new qt2();
        n.enfileirar(8);
        n.enfileirar(9);
        n.enfileirarPrioridade(10);
        n.imprimir();
        n.enfileiraOrdem(22, 4);
        n.enfileiraOrdem(21, 3);
        n.imprimir();
    }
}

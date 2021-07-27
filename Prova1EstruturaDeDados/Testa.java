package prova1;

/**
 *
 * @author avbvi
 */
public class Testa {
    public static void main(String[]args){
    FilaAbstract a = new FilaAbstract();
    FilaAbstract b = new FilaAbstract();
    a.enfileirar(5);
    a.enfileirar(6);
    b.enfileirar(10);
    b.enfileirar(11);
    System.out.println(a.mesclar(b));
    System.out.println(a.toString());
    a.inverter();
    System.out.println(a.toString());
    }
}

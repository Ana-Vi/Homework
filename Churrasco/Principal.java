package pkg202001;

import java.util.Scanner;
public class Principal {

    public static void main (String args[]) {
        //TODO: ler a quantidade de pessoas que vao ao churrasco e dizer quantos gramas de carne são necessarias
        Scanner aux = new Scanner(System.in);
        Churrasco c = new Churrasco();
        c.pessoas = aux.nextInt();
        c.dia= aux.next();
        c.calcularTotalCarne();
        System.out.println(c.carne);
    }
   
}
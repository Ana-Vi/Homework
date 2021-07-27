package pkg202001;

import java.util.Scanner;
public class TestaSwapper{
    public static void main(String[]args){
        Swapper aux= new Swapper();
        Scanner ler = new Scanner(System.in);
        int a, b;
        a=ler.nextInt();
        b=ler.nextInt();
        ler.close();
        aux.setX(a);
        aux.setY(b);
        aux.swap();
        System.out.println(aux);
    }
}
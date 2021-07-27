import java.util.Scanner;
public class Ex1 {
    public static void main (String[]args){
        Scanner aux = new Scanner(System.in);
        float n1, n2, n3, media;
        System.out.println("Digite 3 números: ");
        n1= aux.nextFloat();
        n2= aux.nextFloat();
        n3= aux.nextFloat();
        media = (n1+n2+n3)/3;
        System.out.println("A média é: "+ media);
        
        if (media>= 6)
            System.out.println("Aprovado");
        else if (media<6 && media>=3)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
                
    }
}
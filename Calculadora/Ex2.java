import java.util.Scanner;
public class Ex2 {
    public static void main (String []args){
        Scanner aux = new Scanner(System.in);
        float n1, n2;
        String operacao;
        System.out.println("Digite 2 números: ");
        n1= aux.nextFloat();
        n2= aux.nextFloat();
        System.out.println("Agora digite a operação desejada: soma, subtração, multiplicação ou divisão?");
        operacao= aux.next();
        
        
        switch (operacao) {
            case "soma":
                System.out.println("Soma:"+ (n1+n2));
                break;
            case "subtração":
                System.out.println("Subtração: "+((n1-n2)));
                break;
            case "multiplicação":
                System.out.println("Multiplicação: "+ (n1*n2));
                break;
            case "divisão":
                System.out.println("Divisão: " +(n1/n2));
                break;
            default:
                System.out.println("Error");
                break;
        }
            
    }
}

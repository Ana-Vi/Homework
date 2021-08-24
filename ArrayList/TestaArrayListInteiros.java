import java.util.ArrayList;
import java.util.Scanner;
public class TestaArrayListInteiros {
    public static void main(String[]args){
    ArrayList<Integer> lista=new ArrayList<>();
    int n;
    Scanner entrada = new Scanner(System.in);
    while(lista.size()<6){
    System.out.println("Digite um número:");
    n=entrada.nextInt();
    if(!lista.contains(n)){
    lista.add(n);
    }else{
    System.out.println("Elemento já cadastrado");
    }
    }
    for(Integer item:lista){
        System.out.print(" "+item+" ");
    }
    
    
    }
}

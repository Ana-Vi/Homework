import java.util.ArrayList;
import java.util.Scanner;
public class TestaArrayListListaString {
    public static void main(String[]args){
    ArrayList<String> lista = new ArrayList<>();
    lista.add("Maria da Silva");
    lista.add("Jonas");
    lista.add("James");
    lista.add("Harry");
    lista.add("Jack Sparrow");
    
    System.out.println("escolha o número da pessoa que deseja excluir");
    System.out.println("1.Maria da Silva \n2.Jonas \n3.James \n4.Harry \n5.Jack Sparrow");
    Scanner aux= new Scanner(System.in);
    int x= aux.nextInt();
    lista.remove(x-1);
    for(String item:lista){
    System.out.println(item);
    }
    
    }
}

package estruturadedados;
public class TestaFilaDeDados {
    public static void main(String[]args){
        FilaDeDados f=new FilaDeDados(4);
        f.add(1);
        f.add(2);
        f.add(0);
        f.remove();
        System.out.println(f);
    }
}

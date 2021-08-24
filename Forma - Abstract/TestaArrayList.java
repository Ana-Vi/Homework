import java.util.ArrayList;
public class TestaArrayList {
    public static void main(String[]args){
    ArrayList<Forma> colecao = new ArrayList<>();
    colecao.add(new Quadrado(4));
    colecao.add(new Circulo(2));
    colecao.add(new Quadrado(3));
    colecao.add(new Circulo(5));
    colecao.add(new Circulo(32));
    
    for (Forma colecao1:colecao){
    System.out.println(colecao1);
    }
}}
/*public class TestaArrayList {
    public static void main(String[]args){
    //ArrayList<String> agenda = new ArrayList();
    Forma[] colecao= new Forma[5];
    colecao[0]= new Quadrado(4);
    colecao[1]= new Circulo(2);
    colecao[2]= new Quadrado(3);
    colecao[3]= new Circulo(5);
    colecao[4]= new Circulo(32);
    
    for (int i=0; i<colecao.length; i++){
    System.out.println(colecao[i]);
    }
}}
*/


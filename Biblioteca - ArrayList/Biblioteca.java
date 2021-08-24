import java.util.*;
public class Biblioteca {
    private ArrayList<Livro>lista;
    Biblioteca(){
    lista=new ArrayList<>();
    }
    void insereLivro(Livro liv){
        lista.add(liv);
    }
    void exibeLivro(){
        for (Livro item:lista){
        System.out.println(item);
        }
    }
    
    Livro buscaLivro(int ano){
        for(Livro item:lista){
        if (item.getAno()== ano){
        return item;
        }}
        return null;
    }
}

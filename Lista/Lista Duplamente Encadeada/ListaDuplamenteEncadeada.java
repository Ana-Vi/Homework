package estruturadedados;
/**
 *
 * @author avbvi
 */
public class ListaDuplamenteEncadeada {
    private Nodo inicio, ultimo;
    
    private class Nodo{
        Integer valor;
        Nodo proximo;
        Nodo anterior;
    }
    public ListaDuplamenteEncadeada(int tamanho){
        this.inicio=null;
        this.ultimo=null;
    }
    public void InserirInicio(int valor){
        Nodo novo = new Nodo();
        novo.valor= valor;
        novo.proximo=this.inicio;
        novo.anterior=null;
        if (this.inicio==null){
            this.ultimo= novo;
        }else{
            this.inicio.anterior=novo;
        }
        this.inicio=novo;
    }
    public void retiraInicio(){
        if(inicio==ultimo){
            ultimo=inicio=null;
        }else{
            inicio=inicio.proximo;
        }
    }
    public void InserirFinal(Integer valor){
        Nodo novo = new Nodo();
        novo.valor=valor;
        novo.proximo=null;
        novo.anterior=this.ultimo;
        if(this.ultimo==null){
            this.inicio=novo;
        }else{
            this.ultimo.proximo=novo;
        }
        this.ultimo=novo;
    }
    
    public String toString(){
        if(this.inicio!=null)System.out.println("null <-->");
        for(Nodo x = this.inicio; x!=null; x=x.proximo){
            if (this.inicio==x)System.out.println("(inicio)");
            if (this.ultimo==x)System.out.println("(ultimo)");
            System.out.println(x.valor+"<-->");
        }
        return null;
    }
    
}

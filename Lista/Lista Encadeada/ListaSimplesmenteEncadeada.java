package estruturadedados;

/**
 *Apenas com ponteiro para o inicio
 * @author avbvi
 */
public class ListaSimplesmenteEncadeada {
    private Nodo inicio;
    
    private class Nodo{
        int dado;
        Nodo proximo;
    }
    public ListaSimplesmenteEncadeada(){
        inicio=null;
    }
    public void insereInicio(int n){
        Nodo novo = new Nodo();
        novo.dado = n;
        novo.proximo=inicio;
        inicio=novo;
    }
    public void imprimeLista(){
        for(Nodo x=inicio; x!=null;x=x.proximo){
            System.out.println(x.dado+"->");
        }
        System.out.println();
    }
    public void retiraInicio(){
        if(inicio!=null){
            inicio=inicio.proximo;
        }
    }
    public void retiraNodo(Integer n){
        Nodo temp=this.inicio;
        Nodo anterior= null;
        while(temp!=null && temp.dado!=n){
            anterior=temp;
            temp=temp.proximo;
        }
        if (temp==null){
            //não achou 
        }
        if (anterior==null){
            //achou no começo
            //retirado=inicio.dado;
            inicio=inicio.proximo;
        }
        //encontrou no meio
        //retirado=temp.dado;
        anterior.proximo=temp.proximo;
    }
}


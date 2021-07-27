package preprova;

/**
 *
 * @author avbvi
 */
public class qt2 {
   private Nodo inicio, ultimo;
    private class Nodo{
        int dado, prioridade;
        Nodo proximo;
    }

public qt2(){
        inicio=null;
        ultimo=null;
    }
    public void enfileirar(int n){
        Nodo novo = new Nodo();
        novo.dado=n;
        novo.prioridade=5;
        if(inicio==null){
            novo.proximo=inicio;
            inicio=novo;
            ultimo = inicio;
        }else{
            ultimo.proximo=novo;
            ultimo=novo;
        }
    }
    public void enfileiraOrdem(int n, int p){
        Nodo novo= new Nodo();
        novo.dado=n;
        if(!(p>=0 && p<=5)){
           p=5; 
        }
        novo.prioridade=p;
        if(inicio==null){
            novo.proximo=inicio;
            inicio=novo;
            ultimo=inicio;
        }else{
            switch (p) {
                case 0:
                    novo.proximo=inicio;
                    inicio=novo;
                    break;
                case 5:
                    ultimo.proximo=novo;
                    ultimo=novo;
                    break;
                default:
                    for(Nodo x=inicio; x!=null;x=x.proximo){
                        if(x.prioridade<p){
                            novo.proximo=x.proximo;
                            x.proximo=novo;
                        }
                    }
                    break;
            }
        }
    }
    public void enfileirarPrioridade(int n){
        Nodo novo = new Nodo();
        novo.dado=n;
        novo.prioridade=0;
        if(inicio==null){
            novo.proximo=inicio;
            inicio=novo;
            ultimo=inicio;
        }else{
            novo.proximo=inicio;
            inicio=novo;
        }        
    }
    public void imprimir(){
        for(Nodo x=inicio; x!=null;x=x.proximo){
            System.out.println(x.dado+"->");
        }
        System.out.println();
    }
    public int atender(){
        int retorno = inicio.dado;
        if(inicio==ultimo){
            ultimo=inicio=null;
        }else{
            inicio=inicio.proximo;
        }
        return retorno;
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

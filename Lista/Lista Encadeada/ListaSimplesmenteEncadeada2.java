package estruturadedados;

/**
 *Com ponteiros para inicio e para final
 * @author avbvi
 */
public class ListaSimplesmenteEncadeada2 {
    private Nodo inicio, ultimo;
    
    private class Nodo{
        int dado;
        Nodo proximo;
    }
    public ListaSimplesmenteEncadeada2(){
        inicio=null;
        ultimo=null;
    }
    public void insereInicio(int n){
        Nodo novo = new Nodo();
        novo.dado=n;
        if(inicio==null){
            novo.proximo=inicio;
            inicio=novo;
            ultimo=inicio;
        }else{
            novo.proximo=inicio;
            inicio=novo;
        }
    }
    public void retiraInicio(){
        if(inicio==ultimo){
            ultimo=inicio=null;
        }else{
            inicio=inicio.proximo;
        }
    }
    public void insereFinal(int n){
        Nodo novo= new Nodo();
        novo.dado=n;
        novo.proximo=null;
        if(this.inicio==null){
            inicio=novo;
            ultimo= novo;
        }else{
            ultimo.proximo=novo;
            ultimo=novo;
        }
    }
    public void retiraUltimo(){
        if(inicio==ultimo){
            ultimo=inicio=null;
        }else{
            Nodo temp=inicio;
            while(temp.proximo!=ultimo){
                temp=temp.proximo;
            }
            ultimo=temp;
            temp.proximo=null;
        }
    }
    public void removeMeio(int indice){
        Nodo temp=inicio;
        Nodo anterior=null;
        Nodo depois=null;
        int i=0;
        while(temp !=null&&i<indice){
            anterior=temp;
            temp=temp.proximo;
            i++;
        }
        if(anterior==null){
            inicio=inicio.proximo;
        }
        depois=temp.proximo;
        anterior.proximo=depois;
    }
    public void imprimeLista() {
	for (Nodo x = this.inicio; x != null; x = x.proximo) {
            System.out.print(x.dado + " --> ");
	}
	System.out.println("null");
    }
}

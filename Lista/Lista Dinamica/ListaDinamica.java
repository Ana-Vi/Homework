package estruturadedados;
import java.util.*;
/**
 *
 * @author avbvi
 */
public class ListaDinamica {
    private Integer[] dados;
    private int quantidade, tamanho;
    
    public ListaDinamica(int tamanho){
        this.dados=new Integer[tamanho];
        this.tamanho=tamanho;
    }
    public void add(int n){
        if(this.quantidade==dados.length){
            resize(dados.length*2);
            //multiplica pelo dobro toda vez que chega ao final
        }
        this.dados[this.quantidade]=n;
        this.quantidade++;
        
    }
    public int remove(int i) throws IndexOutOfBoundsException{
    //remove do índice e retorna ao usuário qual valor sai da lista
        if(i<0 || i>=this.quantidade){ 
            throw new IndexOutOfBoundsException("Indice Invalido");
        }else{
            int item=this.dados[i];
            for(int j=i+1; j<this.quantidade; j++){
                //a partir do indice i, os valores estão sendo jogados para o índice anterior
                this.dados[j-1]=this.dados[j];
            }
            this.dados[this.quantidade-1]=null;
            this.quantidade--;
            if(this.quantidade>0 && this.quantidade==this.dados.length/4){
                resize(dados.length/2);
            }
            return item;
        }
    }
    public int removeFinal() throws IndexOutOfBoundsException{
        if(this.quantidade==0){
            throw new IndexOutOfBoundsException("Lista Vazia");
        }else{
            int item=this.dados[this.quantidade-1];
            this.dados[this.quantidade-1]=null;
            this.quantidade--;
            if(this.quantidade>0 && this.quantidade==this.dados.length/4){
                resize(dados.length/2);
            }
            return item;
        }
    }
    //método que muda o tamanho do vetor caso necessario
    private void resize(int max){
        Integer[] temp= new Integer[max];
        for (int i=0; i<this.quantidade;i++){
            temp[i]=this.dados[i];
        }
        this.dados=temp;
        this.tamanho=max;
    }
    public String toString(){
        return Arrays.toString(dados)+ ".\nQuantidade= "+this.quantidade+".\nTamanho= "+this.tamanho+".";
    }
    public static void main(String[]args){
        ListaDinamica ld=new ListaDinamica(2);
        System.out.println(ld.toString());
        ld.add(10);
        ld.add(7);
        System.out.println(ld.toString());
        ld.add(8);
        System.out.println(ld.toString());
        ld.removeFinal();
        //ld.remove(0); já que chama no println.. não precisa chamar antes
        System.out.println("Elemento removido: "+ ld.remove(0));
        System.out.println(ld.toString());
    }
}

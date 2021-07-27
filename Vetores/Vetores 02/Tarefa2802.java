package atividades;
import java.util.Arrays;

/**
 *
 * @author avbvi
 */
public class Tarefa2802 {
    private String[] dados;
    private int quantidade;
    
    public Tarefa2802(int tamanho){
        dados=new String[tamanho];
    }
    
    public void add(String n) throws IndexOutOfBoundsException{
        if(this.quantidade==dados.length){
            throw new IndexOutOfBoundsException("Estouro da lista");
        }else{
            this.dados[this.quantidade]=n;
            this.quantidade++;
        }
    }
    public String remove(int i) throws IndexOutOfBoundsException{
    //remove primeiro;
    i=0;
        if(i<0 || i>=this.quantidade){ 
            throw new IndexOutOfBoundsException("Indice Invalido");
        }else{
            String item=this.dados[i];
            for(int j=i+1; j<this.quantidade; j++){
                //a partir do indice i, os valores estão sendo jogados para o índice anterior
                this.dados[j-1]=this.dados[j];
            }
            this.dados[this.quantidade-1]=null;
            this.quantidade--;
            return item;
        }
    }
    public String removeFinal() throws IndexOutOfBoundsException{
        if(this.quantidade==0){
            throw new IndexOutOfBoundsException("Lista Vazia");
        }else{
            String item=this.dados[this.quantidade-1];
            this.dados[this.quantidade-1]=null;
            this.quantidade--;
            return item;
        }
    }
    public String getLast(){
        return dados[quantidade-1];
    }
    public String toString(){
        return Arrays.toString(dados)+ ".\nQuantidade= "+this.quantidade;
    }
    public String getDados(){
        return Arrays.toString(dados)+", ";
    }
    public static void main(String[]args){
        Tarefa2802 l=new Tarefa2802(4);
        l.add("1");
        l.add("6");
        l.add("UFSC");
        l.remove(0);
        System.out.println(l.toString());
    }
    
}



package estruturadedados;
import java.util.*;
public class FilaDeDados {
    private Integer[] dados;
    private int qtd;
    public FilaDeDados(int tamanho){
        this.dados = new Integer[tamanho];
    }
    public void add(int elemento){
        if(!(this.qtd==dados.length)){
            this.dados[this.qtd]=elemento;
            this.qtd++;
       }
    } 
    public void remove(){
    if(this.qtd==0){
    }else{
        this.dados[this.qtd-1]=null;
        this.qtd--;
        }
    }
    public String toString(){
        return Arrays.toString(dados);
    }
}

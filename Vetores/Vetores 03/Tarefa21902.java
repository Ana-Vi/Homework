package atividades;
import java.util.*;
/**
 *
 * @author avbvi
 */
public class Tarefa21902 {
    private Integer[] dados;
    private int quantidade;
    private int primeiro;
    private int ultimo;
    private int tamanho;
    
    public Tarefa21902(int tam){
        dados=new Integer[tam];
    }
    public void add(int n) {
        if(quantidade==dados.length){
            quantidade=0;
            this.dados[this.quantidade]=n;
            quantidade++;
            this.primeiro=n;
            this.ultimo=n;
        }else{
            if(quantidade==0){
                this.primeiro=n;
                this.ultimo=n;
            }
            else if(quantidade>0&&quantidade<(dados.length)-1){
                if (tamanho==dados.length){
                    this.ultimo=this.primeiro;
                }else{
                    this.ultimo=n;
                }
            }
            else{
                this.ultimo=this.primeiro;
            }
            this.dados[this.quantidade]=n;
            this.quantidade++; 
            this.tamanho++;
        }
    }
    public void remove(){
        if (quantidade>0){
            this.dados[quantidade-1]=null;
            ultimo=dados[quantidade];
            quantidade--;
            
        }
        Integer[]temp=new Integer[this.dados.length+10];
        for(int i=0;i<dados.length;i++){
            if(dados[i]==null){
                dados[i]=dados[i+1];
            }
        }
        dados[dados.length-1]=null;
    }
    public String toString(){
        return Arrays.toString(dados)+". Primeiro:"+primeiro+". Ultimo:"+ultimo+". Quantidade: "+quantidade;
    }
}

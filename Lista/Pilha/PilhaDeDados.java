package estruturadedados;
import java.util.Arrays;

public class PilhaDeDados {
    private Integer[] dados;
    private int qtd;
    
    public PilhaDeDados(int tamanho){
        this.dados = new Integer[tamanho];
    }
    public void add(int elemento){
       Integer[]temp=new Integer[this.dados.length];
       if(this.qtd<dados.length){ 
        temp[0]=elemento;
        this.qtd=0;
        for(int i=1;i<this.dados.length;i++){
            temp[i]=this.dados[i-1];
            if(!(this.dados[i-1]==null)){
                this.qtd++;
            }

        }
        this.qtd++;
        this.dados=temp;
       }
    }
    public void remove(){
        if (qtd!=0){
            for(int j=1; j<this.qtd; j++){
                //a partir do indice i, os valores estão sendo jogados para o índice anterior
                this.dados[j-1]=this.dados[j];
                }
                //tira o último valor 
                this.dados[this.qtd-1]=null;
                this.qtd--;
        }
    }
    boolean ehVazia(){
        return qtd==0;
    }
    @Override
    public String toString(){
        return Arrays.toString(dados)+ ".\nQuantidade= "+this.qtd;
    }
}

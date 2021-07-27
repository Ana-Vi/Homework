package atividades;
import java.util.*;
public class Tarefa1902 {
    private String[] dados;
    private int qtd;
    public Tarefa1902(int tamanho){
        dados=new String[tamanho];
    }
    public String getDados(){
        return Arrays.toString(dados);
    }
    public String getLast(){
        return dados[qtd-1];
    }
    public void add(String n){
        if (dados.length>qtd){
            dados[qtd]=n;
            qtd++;
        }
    }
    public static void main(Tarefa1902[]args){
        Scanner aux= new Scanner(System.in);
        int n=aux.nextInt();
        Tarefa1902 t= new Tarefa1902(n);
        for (int i=0; i<n; i++){
            String e=aux.nextLine();
            t.add(e);
        }
    }
    public void remove(){
        int cont=0;
        for(int i=0;i<dados.length;i++){
            if(dados[i]!=null && dados[i].matches("[0-9]*") && cont==0){
                cont++;
                qtd--;
                dados[i]=dados[i+1];
            }else if(i<dados.length-1){
                dados[i]=dados[i+1];
            }else{
                dados[i]=null;
            }
        }
    }
}

 
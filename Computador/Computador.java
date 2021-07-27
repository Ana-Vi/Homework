/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg202001;

/**
 *
 * @author avbvi
 */
public class Computador {
    String nomeComputador;
    String processador;
    String placaMae;
    String placaDeVideo;
    double preco;
    Computador(String nC, String pro, String pM, String pV, double p){
        this.nomeComputador=nC;
        this.placaDeVideo=pV;
        this.placaMae=pM;
        if(p<0){
            this.preco=0;
        }else{
            this.preco=p;
        }
        this.processador=pro;
    }
    @Override
    public String toString(){
        return "Nome: "+this.nomeComputador+
                ".\nPlaca Vídeo: "+this.placaDeVideo+
                ".\nPlaca Mãe: "+this.placaMae+
                ".\nProcessador: "+this.processador+
                ".\nPreço: "+String.format("%.2f",this.preco)+
                ".\n\n";
    }
    //método que não retorna nada
    public void aplicaDesconto(int porcentagem){
        double aux=this.preco*(100-porcentagem)/100;
        this.preco=aux;
    }
    
    /*
    //metodo que retorna o desconto
    public double calculaDesconto(int porcentagem){
        double aux=this.preco*(porcentagem)/100;
        return aux;
    }*/
    /*    
    //método que retorna um double
    public double aplicaValorizacao(int porcentagem){
        double aux=this.preco*(100+porcentagem)/100;
        this.preco=aux;
        return this.preco;
    }*/
}

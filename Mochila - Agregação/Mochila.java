/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avbvi
 */
public class Mochila {
    private Caderno caderno;
    private Estojo estojo;
    private double precoMochila;
    Mochila(Caderno c, Estojo e, double p){
        this.caderno = c;
        this.estojo = e;
        setPrecoMochila(p);
    }
    public void setPrecoMochila(double p){
        if (p<0){
            p=0;
        }
        this.precoMochila=p;
    }
    public double getPrecoMochila(){
        return this.precoMochila;
    }
    public double getPrecoTotal(){
        double pM=this.precoMochila;
        double pE=this.estojo.getPrecoEstojo();
        double pC=this.caderno.getPrecoCaderno();
        double sum = pM+pE+pC;
        return sum;
    }
    @Override 
    public String toString(){
        return "Mochila possui:\n"+caderno.toString()+"\n"+estojo.toString()+"\nPreço Mochila: R$"+this.getPrecoMochila()+"\nPreço Total Componentes: R$"+getPrecoTotal();
    }
}

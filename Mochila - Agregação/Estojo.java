/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avbvi
 */
public class Estojo {
    private int quantidadeMateriais;
    private int idEstojo;
    private double precoEstojo;
    Estojo(int q, int id, double p){
        setQuantidadeMateriais(q);
        setIdEstojo(id);
        setPrecoEstojo(p);
    }
    public void setQuantidadeMateriais(int q){
        if (q<0){
            q=0;
        }
        this.quantidadeMateriais = q;
    }
    public void setIdEstojo(int id){
        if (id<0){
            id=0;
        }
        this.idEstojo = id;
    }
    public void setPrecoEstojo(double p){
        if (p<0){
            p=0;
        }
        this.precoEstojo = p;
    }
    public int getQuantidadeMateriais(){
        return this.quantidadeMateriais;
    }
    public int getIdEstojo(){
        return this.idEstojo;
    }
    public double getPrecoEstojo(){
        return this.precoEstojo;
    }
    @Override
    public String toString(){
        return "Estojo{quantidadeMateriais: "+this.getQuantidadeMateriais()+", idEstojo: "+this.getIdEstojo()+", precoEstojo: R$"+ this.getPrecoEstojo()+"}";
    }        
}

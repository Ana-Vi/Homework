/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avbvi
 */
public class Caderno {
    private int numMaterias, numFolhas, idCaderno;
    private double precoCaderno;
    Caderno(int nM, int nF, int id, double pC){
        setNumMaterias(nM);
        setNumFolhas(nF);
        setIdCaderno(id);
        setPrecoCaderno(pC);
    }
    public void setNumMaterias(int nM){
        if(nM<0){
            nM=0;
        }
        this.numMaterias=nM;
    }
    public void setNumFolhas(int nF){
        if(nF<0){
            nF=0;
        }
        this.numFolhas=nF;
    }
    public void setIdCaderno(int id){
        if(id<0){
            id=0;
        }
        this.idCaderno = id;
    }
    public void setPrecoCaderno(double pC){
        if(pC<0){
            pC=0;
        }
        this.precoCaderno=pC;
    }
    public int getNumMaterias(){
        return this.numMaterias;
    }
    public int getNumFolhas(){
        return this.numFolhas;
    }
    public int getIdCaderno(){
        return this.idCaderno;
    }
    public double getPrecoCaderno(){
        return this.precoCaderno;
    }
    @Override
    public String toString(){
        return "Caderno{numMaterias: "+this.getNumMaterias()+", numFolhas: "+this.getNumFolhas()+", idCaderno: "+this.getIdCaderno()+", precoCaderno: R$"+this.getPrecoCaderno()+"}";
    }
}

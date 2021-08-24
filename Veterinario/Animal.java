package moni;

/**
 *
 * @author avbvi
 */
public class Animal {
    private double peso;
    private String especie;
    private double altura;
    private double largura;
    private String cor;
    Animal(double p, String e, double a, double l, String c){
        setPeso(p);
        setEspecie(e);
        setAltura(a);
        setLargura(l);
        setCor(c);
    }
    void setPeso(double p){
        this.peso=p;
    }
    void setEspecie(String e){
        this.especie=e;
    }
    void setAltura(double a){
        this.altura=a;
    }
    void setLargura(double l){
        this.largura=l;
    }
    void setCor(String c){
        this.cor=c;
    }
    @Override
    public String toString(){
        return "Peso: "+this.peso+".\n Espécie: "+this.especie+".\n Altura: "+this.altura+".\n Largura: "+this.largura+".\n Cor: "+this.cor;
    }
    public boolean equals(Animal a){
        if(a == this) return true;
        if(!(a instanceof Animal)){
            return false;
        }
        Animal b = (Animal) a;
            return this.altura == b.altura &&
                   this.cor == b.cor &&
                   this.especie == b.especie &&
                   this.largura == b.largura &&
                   this.peso == b.peso;
    } 
}

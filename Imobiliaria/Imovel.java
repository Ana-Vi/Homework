package pkg202001;
/**
 * @author avbvi
 */
public class Imovel {
    private int codigo, quartos;
    private double preco, area;
    private String tipo;
    Imovel(int c,double a, int q, double p, String t){
        setCodigo(c);
        setArea(a);
        setQuarto(q);
        setPreco(p);
        setTipo(t);
}
    void setCodigo(int c){
        this.codigo=c;
    }
    void setArea(double a){
        if (a<0){
            this.area=0;
        }else{
            this.area=a;
        }
    }
    void setQuarto(int q){
        if (q<0){
            this.quartos=0;
        }else{
            this.quartos=q;
        }
    }
    void setPreco(double p){
        if(p<0){
            this.preco=0;
        }else{
            this.preco=p;
        }
    }
    void setTipo(String t){
        if(t.equals("Apartamento")|| t.equals("apartamento")||t.equals("APARTAMENTO")){
            this.tipo=t;
        }else{
            this.tipo="Casa";
        }
    }
    public int getCodigo(){
        return this.codigo;
    }
    public double getArea(){
        return this.area;
    }
    public int getQuarto(){
        return this.quartos;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getTipo(){
        return this.tipo;
    }
    @Override
    public String toString(){
        return "Imóvel: "+getCodigo()+", Tipo: "+getTipo()+", Preço: "+getPreco()+", Area: "+getArea()+", Quartos: "+getQuarto()+"\n";
    }
    
}

public class Carro {
    private String nome, fabricante;
    private double motor;
    
    Carro(String n, String f, double m){
    this.nome=n;
    this.fabricante=f;
    this.motor=m;
    }
    @Override
    public String toString(){
        return "Carro: = "+this.nome+" :Fabricante = "+this.fabricante +": Motor = "+this.motor;
    }
}

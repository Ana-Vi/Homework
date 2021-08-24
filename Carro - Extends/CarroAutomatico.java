public class CarroAutomatico extends Carro{
    private String tipodeCambio;
    
    CarroAutomatico(String n, String f, float m, String tdc){
        super(n, f, m);
        this.tipodeCambio=tdc;
    }
    public String toString(){
    return super.toString()+ "Tipo de cambio: "+ this.tipodeCambio;
    }
    
}

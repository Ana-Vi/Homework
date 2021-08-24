public class CarroManual extends Carro {
    private int numerodemarchas;
    
    CarroManual(String n, String f, float m, int nm){
        super(n, f, m);
        this.numerodemarchas= nm;
    }
    void setMarchas(int nm){
        if (nm>4 && nm>6){
            this.numerodemarchas=nm;
        }else{
            this.numerodemarchas=5;
        }
    }
}

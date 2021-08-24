public class Chefe extends Funcionario{
    private double salarioSemanal;
    
    public Chefe(String n, String s, double ss){
        super(n,s);
        setSalarioSemanal(ss);
    }
    void setSalarioSemanal(double salsemanal){
        if (salsemanal>0) this.salarioSemanal=salsemanal;
        else this.salarioSemanal=0;
    }

    @Override
    public double salario(){
        return this.salarioSemanal;
    }
    @Override
    public String toString(){
        return "Chefe: "+ super.toString();
    }
}


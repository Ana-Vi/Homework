public class Comissionado extends Funcionario{
    private double salario;
    private double comissao;
    private int quantidade;
    
    public Comissionado(String n, String sn, double sal, double com, int qtd){
        super(n,sn);
        setSalario(sal);
        setComissao(com);
        setQuantidade(qtd);
    }
    public void setSalario(double s){
        this.salario=(s>0? s:0);
    }
    public void setComissao(double c){
        this.comissao=(c>0? c:0);
}
    public void setQuantidade(int q){
        this.quantidade= (q>0? q:0);
    }
    @Override
    public double salario(){
        return this.salario+this.quantidade*this.comissao;
    }
    @Override
    public String toString(){
        return "Comissionado: "+super.toString();
    }
}
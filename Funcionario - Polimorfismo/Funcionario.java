public abstract class Funcionario {
    String nome, sobrenome;
    
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public Funcionario(String n, String s){
        this.nome=n;
        this.sobrenome=s;
    }
    void setNome(String n, String s){
        this.nome=n;
        this.sobrenome=s;
    }
    @Override
    public String toString(){
        return "\nFuncionário: "+ this.nome+" "+this.sobrenome;
    }
    public abstract double salario();
    
}

public class Contato {
    private String nome;
    private int ddd, telefone;
    
    Contato(String n, int d, int t){
    this.nome=n;
    this.ddd=d;
    this.telefone=t;
    }
    @Override
    public String toString(){
    return "Nome: " + this.nome + "> Telefone: (" + this.ddd + ") " + this.telefone;
    }
}

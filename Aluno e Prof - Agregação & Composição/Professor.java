//agregação
/*
public class Professor {
    private int matricula;
    private String nome;
    private Endereco endereco;
    
    Professor(int matr, String nom, Endereco ender){
    this.matricula=matr;
    this.nome= nom;
    this.endereco= ender;
    }
    public String toString(){
        //return "String";
        //se for só o getClass ele chama tudo (class Pessoa)
        return this.getClass().getName() + ": " + this.nome + "," + this.matricula + this.endereco;
    }


}*/
public class Professor {
    private int matricula;
    private String nome;
    private Endereco endereco;
    
    Professor(int matr, String nom, String r, String c, String e, String p, int n){
    this.matricula=matr;
    this.nome= nom;
    this.endereco= new Endereco(r,c,e,p,n);
    }
    public String toString(){
        //return "String";
        //se for só o getClass ele chama tudo (class Pessoa)
        return this.getClass().getName() + ": " + this.nome + "," + this.matricula + this.endereco;
    }


}
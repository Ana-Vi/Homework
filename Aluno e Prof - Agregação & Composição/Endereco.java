/*agregação
public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String pais;
    private int numero;
    
    Endereco(String r, String c, String e, String p, int n){
    this.rua=r;
    this.cidade= c;
    this.estado= e;
    this.pais= p;
    this.numero= n;
    }
    public String toString(){
        //return "String";
        //se for só o getClass ele chama tudo (class Pessoa)
        return ". " + this.getClass().getName() + ": " + this.rua + ", " + this.numero;
    }
}
*/
//composição
public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String pais;
    private int numero;
    
    Endereco(String r, String c, String e, String p, int n){
    this.rua=r;
    this.cidade= c;
    this.estado= e;
    this.pais= p;
    this.numero= n;
    }
    public String toString(){
        //return "String";
        //se for só o getClass ele chama tudo (class Pessoa)
        return ". " + this.getClass().getName() + ": " + this.rua + ", " + this.numero;
    }
}

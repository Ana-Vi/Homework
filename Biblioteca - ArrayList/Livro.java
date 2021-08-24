public class Livro {
    private String titulo;
    private int ano;
    private String autor;
    
    Livro(String t,int an,String a){
    this.titulo=t;
    this.ano=an;
    this.autor=a;
    }
    
    public int getAno(){
    return this.ano;
    }
    public String getLivro(){
    String aux=this.titulo;
    return aux;
    }
    @Override
    public String toString(){
        return this.titulo+" "+this.ano+" "+this.autor;
    
    }
    
}

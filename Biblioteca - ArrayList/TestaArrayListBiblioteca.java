public class TestaArrayListBiblioteca {
    public static void main(String[]args){
        Biblioteca bib=new Biblioteca();
        Livro liv1= new Livro ("A", 1580, "AA");
        Livro liv2= new Livro ("Reuri póti", 1808, "JK");
        Livro liv3= new Livro ("Moça", 2000, "Dionísio");
        bib.insereLivro(liv1);
        bib.insereLivro(liv2);
        bib.insereLivro(liv3);
        
        bib.exibeLivro();
        if (bib.buscaLivro(2000)==null){
        System.out.println("Não achei");
        }else{
        System.out.println(bib.buscaLivro(2000));
    }}
}

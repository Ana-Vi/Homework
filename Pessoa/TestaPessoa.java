public class TestaPessoa {
    public static void main(String[]args){
    Pessoa p = new Pessoa();
    p.nome= "Jonas";
    p.idade= 10;
    
    //System.out.println("Idade de "+p.nome+" é: "+p.idade); caso não use o toString()
    //pessoa antes de fazer aniversário
    System.out.println(p);
    p.fazAniversario();
    //System.out.println("Idade de "+p.nome+" é: "+p.idade);
    //pessoa depois de fazer aniversário
    System.out.println(p);
    }
}

public class Pessoa {
    String nome;
    int idade;
    void fazAniversario(){
        this.idade++;
    }
    @Override
    public String toString(){
        //return "String";
        //se for só o getClass ele chama tudo (class Pessoa)
        return this.getClass().getName() + ": " + this.nome + ", idade: " + this.idade;
    }
    /*public static void main(String args[]){
    Pessoa p1= new Pessoa();
    p1.nome= "Joao";
    p1.idade= 10;
    p1.fazAniversario();
    System.out.println("Idade de João é: "+p1.idade);
    }

*/
}
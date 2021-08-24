//agregação
/*public class TestaEstudante {
    public static void main(String[]args){
    Endereco casa= new Endereco("Av. Getulio Vargas", "Ararangua", "SC", "Brasil", 1851);
    Estudante aluno= new Estudante(17202781, "Ana Vitoria", casa);
    System.out.println(aluno);
    Endereco pcasa= new Endereco("Rua Albino Pereira de Souza", "Ararangua", "SC", "Brasil", 1500);
    Professor pessoa= new Professor(20202781, "Carolina Pires", pcasa);
    System.out.println(pessoa);
    }
}*/

// composição
public class TestaEstudante {
    public static void main(String[]args){
    Estudante aluno= new Estudante(17202781, "Ana Vitoria", "Av. Getulio Vargas", "Ararangua", "SC", "Brasil", 1851);
    System.out.println(aluno);
    Professor prof= new Professor(20202781, "Carolina Pires", "Rua Albino Pereira de Souza", "Ararangua", "SC", "Brasil", 1500);
    System.out.println(prof);
    }
}
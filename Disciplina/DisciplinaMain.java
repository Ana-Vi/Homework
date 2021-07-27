package pkg202001;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Ana Vitória Barbosa Mariano
 */
public class DisciplinaMain {
    public static void main(String[]args) throws IOException{
        Disciplina d= new Disciplina();
        Scanner aux= new Scanner(System.in);
        d.carregaDoArquivo();
        System.out.println("Ola bom dia, o que deseja fazer? Digite o número da operação");
        boolean on= true;
        while (on==true){
            System.out.println("1.Cadastrar um novo estudante \n2.Alterar Dados \n3.Remover Estudante Cadastrado \n4.Consultar estudante\n5.Listar os estudantes de uma disciplina \n6.Listar Estudantes com média abaixo de 6\n7.Listar Estudantes com média acima de 6\n8.Exibir média da turma\n9.Sair");
            int ordem= aux.nextInt();
            switch(ordem){
                case 1:
                    Scanner aux2= new Scanner(System.in);
                    double n1,n2;
                    String n, c, m;
                    System.out.println("Digite o nome: ");
                    n=aux2.nextLine();
                    System.out.println("Digite o CPF: ");
                    c=aux2.nextLine();
                    System.out.println("Digite a matricula: ");
                    m=aux2.nextLine();
                    System.out.println("Digite a nota01: ");
                    n1=aux2.nextDouble();
                    System.out.println("Digite a nota02: ");
                    n2=aux2.nextDouble();
                    Estudante estudante= new Estudante (n,c,m,n1,n2);
                    d.insereEstudante(estudante);
                    break;
                case 2:
                    Scanner aux3= new Scanner(System.in);
                    System.out.println("Digite a matricula a ser Alterada: ");
                    m=aux3.nextLine();
                    System.out.println("Digite o nome: ");
                    n=aux3.nextLine();
                    System.out.println("Digite o CPF: ");
                    c=aux3.nextLine();
                    System.out.println("Digite a nota01: ");
                    n1=aux3.nextDouble();
                    System.out.println("Digite a nota02: ");
                    n2=aux3.nextDouble();
                    estudante= new Estudante (n,c,m,n1,n2);
                    d.alteraEstudante(estudante);
                    break;
                    
                case 3:
                    Scanner auxc3= new Scanner(System.in);
                    int ordemdel;
                    System.out.println("Deseja deletar: \n1.Todos os Alunos \n2.Apenas um");
                    ordemdel=auxc3.nextInt();
                    if (ordemdel==1){
                        d.deletaTodos();
                    }else{
                        Scanner auxdel= new Scanner(System.in);
                        String mat;
                        System.out.println("Digite a matrícula do aluno a ser removido: ");
                        mat=auxdel.nextLine();
                        d.removeEstudante(mat);
                        
                    }
                    break;
                
                case 4:
                    Scanner aux4= new Scanner(System.in);
                    String mat;
                    System.out.println("Digite a matrícula do aluno a consultado: ");
                    mat=aux4.nextLine();
                    d.getEstudante(mat);
                    System.out.println("--------------------------------");
                    break;
                    
                case 5:
                    d.listarEstudantes();
                    break;
                    
                case 6:
                    d.listarEstudanteAbaixo6();
                    System.out.println("--------------------------------");
                    break;
                    
                case 7:
                    d.listarEstudanteAcima6();
                    System.out.println("--------------------------------");
                    break;
                    
                case 8:
                    System.out.println(d.mediaTurma());
                    System.out.println("--------------------------------");
                    break;
                    
                case 9:
                    System.out.println("Obrigada pelo seu tempo, tenha um ótimo dia.");
                    d.gravaArquivo();
                    aux.close();
                    on=false;
                    break;
                    
                default:
                    System.out.println("Comando incorreto.");
                    System.out.println("--------------------------------");
                    break;
            }
        }
    }
}

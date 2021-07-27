package pkg202001;
import java.util.*;
import java.io.*;
/**
 *
 * @author Ana Vitória Barbosa Mariano
 */
public class Disciplina {
    private ArrayList<Estudante>turma;
    Disciplina(){
        turma=new ArrayList<>();
    }
    public String LinhaInserida(){
        return "------------------------------------------";
    }
    public ArrayList getTurma(){
        return turma;
    }
    void listarEstudantes(){
        if(turma.size()==0){
            System.out.println("Sem alunos para exibir");
            System.out.println(LinhaInserida());
        }else{
            System.out.println("Turma encontrada com sucesso!");
            for (Estudante item:turma){
            System.out.println(item);
            System.out.println(LinhaInserida());
            
            }
        }
    }
    public double mediaTurma(){
        if(turma.size()==0){
            return 0;
        }else{
            double soma=0;
            for (Estudante item:turma){
                soma= soma+item.getMedia();
            }
            return soma/turma.size();
        }
    }
    void getEstudante(String mt){
        if(turma.size()==0){
            System.out.println("Sem alunos para procurar");
        }else{
            int cont=0;
            for(Estudante item:turma){
                if (item.getMatricula().equals(mt)){
                    System.out.println("Aluno encontrado com Sucesso");
                    System.out.println(item);
                    cont++;
                }
            }if (cont==0){
                System.out.println("Aluno com essa matrícula não Encontrado");
            }
        }
    }
    void insereEstudante(Estudante a){
        boolean naotem=true;
        for(Estudante item:turma){
            if (item.getMatricula().equals(a.getMatricula())){
                naotem=false;
                break;
            }else{
                naotem=true;
            }
        }
        if (naotem==true){
            turma.add(a);
            System.out.println("Aluno Cadastrado com Sucesso");
        }else{
            System.out.println("Já existe cadastro com essa Matrícula, por favor tente de novo com outra matrícula");
        }
    }
    void alteraEstudante(Estudante a){
    if (turma.size()==0){
            System.out.println("Sem cadastro para alterar");
        }else{
            int cont=0;
            for (int i=0; i<turma.size();i++){
                Estudante al=turma.get(i);
                if(al.getMatricula().equals(a.getMatricula())){
                    turma.set(i,a);
                    System.out.println("Alterada com sucesso");
                    cont++;
                }
            }if (cont==0){
                System.out.println("Não encontramos essa matrícula para poder alterar");
            }
        }
    }
    void deletaTodos(){
        if(turma.size()==0){
            System.out.println("Sem cadastro para deletar");
            System.out.println("--------------------------------");
        }else{
            turma.removeAll(turma);
            System.out.println("Turma Zerada com Sucesso");
            System.out.println("--------------------------------");
        }
    }
    void removeEstudante(String mt){
        if (turma.size()==0){
            System.out.println("Sem cadastro para deletar");
            System.out.println("--------------------------------");
        }else{
            int cont=0;
            for (int i=0; i<turma.size();i++){
                Estudante del=turma.get(i);
                if(del.getMatricula().equals(mt)){
                    turma.remove(del);
                    System.out.println("Cadastro Excluído com sucesso");
                    System.out.println("--------------------------------");
                    cont++;
                }
            }if (cont==0){
                System.out.println("Matricula Não Encontrada");
                System.out.println("--------------------------------");
            }
        }
    }
    void listarEstudanteAcima6(){
        if(turma.size()==0){
            System.out.println("Sem alunos para listar");
        }else{
            int cont=0;
            for(Estudante item:turma){
                if (item.getMedia()>6){
                    System.out.println("Aluno encontrado com Sucesso");
                    System.out.println(item);
                    cont++;
                }
            }if (cont==0){
                System.out.println("Sem alunos com média acima de 6");
            }
        }
    }
    void listarEstudanteAbaixo6(){
        if(turma.size()==0){
            System.out.println("Sem alunos para listar");
        }else{
            int cont=0;
            for(Estudante item:turma){
                if (item.getMedia()<6){
                    System.out.println("Aluno encontrado com Sucesso");
                    System.out.println(item);
                    cont++;
                }
            }if (cont==0){
                System.out.println("Sem alunos com média abaixo de 6");
            }
        }
    }
    void carregaDoArquivo() throws IOException{
        File f = new File("estudante.csv");
        if(f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linha = null;
            while ((linha = br.readLine())!= null) {
                Estudante e=new Estudante();
                e.setEstudanteCSV(linha);
                turma.add(e);

            }
            fr.close();
        }else{
            FileWriter fw = new FileWriter(f);
        }
        
    }
    void gravaArquivo() throws IOException{
        File f = new File("estudante.csv");
        if(turma.size()==0){
            f.delete();
        }else{
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            for(Estudante item:turma){
                pw.println(item.getEstudanteCSV());
                
            }
            pw.close();
            fw.close();
        }
    }
}

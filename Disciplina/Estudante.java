package pkg202001;
/**
 *
 * @author Ana Vitória Barbosa Mariano
 */
public class Estudante extends Pessoa {
    private String matricula;
    private double nota01, nota02;
    Estudante(String n, String c, String m, double n1, double n2){
        super(n,c);
        setMatricula(m);
        setNota01(n1);
        setNota02(n2);
    }
    Estudante(){
        super(null,null);
    }
    void setMatricula(String mt){
        this.matricula= mt;
    }
    void setNota01(double nt1){
        if( nt1>=0 && nt1<=10){
            this.nota01=nt1;
        }else{
            this.nota01=0;
        }
    }
    void setNota02(double nt2){
        if( nt2>=0 && nt2<=10){
            this.nota02=nt2;
        }else{
            this.nota02=0;
        }
    }
    public String getMatricula(){
        return this.matricula;
    } 
    public double getNota01(){
        return this.nota01;
    }
    public double getNota02(){
        return this.nota02;
    }
    public double getMedia(){
        return ((this.nota01+this.nota02)/2);
    }
    public String getEstudanteCSV(){
        return super.getNome()+";"+super.getCpf()+";"+this.matricula +";"+this.nota01+";"+this.nota02;
    }
    void setEstudanteCSV(String linha){
        String[] dados = new String[5];
        dados = linha.split(";");
        super.setNome(dados[0]);
        super.setCpf(dados[1]);
        this.setMatricula(dados[2]);
        this.setNota01(Double.parseDouble(dados[3]));
        this.setNota02(Double.parseDouble(dados[4]));
    }
    @Override 
    public String toString(){
        return "Aluno:"+super.getNome()+". Matrícula: "+getMatricula()+". Nota01: "+this.nota01+". Nota02: "+this.nota02+". Média:"+getMedia();
    }
}

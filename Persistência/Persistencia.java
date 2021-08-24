import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Persistencia {
    public static void main (String[]args) throws IOException {
    File arquivo=new File("C:\\Users\\avbvi\\Desktop\\FACULDADE\\Programação Java\\arquivo.txt");
    FileWriter fw = new FileWriter(arquivo, true);
    BufferedWriter bw = new BufferedWriter(fw);//deixa mais veloz
    //fw.write("oi sumida \n"); escreve, o true aumenta em vez de reescrever do zero
    PrintWriter pw= new PrintWriter(bw);
    //PrintWriter pw= new PrintWriter(fw);//sem bw
    pw.println("oi gata");
    pw.close();
    
    fw.close();
    //para abertura e leitura
    FileReader fr = new FileReader(arquivo);//abre o arquivo
    BufferedReader br = new BufferedReader(fr);//deixa mais veloz
    String linha = null;//força a parada qndo a linha estiver nula (nada escrito)
    int i = 0;//contagem das linhas opcional
    while ((linha = br.readLine()) != null) {
        System.out.println("Linha " + i + "->" + linha);
        i++;
    }
        
    fr.close();
        
}
}